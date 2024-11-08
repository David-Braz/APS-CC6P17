/*
 * Created by JFormDesigner on Thu Nov 07 22:14:42 BRT 2024
 */

package Apresentacao;

import DAL.Conexao;
import Modelo.Controle;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author jayme
 */
public class frmComparativo extends JFrame implements ActionListener {
    private Map<String, Integer> SolicitacaoParaIdMap;
    public frmComparativo() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - David Braz da Silva
        label5 = new JLabel();
        label3 = new JLabel();
        txfEmpresa1 = new JTextField();
        label4 = new JLabel();
        txfOrcamento1 = new JTextField();
        label6 = new JLabel();
        label7 = new JLabel();
        txfOrcamento2 = new JTextField();
        txfEmpresa2 = new JTextField();
        label8 = new JLabel();
        cbxSolicitacao = new JComboBox();
        btnLancar = new JButton();
        btnVoltar = new JButton();
        label9 = new JLabel();
        txfDiferenca = new JTextField();

        //======== this ========
        var contentPane = getContentPane();

        //---- label5 ----
        label5.setText("COMPARATIVO");
        label5.setFont(new Font("Arial", Font.BOLD, 20));
        label5.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label3 ----
        label3.setText("Empresa:");
        label3.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfEmpresa1 ----
        txfEmpresa1.setFont(new Font("Arial", Font.PLAIN, 15));
        txfEmpresa1.setBorder(new LineBorder(Color.black, 2, true));

        //---- label4 ----
        label4.setText("Or\u00e7amento Menor:");
        label4.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfOrcamento1 ----
        txfOrcamento1.setFont(new Font("Arial", Font.PLAIN, 15));
        txfOrcamento1.setBorder(new LineBorder(Color.black, 2, true));

        //---- label6 ----
        label6.setText("Empresa:");
        label6.setFont(new Font("Arial", Font.BOLD, 15));

        //---- label7 ----
        label7.setText("Or\u00e7amento Maior:");
        label7.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfOrcamento2 ----
        txfOrcamento2.setFont(new Font("Arial", Font.PLAIN, 15));
        txfOrcamento2.setBorder(new LineBorder(Color.black, 2, true));

        //---- txfEmpresa2 ----
        txfEmpresa2.setFont(new Font("Arial", Font.PLAIN, 15));
        txfEmpresa2.setBorder(new LineBorder(Color.black, 2, true));

        //---- label8 ----
        label8.setText("Solicita\u00e7\u00e3o:");
        label8.setFont(new Font("Arial", Font.BOLD, 15));

        //---- cbxSolicitacao ----
        cbxSolicitacao.setFont(new Font("Arial", Font.BOLD, 15));
        cbxSolicitacao.setBorder(new LineBorder(Color.black, 2, true));

        //---- btnLancar ----
        btnLancar.setText("LANA\u00c7AR");
        btnLancar.setFont(new Font("Arial", Font.BOLD, 14));
        btnLancar.setActionCommand("SALVAR");

        //---- btnVoltar ----
        btnVoltar.setText("VOLTAR");
        btnVoltar.setFont(new Font("Arial", Font.BOLD, 14));
        btnVoltar.setActionCommand("SALVAR");

        //---- label9 ----
        label9.setText("Diferen\u00e7a:");
        label9.setFont(new Font("Arial", Font.BOLD, 15));

        //---- txfDiferenca ----
        txfDiferenca.setFont(new Font("Arial", Font.PLAIN, 15));
        txfDiferenca.setBorder(new LineBorder(Color.black, 2, true));
        txfDiferenca.setEnabled(false);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txfDiferenca, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txfEmpresa2, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txfOrcamento2, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txfOrcamento1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addGap(150, 150, 150))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txfEmpresa1, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbxSolicitacao, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(127, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnLancar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                            .addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxSolicitacao, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfEmpresa1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfOrcamento1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfEmpresa2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfOrcamento2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfDiferenca, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLancar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                    .addGap(42, 42, 42))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        try {
            SolicitacaoParaIdMap = puxarRegistroSolicit();
            SolicitacaoParaIdMap.forEach((Produto, id) -> cbxSolicitacao.addItem(Produto));
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("Erro ao puxar registros" + e);
        }
        btnLancar.addActionListener(this);
        btnVoltar.addActionListener(this);
        cbxSolicitacao.addActionListener(this);
        txfOrcamento2.addActionListener(this);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - David Braz da Silva
    private JLabel label5;
    private JLabel label3;
    private JTextField txfEmpresa1;
    private JLabel label4;
    private JTextField txfOrcamento1;
    private JLabel label6;
    private JLabel label7;
    private JTextField txfOrcamento2;
    private JTextField txfEmpresa2;
    private JLabel label8;
    private JComboBox cbxSolicitacao;
    private JButton btnLancar;
    private JButton btnVoltar;
    private JLabel label9;
    private JTextField txfDiferenca;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    private int idSolicitacao;
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // TODO add your code here
        if(e.getSource() == btnLancar){
            Controle controle = new Controle();
            controle.LancarComparativo(idSolicitacao, txfEmpresa1.getText(),txfOrcamento1.getText(),txfEmpresa2.getText(),txfOrcamento2.getText(),txfDiferenca.getText());
            JOptionPane.showMessageDialog(null, controle.mensagem);
            LimparCampos();

        }
        if(e.getSource() == btnVoltar){
            this.dispose();
        }
        if(e.getSource() == cbxSolicitacao){
            String Produto = (String) cbxSolicitacao.getSelectedItem();
            idSolicitacao = SolicitacaoParaIdMap.get(Produto);

        }
        if(e.getSource() == txfOrcamento2){
            String Orcamento = txfOrcamento2.getText();
            String Orcamento1 = txfOrcamento1.getText();
            try{
                double orcamento = Double.parseDouble(Orcamento);
                double orcamento1 = Double.parseDouble(Orcamento1);
                double diferenca = Math.round((orcamento - orcamento1) * 100.0) / 100.0;
                txfDiferenca.setText(String.valueOf(diferenca));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro ao calcular diferença: " + ex);
            }
        }
    }
    private Map<String, Integer> puxarRegistroSolicit() throws SQLException {
        Map<String, Integer> IdMap = new HashMap<>();
        Connection con = null;
        con = Conexao.getConnection();
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT idSolicitacao, Produto FROM tabsolicitacao WHERE Status = 'Em Aberto'");

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
    private void LimparCampos(){
        txfEmpresa1.setText("");
        txfEmpresa2.setText("");
        txfOrcamento1.setText("");
        txfOrcamento2.setText("");
        txfDiferenca.setText("");
    }

}
