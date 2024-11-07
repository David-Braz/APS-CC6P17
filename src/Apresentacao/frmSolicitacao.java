/*
 * Created by JFormDesigner on Thu Nov 07 13:44:03 BRT 2024
 */

package Apresentacao;

import Modelo.Controle;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author DAVID
 */
public class frmSolicitacao extends JFrame implements ActionListener {
    public frmSolicitacao() {
        initComponents();
        btnAlterar.addActionListener(this);
        btnCancelar.addActionListener(this);
        btnExcluir.addActionListener(this);
        btnNovo.addActionListener(this);
        btnPrimeiro.addActionListener(this);
        btnSalvar.addActionListener(this);
        btnUltimo.addActionListener(this);
        btnAvancar.addActionListener(this);
        btnVoltar.addActionListener(this);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - David Braz da Silva
        label5 = new JLabel();
        label1 = new JLabel();
        txfPedido = new JTextField();
        label3 = new JLabel();
        txfProduto = new JTextField();
        label4 = new JLabel();
        txfQuantidade = new JTextField();
        label7 = new JLabel();
        txfDepartamento = new JTextField();
        label6 = new JLabel();
        txfSituacao = new JTextField();
        btnPrimeiro = new JButton();
        btnVoltar = new JButton();
        btnAvancar = new JButton();
        btnUltimo = new JButton();
        btnSalvar = new JButton();
        btnAlterar = new JButton();
        btnExcluir = new JButton();
        btnCancelar = new JButton();
        btnNovo = new JButton();
        label2 = new JLabel();
        txfData = new JTextField();

        //======== this ========
        var contentPane = getContentPane();

        //---- label5 ----
        label5.setText("SOLICITA\u00c7\u00c3O DE COMPRA");
        label5.setFont(new Font("Arial", Font.BOLD, 20));
        label5.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label1 ----
        label1.setText("N\u00famero do Pedido:");
        label1.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfPedido ----
        txfPedido.setFont(new Font("Arial", Font.PLAIN, 15));
        txfPedido.setBorder(new LineBorder(Color.black, 2, true));

        //---- label3 ----
        label3.setText("Descri\u00e7\u00e3o do Produto:");
        label3.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfProduto ----
        txfProduto.setFont(new Font("Arial", Font.PLAIN, 15));
        txfProduto.setBorder(new LineBorder(Color.black, 2, true));

        //---- label4 ----
        label4.setText("Quantidade:");
        label4.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfQuantidade ----
        txfQuantidade.setFont(new Font("Arial", Font.PLAIN, 15));
        txfQuantidade.setBorder(new LineBorder(Color.black, 2, true));

        //---- label7 ----
        label7.setText("Departamento:");
        label7.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfDepartamento ----
        txfDepartamento.setFont(new Font("Arial", Font.PLAIN, 15));
        txfDepartamento.setBorder(new LineBorder(Color.black, 2, true));

        //---- label6 ----
        label6.setText("Situa\u00e7\u00e3o:");
        label6.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfSituacao ----
        txfSituacao.setFont(new Font("Arial", Font.PLAIN, 15));
        txfSituacao.setBorder(new LineBorder(Color.black, 2, true));

        //---- btnPrimeiro ----
        btnPrimeiro.setIcon(new ImageIcon(getClass().getResource("/Icones/pri.png")));

        //---- btnVoltar ----
        btnVoltar.setIcon(new ImageIcon(getClass().getResource("/Icones/voltarr.png")));

        //---- btnAvancar ----
        btnAvancar.setIcon(new ImageIcon(getClass().getResource("/Icones/avan.png")));

        //---- btnUltimo ----
        btnUltimo.setIcon(new ImageIcon(getClass().getResource("/Icones/ult.png")));

        //---- btnSalvar ----
        btnSalvar.setIcon(new ImageIcon(getClass().getResource("/Icones/salva.png")));

        //---- btnAlterar ----
        btnAlterar.setIcon(new ImageIcon(getClass().getResource("/Icones/alt.png")));

        //---- btnExcluir ----
        btnExcluir.setIcon(new ImageIcon(getClass().getResource("/Icones/excluir.png")));

        //---- btnCancelar ----
        btnCancelar.setIcon(new ImageIcon(getClass().getResource("/Icones/cancela.png")));

        //---- btnNovo ----
        btnNovo.setIcon(new ImageIcon(getClass().getResource("/Icones/add.png")));

        //---- label2 ----
        label2.setText("Data da Solicita\u00e7\u00e3o:");
        label2.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfData ----
        txfData.setFont(new Font("Arial", Font.PLAIN, 15));
        txfData.setBorder(new LineBorder(Color.black, 2, true));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txfPedido, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txfData, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                .addComponent(btnPrimeiro, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAvancar, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimo, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNovo, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txfProduto, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txfDepartamento, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(txfSituacao, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfQuantidade, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(17, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfPedido, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfData, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
                    .addGap(65, 65, 65)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txfProduto, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfQuantidade, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
                    .addGap(60, 60, 60)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfDepartamento, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfSituacao, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(37, 37, 37)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnPrimeiro, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAvancar, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUltimo, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNovo, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(42, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - David Braz da Silva
    private JLabel label5;
    private JLabel label1;
    private JTextField txfPedido;
    private JLabel label3;
    private JTextField txfProduto;
    private JLabel label4;
    private JTextField txfQuantidade;
    private JLabel label7;
    private JTextField txfDepartamento;
    private JLabel label6;
    private JTextField txfSituacao;
    private JButton btnPrimeiro;
    private JButton btnVoltar;
    private JButton btnAvancar;
    private JButton btnUltimo;
    private JButton btnSalvar;
    private JButton btnAlterar;
    private JButton btnExcluir;
    private JButton btnCancelar;
    private JButton btnNovo;
    private JLabel label2;
    private JTextField txfData;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()== btnSalvar){
            Controle controle = new Controle();
            controle.SolicitacaoCompra(txfProduto.getText(), Integer.parseInt(txfQuantidade.getText()), txfDepartamento.getText(), txfData.getText(), txfSituacao.getText());
            JOptionPane.showMessageDialog(null, controle.mensagem);
        }

    }
}
