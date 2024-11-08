/*
 * Created by JFormDesigner on Fri Nov 08 15:28:11 BRT 2024
 */

package Apresentacao;

import DAL.Conexao;
import Modelo.Controle;
import Modelo.Solicitacao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.naming.ldap.Control;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author DAVID
 */
public class frmAprovacao extends JFrame implements ActionListener {
    private Map<String, Integer> SolicitacaoParaIdMap;
    private int idSolicitacao;
    public frmAprovacao() {
        initComponents();
        if(idSolicitacao != 0){
            Controle controle = new Controle();
            try {
                Solicitacao solicitacao = new Solicitacao();
                solicitacao.puxarRegistro(idSolicitacao);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - David Braz da Silva
        label8 = new JLabel();
        label3 = new JLabel();
        txfEmpresa1 = new JTextField();
        label9 = new JLabel();
        txfData = new JTextField();
        label4 = new JLabel();
        txfOrcamento1 = new JTextField();
        label5 = new JLabel();
        txfEconomia = new JTextField();
        btnAprovar = new JButton();
        btnCancelar = new JButton();
        label10 = new JLabel();
        txfProduto = new JTextField();
        cbxSolict = new JComboBox();
        label6 = new JLabel();
        txfQuantidade = new JTextField();

        //======== this ========
        setTitle("APROVA\u00c7\u00c3O");
        var contentPane = getContentPane();

        //---- label8 ----
        label8.setText("Solicita\u00e7\u00e3o:");
        label8.setFont(new Font("Arial", Font.BOLD, 15));

        //---- label3 ----
        label3.setText("Empresa:");
        label3.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfEmpresa1 ----
        txfEmpresa1.setFont(new Font("Arial", Font.PLAIN, 15));
        txfEmpresa1.setBorder(new LineBorder(Color.black, 2, true));

        //---- label9 ----
        label9.setText("Data do Pedido:");
        label9.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfData ----
        txfData.setFont(new Font("Arial", Font.PLAIN, 15));
        txfData.setBorder(new LineBorder(Color.black, 2, true));

        //---- label4 ----
        label4.setText("Valor do Or\u00e7amento:");
        label4.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfOrcamento1 ----
        txfOrcamento1.setFont(new Font("Arial", Font.PLAIN, 15));
        txfOrcamento1.setBorder(new LineBorder(Color.black, 2, true));

        //---- label5 ----
        label5.setText("Economia:");
        label5.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfEconomia ----
        txfEconomia.setFont(new Font("Arial", Font.PLAIN, 15));
        txfEconomia.setBorder(new LineBorder(Color.black, 2, true));

        //---- btnAprovar ----
        btnAprovar.setIcon(new ImageIcon(getClass().getResource("/Icones/icons8-aprovado-48.png")));

        //---- btnCancelar ----
        btnCancelar.setIcon(new ImageIcon(getClass().getResource("/Icones/icons8-excluir-48.png")));

        //---- label10 ----
        label10.setText("Produto:");
        label10.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfProduto ----
        txfProduto.setFont(new Font("Arial", Font.PLAIN, 15));
        txfProduto.setBorder(new LineBorder(Color.black, 2, true));

        //---- cbxSolict ----
        cbxSolict.setFont(new Font("Arial", Font.BOLD, 15));
        cbxSolict.setBorder(new LineBorder(Color.black, 2, true));

        //---- label6 ----
        label6.setText("Quantidade:");
        label6.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfQuantidade ----
        txfQuantidade.setFont(new Font("Arial", Font.PLAIN, 15));
        txfQuantidade.setBorder(new LineBorder(Color.black, 2, true));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(txfProduto))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnAprovar)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                            .addGap(54, 54, 54)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(txfData, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxSolict, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txfOrcamento1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txfEconomia, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txfEmpresa1, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txfQuantidade, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(80, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxSolict, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfData, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(46, 46, 46)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label10, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfProduto, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfQuantidade, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfEmpresa1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfOrcamento1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txfEconomia, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAprovar, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(44, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        btnAprovar.addActionListener(this);
        btnCancelar.addActionListener(this);
        cbxSolict.addActionListener(this);
        try {
            SolicitacaoParaIdMap = puxarRegistroSolicit();
            SolicitacaoParaIdMap.forEach((Produto, id) -> cbxSolict.addItem(Produto));
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("Erro ao puxar registros" + e);
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - David Braz da Silva
    private JLabel label8;
    private JLabel label3;
    private JTextField txfEmpresa1;
    private JLabel label9;
    private JTextField txfData;
    private JLabel label4;
    private JTextField txfOrcamento1;
    private JLabel label5;
    private JTextField txfEconomia;
    private JButton btnAprovar;
    private JButton btnCancelar;
    private JLabel label10;
    private JTextField txfProduto;
    private JComboBox cbxSolict;
    private JLabel label6;
    private JTextField txfQuantidade;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on



    private Map<String, Integer> puxarRegistroSolicit() throws SQLException {
        Map<String, Integer> IdMap = new HashMap<>();
        Connection con = null;
        con = Conexao.getConnection();
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT idSolicitacao, Produto FROM tabsolicitacao WHERE Status = 'Orçamento Lançado'");

            while (rs.next()) {
                int id = rs.getInt("idSolicitacao");
                String Produto = rs.getString("Produto");
                IdMap.put(Produto, id);
            }
            rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        con.close();
        return IdMap;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == cbxSolict){
            String Produto = (String) cbxSolict.getSelectedItem();
            idSolicitacao = SolicitacaoParaIdMap.get(Produto);
        }
    }
}
