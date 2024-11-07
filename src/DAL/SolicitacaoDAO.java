package DAL;

import Modelo.Solicitacao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SolicitacaoDAO {
    public String mensagem;

    public void SalvarSolicitacao(Solicitacao solicitacao) {
        this.mensagem = "";
        try {
            String query = "";
            Connection con = Conexao.getConnection();
            String sql = "INSERT INTO solicitacao (Produto,Quantidade,Departamento,DataSolicitacao,Status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, solicitacao.Produto);
            ps.setInt(2, solicitacao.quantidade);
            ps.setString(3, solicitacao.Departamento);
            ps.setDate(4, solicitacao.data_solicitacao);
            ps.setString(4, solicitacao.Situacao);
            ps.execute();
            mensagem = "Solicitacão de compra cadastrada com sucesso!";
            ps.close();
            con.close();
        } catch (Exception e) {
            this.mensagem = e.getMessage();
        }
    }

}
