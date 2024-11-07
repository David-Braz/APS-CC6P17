package Modelo;

import DAL.CadUsers;
import DAL.Caracteristicas;


public class Controle {
    public String mensagem;

    public void SalvarUser(String Nome,String Email, String Cargo, int privilegios,String Olhos, String Nariz) {
        this.mensagem = "";
        CadUsers cad = new CadUsers();
        if (cad.Salvar(Nome, Email, Cargo, privilegios)) {
            int iduser = cad.BuscarUserSalvo(Nome);
            if (iduser != 0) {
                Caracteristicas car = new Caracteristicas();
                if (!car.SalvarCaracteristicas(iduser, Olhos, Nariz)) {
                    this.mensagem = car.mensagem;
                }
            } else {
                this.mensagem = cad.mensagem;
            }
        }
    }
    public void SolicitacaoCompra(String Produto, int quantidade, String Departamento, String data_solicitacao, String Situacao) {
        this.mensagem = "";
        if(Produto.equals("") || Departamento.equals("") || data_solicitacao.equals("") || Situacao.equals("")) {
            this.mensagem = "Preencha todos os campos!";
        }else{
            Validacao validacao = new Validacao();
            java.sql.Date data = validacao.ConverterStringToDate(data_solicitacao);
            if(data != null) {
                Solicitacao solicitacao = new Solicitacao();
                solicitacao.Produto = Produto;
                solicitacao.quantidade = quantidade;
                solicitacao.Departamento = Departamento;
                solicitacao.data_solicitacao = data;
                solicitacao.Situacao = Situacao;
                DAL.SolicitacaoDAO solicitacaoDAO = new DAL.SolicitacaoDAO();
                solicitacaoDAO.SalvarSolicitacao(solicitacao);
                this.mensagem = solicitacaoDAO.mensagem;
            }
            this.mensagem = validacao.mensagem;
        }
    }
}
