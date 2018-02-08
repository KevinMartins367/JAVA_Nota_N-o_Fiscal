package Model;

import Bean.ServicosBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ServicosDAO {
    
    private Connection con;
    
    public Connection getCon(){
       return con;
    }
       
    public void setCon(Connection con){
       this.con=con;
    }
    
    public ServicosDAO(Connection con){
       setCon(con);
    }
    
    public void InserirServicos(ServicosBean sb){
        
        try{
            String sql = "Insert into Servicos (Serv_Nome, Serv_Preco, Serv_id_Cat) "
                    + "values (?,?,(Select CodCat from Categoria where Cat_Nome=?))";
            
            PreparedStatement ps = getCon().prepareStatement(sql);
                
            ps.setString(1, sb.getServ_Nome());
            ps.setString(2, sb.getServ_Preco());
            ps.setString(3, sb.getServ_id_Cat());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!","INSERÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao inserir Serviço","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public List SelecionarTodosServicos (){
        
        try{
            
            List<ServicosBean> ls = new ArrayList<>();
            String sql = "Select Serv_Nome from Servicos order by Serv_Nome";
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ServicosBean sb = new ServicosBean();
                sb.setServ_Nome(rs.getString("Serv_Nome"));
                ls.add(sb);
            }
            
            rs.close();
            ps.close();
            return ls;
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public ServicosBean SelecionarServicos (ServicosBean sb, String nome){
        
        try{
            
            String sql = "Select Serv_Preco from Servicos where Serv_Nome = '"+nome+"'";
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            sb.setServ_Preco(rs.getString("Serv_Preco"));
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
        }
        return sb;
    }
    
    public void AleterarServicos (ServicosBean sb, String nome){
        
        try{
            String sql = "Update Servicos set Serv_Nome=?, Serv_Preco=? where CodServ = '"+nome+"'";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, sb.getServ_Nome());
            ps.setString(2, sb.getServ_Preco());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso!","ALTERAÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao alterar Serviço","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void DeletarServicos (ServicosBean sb){
        
        try{
            String sql = "Delete from Servicos where CodServ=?";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, sb.getCodServ());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados deletados com sucesso!","EXCLUÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao deletar Serviço","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void TableServicos (JTable TBL_Servico){
        
        try {
            DefaultTableModel model = (DefaultTableModel) TBL_Servico.getModel();
            String sql = "Select  Servicos.CodServ,\n" +
                                 "Categoria.Cat_Nome,\n" +
                                 "Servicos.Serv_Nome, \n" +
                                 "Servicos.Serv_Preco \n" +
                                 "from servicos join categoria on servicos.Serv_id_Cat = Categoria.CodCat";
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
                    rs.getString(4)
                });
            }
            TBL_Servico.revalidate();
            ps.close();
            rs.close();
            
            
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
            throw new RuntimeException(e);
        }
        
    }
    
    public void TableServicosCategoria (JTable TBL_Catalogo, String nome){
        
        try {
            DefaultTableModel model = (DefaultTableModel) TBL_Catalogo.getModel();
            String sql = "Select  Servicos.Serv_Nome, \n" +
                                 "Servicos.Serv_Preco \n" +
                                 "from servicos join categoria on servicos.Serv_id_Cat = Categoria.CodCat \n" +
                                                "where Categoria.Cat_Nome = '"+nome+"'";
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            while (rs.next()){
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2)
                });
            }
            TBL_Catalogo.revalidate();
            ps.close();
            rs.close();
            
            
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
            throw new RuntimeException(e);
        }
        
    }
    
}
