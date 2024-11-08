package DAL;

import org.opencv.core.Point;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Caracteristicas {
    public String mensagem;
    public int idUser;
    public Boolean SalvarCaracteristicas(int idUser, String Olhos, String Nariz){
        this.mensagem = "";
        try {
            Connection con = Conexao.getConnection();
            String sql = "INSERT INTO caracteristicas (IdUsuario, Olhos, Nariz) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idUser);
            ps.setString(2, Olhos);
            ps.setString(3, Nariz);
            ps.execute();
            ps.close();
            con.close();
            this.mensagem = "Usuario cadastrado com sucesso!";
            return true;
        } catch (Exception e) {
            this.mensagem = e.getMessage();
            return false;
        }
    }
    public Boolean CompararCaracteristicas(Point Olhos, Point Nariz){
        this.mensagem = "";

        try {
            Connection con = null;
            con = Conexao.getConnection();
            String Query = "SELECT IdUsuario,Olhos,Nariz FROM caracteristicas";
            PreparedStatement stmt = con.prepareStatement(Query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                idUser = rs.getInt("IdUsuario");
                // Se o ResultSet tiver pelo menos um registro
                Point OlhosBD = stringToPoint(rs.getString("Olhos"));
                Point NarizBD = stringToPoint(rs.getString("Nariz"));
                double distanciaOlhos = Math.sqrt(Math.pow(Olhos.x - OlhosBD.x, 2) + Math.pow(Olhos.y - OlhosBD.y, 2));
                double distanciaNariz = Math.sqrt(Math.pow(Nariz.x - NarizBD.x, 2) + Math.pow(Nariz.y - NarizBD.y, 2));
                if (distanciaOlhos < 80 && distanciaNariz < 60) {
                    mensagem = "Usuário Liberado!";
                    return true;
                }
                mensagem = "Usuário não Liberado!";
            }
        } catch (Exception e) {
            mensagem = "Erro ao buscar usuário: " + e.getMessage();
        }
        return false;
    }
    private static Point stringToPoint(String str) {
        str = str.replace("{", "").replace("}", "");
        String[] parts = str.split(",");
        double x = Double.parseDouble(parts[0].trim());
        double y = Double.parseDouble(parts[1].trim());
        return new Point(x, y);
    }
}
