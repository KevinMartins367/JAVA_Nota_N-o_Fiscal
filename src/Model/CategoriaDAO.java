package Model;

import Bean.CategoriaBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CategoriaDAO {
    
    private Connection con;
    
    public Connection getCon(){
       return con;
    }
       
    public void setCon(Connection con){
       this.con=con;
    }
    
    public CategoriaDAO(Connection con){
       setCon(con);
    }
    
    public void CategoriaInserir (CategoriaBean cab){
        
        try {
            
            String sql = "Insert into Categoria (Cat_Nome) values (?)";
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, cab.getCat_Nome());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!","INSERÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao inserir Categoria","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void CategoriaExcluir (CategoriaBean cab){
        
        try {
            
            String sql = "Delete from Categoria where Cat_Nome=?";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, cab.getCat_Nome());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados deletados com sucesso!","EXCLUÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao deletar Categoria","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void CategoriaTable (JTable TBL_Cat){
        
        try {
            
            DefaultTableModel model = (DefaultTableModel) TBL_Cat.getModel();
            String sql = "Select Cat_Nome from Categoria";
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            while (rs.next()){
                model.addRow(new Object[]{
                    rs.getString(1)
                });
            }
            TBL_Cat.revalidate();
            ps.close();
            rs.close();
            
            
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
            throw new RuntimeException(e);
        }
        
    }
    
    public List CategoriaNome (){
        
        try {
            
            List<CategoriaBean> lca = new ArrayList<>();
            String sql = "Select Cat_Nome from Categoria";
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                CategoriaBean cab = new CategoriaBean();
                cab.setCat_Nome(rs.getString("Cat_Nome"));
                lca.add(cab);
            }
            
            rs.close();
            ps.close();
            return lca;
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    
}
