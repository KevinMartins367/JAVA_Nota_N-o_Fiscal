package Model;

import Bean.ClienteBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClienteDAO {
    
    private Connection con;
    
    public Connection getCon(){
       return con;
    }
       
    public void setCon(Connection con){
       this.con=con;
    }
    
    public ClienteDAO(Connection con){
       setCon(con);
    }
    
    public void  InserirCliente (ClienteBean cb){
        
        try{
            
            String sql = "Insert into Cliente (Cli_Nome,Cli_Fixo, Cli_Celular, Cli_Local, Cli_Secretaria,"
                    + "Cli_CRO, Cli_Tipo, Cli_saldo) values (?,?,?,?,?,?,?,0)";
            
            PreparedStatement ps = getCon().prepareStatement(sql);
                
            ps.setString(1, cb.getCli_Nome());      
            ps.setString(2, cb.getCli_Fixo());    
            ps.setString(3, cb.getCli_Celular());    
            ps.setString(4, cb.getCli_Local());    
            ps.setString(5, cb.getCli_Secretaria());   
            ps.setString(6, cb.getCli_CRO());    
            ps.setInt(7, cb.getCli_Tipo());   
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!","INSERÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao inserir Cliente","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public List SelecionarTodosCliente (){
        
        try{
            
            List<ClienteBean> lc = new ArrayList<>();
            
            String sql = "Select Cli_Nome from Cliente order by Cli_Nome";
            PreparedStatement stmt = getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                ClienteBean cb = new ClienteBean();
                cb.setCli_Nome(rs.getString("Cli_Nome"));
                lc.add(cb);
            }
            
            rs.close();
            stmt.close();
            return lc;
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public ClienteBean SelecionarCliente (ClienteBean cb, String nome){
        
        try{
            
            String sql = "Select  * from Cliente where Cli_Nome like '%"+nome+"%'";
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            cb.setCli_Nome(rs.getString("Cli_Nome"));
            cb.setCli_Fixo(rs.getString("Cli_Fixo"));
            cb.setCli_Celular(rs.getString("Cli_Celular"));
            cb.setCli_Local(rs.getString("Cli_Local"));
            cb.setCli_Secretaria(rs.getString("Cli_Secretaria"));
            cb.setCli_CRO(rs.getString("Cli_CRO"));
            cb.setCli_Tipo(rs.getInt("Cli_Tipo"));
            cb.setCli_saldo(rs.getString("Cli_saldo"));
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
        }
        return cb;
    }
    
    public ClienteBean SelecionarEndereco (ClienteBean cb, String nome){
        
        try{
            
            String sql = "Select    Cli_Local, \n" +
                                   "Cli_Fixo  \n" +
                                   "from Cliente where Cli_Nome like '%"+nome+"%'";
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            cb.setCli_Local(rs.getString("Cli_Local"));
            cb.setCli_Fixo(rs.getString("Cli_Fixo"));
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
        }
        return cb;
    }
    
    public void ALterarCliente (ClienteBean cb, String nome){
        
        try{
            
            String sql = "Update Cliente set Cli_Fixo=?, Cli_Celular=?, Cli_Local=?, Cli_Secretaria=?, Cli_saldo=? where Cli_Nome = '"+nome+"'";
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, cb.getCli_Fixo());
            ps.setString(2, cb.getCli_Celular());
            ps.setString(3, cb.getCli_Local());
            ps.setString(4, cb.getCli_Secretaria());
            ps.setString(5, cb.getCli_saldo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso!","ALTERAÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao alterar Cliente","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void ALterarSaldo (ClienteBean cb, String nome){
        
        try{
            
            String sql = "Update Cliente set Cli_saldo=? where Cli_Nome = '"+nome+"'";
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, cb.getCli_saldo());
            ps.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao alterar Cliente","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public ClienteBean SelecionarSaldo (ClienteBean cb, String nome){
        
        try{
            
            String sql = "Select    Cli_saldo  \n" +
                                   "from Cliente where Cli_Nome = '"+nome+"'";
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            cb.setCli_saldo(rs.getString("Cli_saldo"));
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
        }
        return cb;
    }
    
    public void TableCliente (JTable Table_Cliente){
        
        try {
            
            DefaultTableModel model = (DefaultTableModel) Table_Cliente.getModel();
            String sql = "Select    Cli_Tipo, \n" +
                                   "Cli_Nome, \n" +
                                   "Cli_Local, \n" +
                                   "Cli_Celular, \n" +
                                   "Cli_Fixo, \n" +
                                   "Cli_Secretaria,\n" +
                                   "Cli_CRO, \n" +
                                   "Cli_saldo \n" +
                                   "from Cliente order by Cli_Nome";
            
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            
            
            while (rs.next()){
                model.addRow(new Object[]{
                    teste(rs.getInt(1)),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8)
                });
                    
                
            }
            Table_Cliente.revalidate();
            ps.close();
            rs.close();
            
            
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
            throw new RuntimeException(e);
        }
        
    }
    
    public void ExcluirCliente (ClienteBean cb){
        
        try {
            
            String sql = "Delete from Cliente where Cli_Nome=? and Cli_Fixo=? and Cli_Tipo=?";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, cb.getCli_Nome());
            ps.setString(2, cb.getCli_Fixo());
            ps.setInt(3, cb.getCli_Tipo());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados deletados com sucesso!","EXCLUÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao deletar Cliente","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private String teste(Integer tste){
            String tipo;
            if(tste == 1){
                tipo = "Dentista";
                return tipo;
            }else if (tste == 2){
                tipo = "Protético";
                return tipo;
            }
        return null;
    }
    
}
