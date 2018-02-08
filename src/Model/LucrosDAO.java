package Model;

import Bean.LucrosBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LucrosDAO {
    
    private Connection con;
    
    public Connection getCon(){
       return con;
    }
       
    public void setCon(Connection con){
       this.con=con;
    }
    
    public LucrosDAO(Connection con){
       setCon(con);
    }
    
    public void InserirLucros(LucrosBean lb){
        
        try{
            
            String sql = "Insert into Lucros (Lcs_id_Cli, Lcs_Vlr, Lcs_dt, Lcs_Tipo, Lcs_Titulo)"
                    + " values (?,?,?,?,?)";
            
            PreparedStatement ps = getCon().prepareStatement(sql);
                
            ps.setString(1, lb.getLcs_id_Cli());    
            ps.setString(2, lb.getLcs_Vlr());    
            ps.setString(3, lb.getLcs_dt());     
            ps.setString(4, lb.getLcs_Tipo());     
            ps.setString(5, lb.getLcs_Titulo()); 
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!","INSERÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao inserir Lucro","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public LucrosBean SelecionarLucro(LucrosBean lb, String rela, String dt){
        
        try {
         
            String sql ="Select Sum(Lcs_Vlr) as lucro from Lucros where Lcs_id_Cli = '"+rela+"' and Lcs_dt like '%"+dt+"%'";
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            lb.setLcs_Vlr(rs.getString("lucro"));
            
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
        }
        return lb;
    }
    
    public LucrosBean SelecionarLucroTotal(LucrosBean lb, String inicio){
        
        try {
         
            String sql ="Select Sum(Lcs_Vlr) as lucro from Lucros where Lcs_dt like '%"+inicio+"%'";
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            lb.setLcs_Vlr(rs.getString("lucro"));
            System.err.println(rs.getString("lucro"));
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
        }
        return lb;
    }
    
    public void TableLucro(JTable TBL_Lucros, String mes){
        
        try {
            
            DefaultTableModel model = (DefaultTableModel) TBL_Lucros.getModel();
            String sql = "select cliente.Cli_Nome,\n" +
                                "lucros.Lcs_Titulo,\n" +
                                "lucros.Lcs_dt,\n" +
                                "lucros.Lcs_Vlr,\n" +
                                "lucros.Lcs_Tipo\n" +
                                "from lucros join cliente on lucros.Lcs_id_Cli = cliente.CodCli\n" +
                                "where lucros.Lcs_dt = '"+mes+"'" ;
            
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            while (rs.next()){
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                });
            }
            TBL_Lucros.revalidate();
            ps.close();
            rs.close();
            
            
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
            throw new RuntimeException(e);
        }
        
    }
    
    public void ExcluirLucros(LucrosBean lb){
        
        try{
            String sql = "Delete from Lucros where Lcs_Vlr=? and Lcs_dt=? and Lcs_Titulo=? and Lcs_id_Cli=(Select CodCli from Cliente where Cli_Nome=?)";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, lb.getLcs_Vlr());
            ps.setString(2, lb.getLcs_dt());
            ps.setString(3, lb.getLcs_Titulo());
            ps.setString(4, lb.getLcs_id_Cli());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados deletados com sucesso!","EXCLUÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao despesas Trabalho","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
