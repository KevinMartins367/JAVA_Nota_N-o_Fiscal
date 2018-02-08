package Controller;

import Bean.LucrosBean;
import Connection.Conexao;
import Model.LucrosDAO;
import javax.swing.JTable;

public class LucrosController {
   
    public void LucrosControllerInserir (LucrosBean lb){
        LucrosDAO ld = new LucrosDAO(Conexao.abrirConexao());
        ld.InserirLucros(lb);
    }
    
    public LucrosBean LucroCotrollerSelecionar (LucrosBean lb, String rela, String dt){
        LucrosDAO ld = new LucrosDAO(Conexao.abrirConexao());
        return ld.SelecionarLucro(lb, rela, dt);
    }
    
    public LucrosBean LucroCotrollerLucroTotal (LucrosBean lb, String inicio){
        LucrosDAO ld = new LucrosDAO(Conexao.abrirConexao());
        return ld.SelecionarLucroTotal(lb, inicio);
    }
    
    public void RelacaoControllerTable (JTable TBL_Lucros, String mes){
        LucrosDAO ld = new LucrosDAO(Conexao.abrirConexao());
        ld.TableLucro(TBL_Lucros, mes);
    }
    
    public void LucrosControllerExcluir (LucrosBean lb){
        LucrosDAO ld = new LucrosDAO(Conexao.abrirConexao());
        ld.ExcluirLucros(lb);
    }
}
