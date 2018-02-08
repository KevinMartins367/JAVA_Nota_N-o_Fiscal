package Controller;

import Bean.ClienteBean;
import Bean.RelacaoBean;
import Connection.Conexao;
import Model.RelacaoDAO;
import java.util.List;
import javax.swing.JTable;

public class RelacaoController {
    
    public void RelacaoControllerInserir (RelacaoBean rb){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        rd.InserirRelacao(rb);
    }
    
    public RelacaoBean RelacaoControllerSelecionar (RelacaoBean rb, ClienteBean cb, String nome, String data){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        return rd.SelecionarRelacao(rb, cb, nome,  data);
    }
    
    public RelacaoBean RelacaoControllerSelecionarAl (RelacaoBean rb, String nome, String paciente, String serv, String data){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        return rd.SelecionarRelacaoAL(rb, nome, paciente, serv, data);
    }
    
    public void RelacaoControllerTable (JTable TBL_Trabs_Mes, String mes){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        rd.TableRelacao(TBL_Trabs_Mes, mes);
    }
    
    public void RelacaoControllerTablePagamento (JTable TBL_Pagamento, String nome, String data){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        rd.TablePagamento(TBL_Pagamento, nome, data);
    }
    
    public void RelacaoControllerExcluir (RelacaoBean rb){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        rd.ExcluirRelacao(rb);
    }
    
    public void RelacaoControllerAlterar (RelacaoBean rb, Integer cod){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        rd.AlterarRelacao(rb, cod);
    }
    
    public RelacaoBean RelacaoControllerRelatorio (RelacaoBean rb, ClienteBean cb, String nome, String data){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        return rd.SelecionarRelacaoRelatorio(rb, cb, nome, data);
    }
    
    public RelacaoBean RelacaoControllerSelecionarAlMod (RelacaoBean rb, ClienteBean cb, Integer id){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        return rd.SelecionarRelacaomod(rb, cb, id);
    }
    
    public List RelacaoControllerdt (String nome, String data){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        return rd.SelecionarRelacaodt(nome, data);
    }
    
    
    public void RelacaoControllerTableFechamento (JTable TBL_P_Dentista, String nome, String data){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        rd.TableFechamento(TBL_P_Dentista, nome, data);
    }
    
    public void RelacaoControllerTableprevia (JTable TBL_CLiente_P, String data){
        RelacaoDAO rd = new RelacaoDAO(Conexao.abrirConexao());
        rd.TableCliente(TBL_CLiente_P, data);
    }
}
