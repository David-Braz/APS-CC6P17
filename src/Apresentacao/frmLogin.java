/*
 * Created by JFormDesigner on Tue Oct 22 08:25:05 BRT 2024
 */

package Apresentacao;

import DAL.Caracteristicas;
import Modelo.Controle;
import Modelo.Estatico;
import Modelo.OpenCan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author DAVID
 */
public class frmLogin extends JFrame implements ActionListener {
    private OpenCan openCan;
    private String Olhos, Nariz;
    public frmLogin() {
        initComponents();
        openCan = new OpenCan();
        new Thread(() -> openCan.openWebcam(lblImg)).start();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - David Braz da Silva
        lblImg = new JLabel();
        btnLogin = new JButton();
        btnCancelar = new JButton();
        btnCadastrar = new JButton();

        //======== this ========
        setTitle("LOGIN");
        var contentPane = getContentPane();

        //---- btnLogin ----
        btnLogin.setText("LOGIN");
        btnLogin.setBackground(Color.green);

        //---- btnCancelar ----
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBackground(Color.red);

        //---- btnCadastrar ----
        btnCadastrar.setText("CADASTRAR");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btnCadastrar, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75)
                            .addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(79, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        btnCadastrar.addActionListener(this);
        btnCancelar.addActionListener(this);
        btnLogin.addActionListener(this);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - David Braz da Silva
    private JLabel lblImg;
    private JButton btnLogin;
    private JButton btnCancelar;
    private JButton btnCadastrar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private int Usuario;
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            Caracteristicas car = new Caracteristicas();
            if(car.CompararCaracteristicas(openCan.getP_Olhos(), openCan.getP_Nariz())){
                JOptionPane.showMessageDialog(null, car.mensagem);
                Usuario = car.idUser;
                openCan.stopWebcam();
                dispose();
                frmPrincipal frm = new frmPrincipal(Usuario);
                frm.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, car.mensagem);
            }
        }
        if (e.getSource() == btnCancelar) {
            System.exit(0);
        }
        if (e.getSource() == btnCadastrar) {
            openCan.stopWebcam();
            openCan.closeCamera();
            frmCadUser frm = new frmCadUser();
            frm.setVisible(true);
        }
    }
}
