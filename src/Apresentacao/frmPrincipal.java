/*
 * Created by JFormDesigner on Wed Oct 09 16:27:57 BRT 2024
 */

package Apresentacao;

import java.awt.*;
import javax.swing.border.*;
import DAL.CadUsers;
import Modelo.Estatico;

import javax.swing.*;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.jgoodies.forms.factories.*;

/**
 * @author DAVID
 */
public class frmPrincipal extends JFrame implements ActionListener {
    public frmPrincipal(int Usuario) {
        System.out.print(Usuario);
        initComponents();
        CadUsers cad = new CadUsers();
        if(Estatico.Priv == 1){

        }
        if(Estatico.Priv == 2){

        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - David Braz da Silva
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        btnPedidos = new JButton();
        btnOrcamento = new JButton();
        btnAprovacao = new JButton();
        btnCadastro = new JButton();
        separator1 = compFactory.createSeparator("");
        label1 = new JLabel();
        separator2 = compFactory.createSeparator("");

        //======== this ========
        setTitle("SOLICITA\u00c7\u00c3ODE COMPRAS");
        setBackground(new Color(0xcccccc));
        var contentPane = getContentPane();

        //---- btnPedidos ----
        btnPedidos.setIcon(new ImageIcon(getClass().getResource("/Icones/icons8-purchase-order-80.png")));
        btnPedidos.setBorder(new LineBorder(Color.white, 2, true));
        btnPedidos.setBackground(new Color(0xf5ffff));

        //---- btnOrcamento ----
        btnOrcamento.setBorder(new LineBorder(Color.white, 2, true));
        btnOrcamento.setIcon(new ImageIcon(getClass().getResource("/Icones/icons8-or\u00e7amento-80.png")));

        //---- btnAprovacao ----
        btnAprovacao.setBorder(new LineBorder(Color.white, 2, true));
        btnAprovacao.setIcon(new ImageIcon(getClass().getResource("/Icones/icons8-aprova\u00e7\u00e3o-80.png")));

        //---- btnCadastro ----
        btnCadastro.setBorder(new LineBorder(Color.white, 2, true));
        btnCadastro.setIcon(new ImageIcon(getClass().getResource("/Icones/icons8-cadastro-80.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(btnPedidos, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                    .addGap(70, 70, 70)
                    .addComponent(btnOrcamento, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                    .addGap(68, 68, 68)
                    .addComponent(btnAprovacao, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 432, Short.MAX_VALUE)
                    .addComponent(btnCadastro, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 582, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(separator2, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPedidos, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOrcamento, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAprovacao, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCadastro, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(152, 152, 152))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(138, 138, 138))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(separator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(151, 151, 151))))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - David Braz da Silva
    private JButton btnPedidos;
    private JButton btnOrcamento;
    private JButton btnAprovacao;
    private JButton btnCadastro;
    private JComponent separator1;
    private JLabel label1;
    private JComponent separator2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
