package DAL;

import Modelo.Solicitacao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SolicitacaoDAO {
    public String mensagem;

    public void SalvarSolicitacao(Solicitacao solicitacao) {
        this.mensagem = "";
        try {
            String query = "";
            Connection con = Conexao.getConnection();
            String sql = "INSERT INTO tabsolicitacao (Produto,Quantidade,Departamento,DataSolicitacao,Status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, solicitacao.Produto);
            ps.setInt(2, solicitacao.quantidade);
            ps.setString(3, solicitacao.Departamento);
            ps.setDate(4, solicitacao.data_solicitacao);
            ps.setString(5, solicitacao.Situacao);
            ps.execute();
            this.mensagem = "Solicitacão de compra cadastrada com sucesso!";
            ps.close();
            con.close();
        } catch (Exception e) {
            this.mensagem = e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao salvar solicitacao de compra: " + e.getMessage());
        }
    }
    public void BuscarUltimoSolicitacao(Solicitacao solicitacao) {
        this.mensagem = "";
        Connection con = null;
        Statement stmt;
        try {
            String Query = "SELECT idSolicitacao,Produto,Quantidade,Departamento,DataSolicitacao,Status FROM tabsolicitacao ORDER BY idSolicitacao DESC LIMIT 1";
            con = Conexao.getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            if(rs.next()) {
                solicitacao.id_solicitacao = rs.getInt("idSolicitacao");
                solicitacao.Produto = rs.getString("Produto");
                solicitacao.quantidade = rs.getInt("Quantidade");
                solicitacao.Departamento = rs.getString("Departamento");
                solicitacao.data_solicitacao = rs.getDate("DataSolicitacao");
                solicitacao.Situacao = rs.getString("Status");
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            this.mensagem = e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao buscar ultima solicitacao de compra: " + e.getMessage());
        }
    }
    public void AlterarRegistro(Solicitacao solicitacao){
        this.mensagem = "";
        try {
            Connection con = Conexao.getConnection();
            String sql = "UPDATE tabsolicitacao SET Produto = ?, Quantidade = ?, Departamento = ?, DataSolicitacao = ?, Status = ? WHERE idSolicitacao = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, solicitacao.Produto);
            ps.setInt(2, solicitacao.quantidade);
            ps.setString(3, solicitacao.Departamento);
            ps.setDate(4, solicitacao.data_solicitacao);
            ps.setString(5, solicitacao.Situacao);
            ps.setInt(6, solicitacao.id_solicitacao);
            ps.execute();
            this.mensagem = "Solicitacão de compra alterada com sucesso!";
            ps.close();
            con.close();
        } catch (Exception e) {
            this.mensagem = e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao alterar solicitacao de compra: " + e.getMessage());
        }
    }
    public void ExcluirRegistro(int idSolicitacao){
        this.mensagem = "";
        try {
            Connection con = Conexao.getConnection();
            String sql = "DELETE FROM tabsolicitacao WHERE idSolicitacao = ? OR Status <> 'Em Aberto'";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSolicitacao);
            ps.execute();
            this.mensagem = "Solicitacão de compra excluída com sucesso!";
            ps.close();
            con.close();
        } catch (Exception e) {
            this.mensagem = e.getMessage();
            JOptionPane.showMessageDialog(null, "Solicitação não está mais aberta, não é possível excluir");
        }
    }
    public void BuscarRegistro(int idSolicitacao, Solicitacao solicitacao,String Query){
        this.mensagem = "";
        Connection con = null;
        Statement stmt;
        try {

            con = Conexao.getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            if(rs.next()) {
                solicitacao.id_solicitacao = rs.getInt("idSolicitacao");
                solicitacao.Produto = rs.getString("Produto");
                solicitacao.quantidade = rs.getInt("Quantidade");
                solicitacao.Departamento = rs.getString("Departamento");
                solicitacao.data_solicitacao = rs.getDate("DataSolicitacao");
                solicitacao.Situacao = rs.getString("Status");
                System.out.print(solicitacao.data_solicitacao);
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            this.mensagem = e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao buscar solicitacao de compra: " + e.getMessage());
        }
    }
    public void alterarSituacao(int idSolicitacao, String Status){
        this.mensagem = "";
        try {
            Connection con = Conexao.getConnection();
            String sql = "UPDATE tabsolicitacao SET Status = ? WHERE idSolicitacao = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Status);
            ps.setInt(2, idSolicitacao);
            ps.execute();
            ps.close();
            con.close();
        } catch (Exception e) {
            this.mensagem = e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao alterar status da solicitacao de compra: " + e.getMessage());
        }
    }
    public void puxarRegistro(Solicitacao solicitacao){
        this.mensagem = "";
        Connection con = null;
        Statement stmt;
        try {
            String Query = "SELECT idSolicitacao,Produto,Quantidade,Departamento,DataSolicitacao,Status FROM tabsolicitacao WHERE idSolicitacao = "+ solicitacao.id_solicitacao +" ORDER BY idSolicitacao DESC LIMIT 1";
            con = Conexao.getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            if(rs.next()) {
                solicitacao.Produto = rs.getString("Produto");
                solicitacao.quantidade = rs.getInt("Quantidade");
                solicitacao.data_solicitacao = rs.getDate("DataSolicitacao");
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            this.mensagem = e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao buscar ultima solicitacao de compra: " + e.getMessage());
        }
    }
}
