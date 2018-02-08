package Controller;

import Bean.DespesasBean;
import Connection.Conexao;
import Model.DespesasDAO;
import java.util.List;
import javax.swing.JTable;

public class DespesasController {
    
    public void DespesasControllerInserir (DespesasBean db){
        DespesasDAO dd = new DespesasDAO(Conexao.abrirConexao());
        dd.InserirDespesas(db);
    }
    
    public void DespesasControllerTable (JTable TBL_Despesas, String mes){
        DespesasDAO dd = new DespesasDAO(Conexao.abrirConexao());
        dd.TableDespesas(TBL_Despesas, mes);
    }
    
    public DespesasBean DespesasControllerTotal (DespesasBean db, String inicio, String fim){
        DespesasDAO dd = new DespesasDAO(Conexao.abrirConexao());
        return dd.DespesasSelecionartodas(db, inicio, fim);
    }
 
    public List DespesasControllerList (String data){
        DespesasDAO dd = new DespesasDAO(Conexao.abrirConexao());
        return dd.ListarDespesas(data);
    }
    
    public void DespesasControllerExcluir (DespesasBean db){
        DespesasDAO dd = new DespesasDAO(Conexao.abrirConexao());
        dd.ExcluirDespesas(db);
    }
}
