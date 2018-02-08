package Controller;

import Bean.FinanceiroBean;
import Connection.Conexao;
import Model.FinanceiroDAO;
import javax.swing.JTable;

public class FinanceiroController {
    
    public void FinaceiroControllerInserir (FinanceiroBean fb){
        FinanceiroDAO fd = new FinanceiroDAO(Conexao.abrirConexao());
        fd.FinanceiroInserir(fb);
    }
    
    public void FinanceiroControllerTable (JTable TBL_Total, Integer mes, String ano){
        FinanceiroDAO fd = new FinanceiroDAO(Conexao.abrirConexao());
        fd.TableFinanceiro(TBL_Total, mes, ano);
    }
}
