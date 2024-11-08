/*
 * Created by JFormDesigner on Thu Nov 07 10:45:35 BRT 2024
 */

package Apresentacao;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

import Modelo.Controle;
import Modelo.OpenCan;
import com.jgoodies.forms.factories.*;

/**
 * @author DAVID
 */
public class frmCadUser extends JFrame implements ActionListener {
    private int Privilegio;
    private OpenCan openCan;
    private String Olhos, Nariz,Cargo;
    public frmCadUser() {
        initComponents();
        openCan = new OpenCan();
        btnSalvar.addActionListener(this);
        btnVoltar.addActionListener(this);
        btnIniciar.addActionListener(this);
        btnCapturar.addActionListener(this);
        cbxDepartamento.addActionListener(this);
        cbxDepartamento.addItem("Solicitante");
        cbxDepartamento.addItem("Orçamentista");
        cbxDepartamento.addItem("Gerente de Compras");

        txfEmail.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txfEmail.setText("");
            }
        });
    }

    private void txfEmail(ActionEvent e) {
        // TODO add your code here
    }

  



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - David Braz da Silva
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        label1 = new JLabel();
        txfNome = new JTextField();
        label2 = new JLabel();
        txfEmail = new JTextField();
        label3 = new JLabel();
        cbxDepartamento = new JComboBox();
        label5 = new JLabel();
        separator1 = compFactory.createSeparator("");
        btnSalvar = new JButton();
        btnVoltar = new JButton();
        lblImagem = new JLabel();
        btnIniciar = new JButton();
        btnCapturar = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Nome do Usu\u00e1rio");
        label1.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfNome ----
        txfNome.setFont(new Font("Arial", Font.PLAIN, 15));
        txfNome.setBorder(new LineBorder(Color.black, 2, true));

        //---- label2 ----
        label2.setText("Email");
        label2.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfEmail ----
        txfEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        txfEmail.setBorder(new LineBorder(Color.black, 2, true));
        txfEmail.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txfEmail.setText("exemplo@teste.com.br");
        txfEmail.addActionListener(e -> txfEmail(e));

        //---- label3 ----
        label3.setText("Cargo");
        label3.setFont(new Font("Arial", Font.BOLD, 15));

        //---- cbxDepartamento ----
        cbxDepartamento.setFont(new Font("Arial", Font.BOLD, 15));
        cbxDepartamento.setBorder(new LineBorder(Color.black, 2, true));

        //---- label5 ----
        label5.setText("CADASTRO DE USU\u00c1RIO");
        label5.setFont(new Font("Arial", Font.BOLD, 20));
        label5.setHorizontalAlignment(SwingConstants.CENTER);

        //---- btnSalvar ----
        btnSalvar.setText("SALVAR");
        btnSalvar.setFont(new Font("Arial", Font.BOLD, 14));
        btnSalvar.setEnabled(false);

        //---- btnVoltar ----
        btnVoltar.setText("VOLTAR");
        btnVoltar.setFont(new Font("Arial", Font.BOLD, 14));
        btnVoltar.setActionCommand("SALVAR");

        //---- lblImagem ----
        lblImagem.setBorder(new TitledBorder(new LineBorder(Color.black, 2, true), "Imagem para Salvar", TitledBorder.LEADING, TitledBorder.TOP,
            new Font("Arial Black", Font.BOLD, 11), Color.black));

        //---- btnIniciar ----
        btnIniciar.setText("INICIAR");
        btnIniciar.setFont(new Font("Arial", Font.BOLD, 14));

        //---- btnCapturar ----
        btnCapturar.setText("CAPTURAR");
        btnCapturar.setFont(new Font("Arial", Font.BOLD, 14));
        btnCapturar.setActionCommand("SALVAR");
        btnCapturar.setEnabled(false);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(separator1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 810, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnIniciar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addGap(212, 212, 212)
                            .addComponent(btnCapturar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblImagem, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txfEmail)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txfNome)
                        .addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                        .addComponent(cbxDepartamento, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                    .addGap(23, 23, 23))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txfNome, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txfEmail, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cbxDepartamento, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(lblImagem, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)))
                    .addGap(86, 86, 86)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIniciar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCapturar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(68, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - David Braz da Silva
    private JLabel label1;
    private JTextField txfNome;
    private JLabel label2;
    private JTextField txfEmail;
    private JLabel label3;
    private JComboBox cbxDepartamento;
    private JLabel label5;
    private JComponent separator1;
    private JButton btnSalvar;
    private JButton btnVoltar;
    private JLabel lblImagem;
    private JButton btnIniciar;
    private JButton btnCapturar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == cbxDepartamento){
            Privilegio = cbxDepartamento.getSelectedIndex();
            Cargo = Objects.requireNonNull(cbxDepartamento.getSelectedItem()).toString();
        }
        if(e.getSource() == btnIniciar){
            new Thread(() -> openCan.openWebcam(lblImagem)).start();
            btnIniciar.setEnabled(false);
            btnCapturar.setEnabled(true);
        }
        if(e.getSource() == btnCapturar){
            openCan.stopWebcam();
            Olhos = openCan.getMatOlhos();
            Nariz = openCan.getMatNariz();
            btnIniciar.setEnabled(true);
            btnCapturar.setEnabled(false);
            btnSalvar.setEnabled(true);
        }
        if(e.getSource() == btnSalvar){
            Controle controle = new Controle();
            controle.SalvarUser(txfNome.getText(),txfEmail.getText(),Cargo,Privilegio,Olhos, Nariz);
            JOptionPane.showMessageDialog(null, controle.mensagem);
        }
    }
}
