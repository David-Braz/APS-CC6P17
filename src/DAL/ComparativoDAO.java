package DAL;

import Modelo.Comparativo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ComparativoDAO {
    public String mensagem;

    public void incluirComparativo(Comparativo comparativo){
        this.mensagem = "";
        try {
            Connection con = Conexao.getConnection();
            String sql = "INSERT INTO tabcomparativo (id_solicitacao, Prim_Empresa, Prim_Valor, Seg_Empresa, Seg_Valor, Dif_Valor) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, comparativo.id_solicitacao);
            ps.setString(2, comparativo.Prim_Empresa);
            ps.setDouble(3, comparativo.Prim_Valor);
            ps.setString(4, comparativo.Seg_Empresa);
            ps.setDouble(5, comparativo.Seg_Valor);
            ps.setDouble(6, comparativo.Dif_Valor);
            ps.execute();
            this.mensagem = "Comparativo Lançado com sucesso!";
            SolicitacaoDAO solicitacaoDAO = new SolicitacaoDAO();
            solicitacaoDAO.alterarSituacao(comparativo.id_solicitacao, "Orçamento Lançado");
            ps.close();
            con.close();
        } catch (Exception e) {
            this.mensagem = e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao Lançar comparativo: " + e.getMessage());
        }
    }
}
