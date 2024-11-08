package Modelo;

import DAL.CadUsers;
import DAL.Caracteristicas;


public class Controle {
    public String mensagem;
    private Solicitacao solicitacao = new Solicitacao();
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
        } else {
            this.mensagem = cad.mensagem;
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
                solicitacao.Produto = Produto;
                solicitacao.quantidade = quantidade;
                solicitacao.Departamento = Departamento;
                solicitacao.data_solicitacao = data;
                solicitacao.Situacao = Situacao;
                DAL.SolicitacaoDAO solicitacaoDAO = new DAL.SolicitacaoDAO();
                solicitacaoDAO.SalvarSolicitacao(solicitacao);
                this.mensagem = solicitacaoDAO.mensagem;
                return;
            }
            this.mensagem = validacao.mensagem;
        }
    }
    public void AlterarSolicitacao(String Produto, int quantidade, String Departamento, String data_solicitacao, String Situacao){
        this.mensagem = "";
        if(Produto.equals("") || Departamento.equals("") || data_solicitacao.equals("") || Situacao.equals("")) {
            this.mensagem = "Preencha todos os campos!";
        }else{
            Validacao validacao = new Validacao();
            java.sql.Date data = validacao.ConverterStringToDate(data_solicitacao);
            if(data != null) {
                solicitacao.Produto = Produto;
                solicitacao.quantidade = quantidade;
                solicitacao.Departamento = Departamento;
                solicitacao.data_solicitacao = data;
                solicitacao.Situacao = Situacao;
                DAL.SolicitacaoDAO solicitacaoDAO = new DAL.SolicitacaoDAO();
                solicitacaoDAO.AlterarRegistro(solicitacao);
                this.mensagem = solicitacaoDAO.mensagem;
                return;
            }
            this.mensagem = validacao.mensagem;
        }
    }
    public void ExcluirSolicitacao(int id_solicitacao){
        this.mensagem = "";
        if(id_solicitacao > 0) {
            DAL.SolicitacaoDAO solicitacaoDAO = new DAL.SolicitacaoDAO();
            solicitacaoDAO.ExcluirRegistro(id_solicitacao);
            this.mensagem = solicitacaoDAO.mensagem;
        }else{
            this.mensagem = "ID da solicitação inválido!";
        }
    }
    public void LancarComparativo(int id_solicitacao, String Prim_Empresa, String Prim_Valor, String Seg_Empresa, String Seg_Valor, String Dif_Valor){
        this.mensagem = "";
        Validacao validacao = new Validacao();
        Double valor1 = validacao.ConveterStringToDouble(Prim_Valor);
        Double valor2 = validacao.ConveterStringToDouble(Seg_Valor);
        Double diferenca = validacao.ConveterStringToDouble(Dif_Valor);
        this.mensagem = validacao.mensagem;
        if(!this.mensagem.equals("")) {
            this.mensagem = validacao.mensagem;
            return;
        }
        Comparativo comparativo = new Comparativo();
        comparativo.id_solicitacao = id_solicitacao;
        comparativo.Prim_Empresa = Prim_Empresa;
        comparativo.Prim_Valor = valor1;
        comparativo.Seg_Empresa = Seg_Empresa;
        comparativo.Seg_Valor = valor2;
        comparativo.Dif_Valor = diferenca;
        DAL.ComparativoDAO comparativoDAO = new DAL.ComparativoDAO();
        comparativoDAO.incluirComparativo(comparativo);
        this.mensagem = comparativoDAO.mensagem;
    }
}
