package Modelo;

import org.opencv.core.*;
import org.opencv.core.Point;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class OpenCan {

    private volatile boolean running = false;
    private BufferedImage ImgSalva;
    private String MatOlhos;
    private String MatNariz;
    private Point P_Olhos;
    private Point P_Nariz;
    public void openWebcam(JLabel imageLabel) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        VideoCapture camera = new VideoCapture(0);
        Mat frame = new Mat();
        if (!camera.isOpened()) {
            System.out.println("Camera não Localizada!");
            return;
        }
        CascadeClassifier Rosto = new CascadeClassifier("src/data/haarcascades/haarcascade_frontalface_alt.xml");
        if (Rosto.empty()) {
            System.out.println("Erro ao carregar o classificador de rosto!");
            return;
        }
        CascadeClassifier Olhos = new CascadeClassifier("src/data/haarcascades_cuda/haarcascade_eye.xml");
        CascadeClassifier Nariz = new CascadeClassifier("src/data/faces/haarcascade_nose.xml");
        running = true;

        while (running) {
            if (camera.read(frame)) {
                Mat cinza = new Mat();
                Imgproc.cvtColor(frame, cinza, Imgproc.COLOR_BGR2GRAY);

                MatOfRect faces = new MatOfRect();
                Rosto.detectMultiScale(cinza, faces);
                if (faces.toArray().length == 0) {
                    System.out.println("Nenhum rosto detectado!");
                }
                for (Rect face : faces.toArray()) {
                    Imgproc.rectangle(frame, face.tl(), face.br(), new Scalar(0, 255, 0), 2);

                    Mat faceROI = cinza.submat(face);
                    MatOfRect eyes = new MatOfRect();
                    Olhos.detectMultiScale(faceROI, eyes);
                    if (eyes.toArray().length == 2) {
                        for (Rect eye : eyes.toArray()) {
                            Point eyeCenter = new Point(face.x + eye.x + (double) eye.width / 2, face.y + eye.y + (double) eye.height / 2);
                            Imgproc.circle(frame, eyeCenter, 3, new Scalar(255, 0, 0), -1);
                            MatOlhos = eyeCenter.toString();
                            P_Olhos = eyeCenter;
                        }
                    }

                    MatOfRect noses = new MatOfRect();
                    Nariz.detectMultiScale(faceROI, noses);
                    if (noses.toArray().length == 1) {
                        for (Rect nose : noses.toArray()) {
                            Point noseCenter = new Point(face.x + nose.x + (double) nose.width / 2, face.y + nose.y + (double) nose.height / 2);
                            Imgproc.circle(frame, noseCenter, 3, new Scalar(0, 255, 255), -1);
                            MatNariz = noseCenter.toString();
                            P_Nariz = noseCenter;
                        }
                    }
                }

                BufferedImage bufferedImage = matToBufferedImage(frame);
                BufferedImage resizedImage = CentralizarImg(bufferedImage, imageLabel.getWidth(), imageLabel.getHeight());
                ImageIcon image = new ImageIcon(resizedImage);
                imageLabel.setIcon(image);
                imageLabel.repaint();
                ImgSalva = matToBufferedImage(frame);
            }
        }
        camera.release();
    }

    public void stopWebcam() {
        running = false;

    }

    private BufferedImage matToBufferedImage(Mat mat) {
        int type = BufferedImage.TYPE_BYTE_GRAY;
        if (mat.channels() > 1) {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }
        int bufferSize = mat.channels() * mat.cols() * mat.rows();
        byte[] buffer = new byte[bufferSize];
        mat.get(0, 0, buffer);
        BufferedImage image = new BufferedImage(mat.cols(), mat.rows(), type);
        final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        System.arraycopy(buffer, 0, targetPixels, 0, buffer.length);
        return image;
    }




    public void SaveRosto(String fileNamePrefix) {
    if (ImgSalva == null) {
        System.out.println("Erro ao Salvar Imagem!!");
        return;
    }
    try {
        File outputfile = new File("src/resources/in/" + fileNamePrefix);
        ImageIO.write(ImgSalva, "png", outputfile);
    } catch (IOException e) {
        System.out.println("Erro ao Salvar Imagem!!");
    }

    }

    // Metodo que eu utilizo para redimensionar a imagem
    private BufferedImage CentralizarImg(BufferedImage originalImage, int targetWidth, int targetHeight) {
        Image imgProcesse = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT);
        BufferedImage imgGerada = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = imgGerada.createGraphics();
        g2d.drawImage(imgProcesse, 0, 0, null);
        g2d.dispose();
        return imgGerada;
    }

    public Mat bufferedImageToMat(BufferedImage bi) {
        Mat mat = new Mat(bi.getHeight(), bi.getWidth(), CvType.CV_8UC3);
        byte[] data = ((DataBufferByte) bi.getRaster().getDataBuffer()).getData();
        mat.put(0, 0, data);
        return mat;
    }
    public void ConverterParaCinza() {
        File directory = new File("src/resources/in/");
        File[] filesArray = directory.listFiles();
        try{
            for (File file : Objects.requireNonNull(filesArray)) {
                BufferedImage image = ImageIO.read(file);
                Mat mat = bufferedImageToMat(image);
                Mat cinza = new Mat();
                Imgproc.cvtColor(mat, cinza, Imgproc.COLOR_BGR2GRAY);
                BufferedImage imgCinza = matToBufferedImage(cinza);
                File outputfile = new File("src/resources/out/" + file.getName());
                ImageIO.write(imgCinza, "png", outputfile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getMatOlhos() {
        return MatOlhos;
    }

    public String getMatNariz() {
        return MatNariz;
    }

    public Point getP_Olhos() {
        return P_Olhos;
    }

    public Point getP_Nariz() {
        return P_Nariz;
    }
}