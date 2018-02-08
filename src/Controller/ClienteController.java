package Controller;

import Bean.ClienteBean;
import Connection.Conexao;
import Model.ClienteDAO;
import java.util.List;
import javax.swing.JTable;

public class ClienteController {
    
    public void ClienteControllerInserir (ClienteBean cb){
        ClienteDAO cd = new ClienteDAO(Conexao.abrirConexao());
        cd.InserirCliente(cb);        
    }
    
    public List ClienteControllerSelecionarTodos (){
        ClienteDAO cd = new ClienteDAO(Conexao.abrirConexao());
        return cd.SelecionarTodosCliente();
    }
    
    public ClienteBean ClienteControllerSelecionar (ClienteBean cb, String nome){
        ClienteDAO cd = new ClienteDAO(Conexao.abrirConexao());
        return cd.SelecionarCliente(cb, nome);
    }
    
    public ClienteBean ClienteControllerSelecionarEndereco (ClienteBean cb, String nome){
        ClienteDAO cd = new ClienteDAO(Conexao.abrirConexao());
        return cd.SelecionarEndereco(cb, nome);
    }
    
    public void ClienteControllerAlterar (ClienteBean cb, String nome){
        ClienteDAO cd = new ClienteDAO(Conexao.abrirConexao());
        cd.ALterarCliente(cb, nome);        
    }
    
    public ClienteBean ClienteControllerSelecionarSaldo (ClienteBean cb, String nome){
        ClienteDAO cd = new ClienteDAO(Conexao.abrirConexao());
        return cd.SelecionarSaldo(cb, nome);
    }
    
    public void ClienteControllerAlterarSaldo (ClienteBean cb, String nome){
        ClienteDAO cd = new ClienteDAO(Conexao.abrirConexao());
        cd.ALterarSaldo(cb, nome);
    }
    
    public void ClienteControllerTable (JTable Table_Cliente){
        ClienteDAO cd = new ClienteDAO(Conexao.abrirConexao());
        cd.TableCliente(Table_Cliente);
    }
    
    public void ClienteControllerExcluir (ClienteBean cb){
        ClienteDAO cd = new ClienteDAO(Conexao.abrirConexao());
        cd.ExcluirCliente(cb);        
    }
}
