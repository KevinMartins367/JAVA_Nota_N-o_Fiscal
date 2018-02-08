package Controller;

import Bean.CategoriaBean;
import Connection.Conexao;
import Model.CategoriaDAO;
import java.util.List;
import javax.swing.JTable;

public class CategoriaController {
    
    public void CategoriaControllerInserir(CategoriaBean cab){
        CategoriaDAO cad = new CategoriaDAO(Conexao.abrirConexao());
        cad.CategoriaInserir(cab);
    }
    
    public void CategoriaControllerExcluir(CategoriaBean cab){
        CategoriaDAO cad = new CategoriaDAO(Conexao.abrirConexao());
        cad.CategoriaExcluir(cab);
    }
    
    public void CategoriaControllerTable(JTable TBL_Cat){
        CategoriaDAO cad = new CategoriaDAO(Conexao.abrirConexao());
        cad.CategoriaTable(TBL_Cat);
    }
    
    public List CategoriaControllerList(){
        CategoriaDAO cad = new CategoriaDAO(Conexao.abrirConexao());
        return cad.CategoriaNome();
    }
}
