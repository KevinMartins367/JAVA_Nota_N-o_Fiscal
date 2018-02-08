package Controller;

import Bean.ServicosBean;
import Connection.Conexao;
import Model.ServicosDAO;
import java.util.List;
import javax.swing.JTable;

public class ServicosController {
    
    public void ServicosControllerInserir (ServicosBean sb){
        ServicosDAO sd = new ServicosDAO(Conexao.abrirConexao());
        sd.InserirServicos(sb);
    }
    
    public List ServicosControllerTodos (){
        ServicosDAO sd = new ServicosDAO(Conexao.abrirConexao());
        return sd.SelecionarTodosServicos();
    }
    
    public ServicosBean ServicosControllerSelecionar (ServicosBean sb, String nome){
        ServicosDAO sd = new ServicosDAO(Conexao.abrirConexao());
        return sd.SelecionarServicos(sb, nome);
    }
    
    public void ServicosControllerAlterar (ServicosBean sb, String nome){
        ServicosDAO sd = new ServicosDAO(Conexao.abrirConexao());
        sd.AleterarServicos(sb, nome);
    }
    
    public void ServicosControllerDeletar (ServicosBean sb){
        ServicosDAO sd = new ServicosDAO(Conexao.abrirConexao());
        sd.DeletarServicos(sb);
    }
    
    public void ServicosControllerTable (JTable TBL_Servico){
        ServicosDAO sd = new ServicosDAO(Conexao.abrirConexao());
        sd.TableServicos(TBL_Servico);
    }
    
    public void ServicosControllerTableCategoria (JTable TBL_Catalogo, String nome){
        ServicosDAO sd = new ServicosDAO(Conexao.abrirConexao());
        sd.TableServicosCategoria(TBL_Catalogo, nome);
    }
    
}
