package Model;

import Bean.ClienteBean;
import Bean.RelacaoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RelacaoDAO {
    
    private Connection con;
    
    public Connection getCon(){
       return con;
    }
       
    public void setCon(Connection con){
       this.con=con;
    }
    
    public RelacaoDAO(Connection con){
       setCon(con);
    }
    
    public void InserirRelacao (RelacaoBean rb){
        
        try{
            String sql = "Insert into Relacao (Rela_dt, Rela_id_Cli, Rela_Paciente, Rela_Serv, Rela_Obs, Rela_Tipo_Serv,"
                                            + " Rela_Cor, Rela_Entrega, Rela_Tipo_Entrega, Rela_Total)"
                    + " values (?,(Select CodCli from Cliente where Cli_Nome=?),?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = getCon().prepareStatement(sql);
                
            ps.setString(1, rb.getRela_dt());
            ps.setString(2, rb.getRela_id_Cli());
            ps.setString(3, rb.getRela_Paciente());
            ps.setString(4, rb.getRela_Serv());
            ps.setString(5, rb.getRela_Obs());
            ps.setInt(6, rb.getRela_Tipo_Serv());
            ps.setString(7, rb.getRela_Cor());
            ps.setString(8, rb.getRela_Entrega());
            ps.setInt(9, rb.getRela_Tipo_Entrega());
            ps.setString(10, rb.getRela_Total());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!","INSERÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao inserir Trabalho","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public RelacaoBean SelecionarRelacao (RelacaoBean rb, ClienteBean cb, String nome, String data){
        
        try{
            String sql = "select cliente.CodCli,\n" +
                                "cliente.Cli_Nome,\n" +
                                "relacao.Rela_dt,\n" +
                                "Sum(relacao.Rela_Total) as total \n" +
                                "from relacao join cliente on relacao.Rela_id_Cli = cliente.CodCli\n" +
                                "where cliente.Cli_Nome = '"+nome+"' and relacao.Rela_dt like '%"+data+"%'";
            
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            cb.setCodCli(rs.getInt("CodCli"));
            cb.setCli_Nome(rs.getString("Cli_Nome"));
            rb.setRela_dt(rs.getString("Rela_dt"));
            rb.setTotal(rs.getString("total"));
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
        }
        return rb;
    }
    
    public RelacaoBean SelecionarRelacaoAL (RelacaoBean rb, String nome, String paciente, String serv, String data){
        
        try{
            String sql = "Select Relacao.CodRela,\n" +
                                "Relacao.Rela_dt,\n" +
                                "Relacao.Rela_Paciente,\n" +
                                "Relacao.Rela_Entrega \n" +
                                "from Relacao    join cliente on relacao.Rela_id_Cli = cliente.CodCli \n" +
                                                "where cliente.Cli_Nome = '"+nome+"' and relacao.Rela_Paciente = '"+paciente+"' \n" +
                                                "and relacao.Rela_Serv = '"+serv+"' and relacao.Rela_dt = '"+data+"'";
            
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            rb.setCodRela(rs.getInt("CodRela"));
            rb.setRela_dt(rs.getString("Rela_dt"));
            rb.setRela_Paciente(rs.getString("Rela_Paciente"));
            rb.setRela_Entrega(rs.getString("Rela_Entrega"));
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
        }
        return rb;
    }
    
    public void TableRelacao (JTable TBL_Trabs_Mes, String mes){
        
        try {
            
            DefaultTableModel model = (DefaultTableModel) TBL_Trabs_Mes.getModel();
            String sql = "select relacao.Rela_dt, \n" +
                                "cliente.Cli_Nome,\n" +
                                "relacao.Rela_Paciente,\n" +
                                "relacao.Rela_Serv,\n" +
                                "relacao.Rela_Tipo_Entrega,\n" +
                                "relacao.Rela_Entrega,\n" +
                                "relacao.Rela_Total ,\n" +
                                "relacao.Rela_Tipo_Entrega\n" +
                                "from relacao    join cliente on relacao.Rela_id_Cli = cliente.CodCli \n" +
                                                "where relacao.Rela_dt like '%"+mes+"' order by relacao.Rela_dt";
            
            
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
                    tipoEntrega(rs.getString(5)),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8)
                });
            }
            TBL_Trabs_Mes.revalidate();
            ps.close();
            rs.close();
            
            
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
            throw new RuntimeException(e);
        }
        
    }
    
    public void TablePagamento (JTable TBL_Pagamento, String nome, String data){
        
        try {
            
            DefaultTableModel model = (DefaultTableModel) TBL_Pagamento.getModel();
            String sql = "select cliente.Cli_Nome,\n" +
                                "substring(relacao.Rela_dt,4,10),\n" +
                                "Sum(relacao.Rela_Total) as total \n" +
                                "from relacao join cliente on relacao.Rela_id_Cli = cliente.CodCli\n" +
                                "where cliente.Cli_Nome = '"+nome+"' and relacao.Rela_dt like '%"+data+"%'";
            
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            System.out.println(rs);
            while (rs.next()){
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3)
                });
            }
            TBL_Pagamento.revalidate();
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
        
    public void ExcluirRelacao(RelacaoBean rb){
        
        try{
            String sql = "Delete from Relacao where Rela_dt=? and Rela_Paciente=? and Rela_Serv=? and Rela_id_Cli=(Select CodCli from Cliente where Cli_Nome=?)";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, rb.getRela_dt());
            ps.setString(2, rb.getRela_Paciente());
            ps.setString(3, rb.getRela_Serv());
            ps.setString(4, rb.getRela_id_Cli());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados deletados com sucesso!","EXCLUÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao deletar Trabalho","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void AlterarRelacao (RelacaoBean rb, Integer cod){
        
        try{
            
            String sql = "Update Relacao set Rela_dt=?, Rela_Entrega=?, Rela_Tipo_Entrega=?, Rela_Paciente=?, Rela_Total=?  where CodRela = '"+cod+"'";
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, rb.getRela_dt());
            ps.setString(2, rb.getRela_Entrega());
            ps.setInt(3, rb.getRela_Tipo_Entrega());
            ps.setString(4, rb.getRela_Paciente());
            ps.setString(5, rb.getRela_Total());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso!","ALTERAÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao alterar Relação","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public RelacaoBean SelecionarRelacaoRelatorio (RelacaoBean rb, ClienteBean cb, String nome, String data){
        
        try{
            String sql = "Select cliente.Cli_Nome,\n" +
                                "cliente.Cli_Local,\n" +
                                "cliente.Cli_Fixo, \n" +
                                "Sum(relacao.Rela_Total) as total \n" +
                                "from relacao    join cliente on relacao.Rela_id_Cli = cliente.CodCli\n" +
                                                "where cliente.Cli_Nome = '"+nome+"' and relacao.Rela_dt like '%"+data+"%'";
            
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            
                cb.setCli_Nome(rs.getString("Cli_Nome"));
                cb.setCli_Local(rs.getString("Cli_Local"));
                cb.setCli_Fixo(rs.getString("Cli_Fixo"));
                rb.setTotal(rs.getString("total"));
            }
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
        }
        return rb;
    }
    
    public RelacaoBean SelecionarRelacaomod (RelacaoBean rb, ClienteBean cb, Integer id){
        
        try{
            String sql = "select     cliente.Cli_Nome,\n" +
                                    "relacao.Rela_Serv,\n" +
                                    "relacao.Rela_Tipo_Serv,\n" +
                                    "relacao.Rela_Cor,\n" +
                                    "relacao.Rela_Tipo_Entrega,\n" +
                                    "relacao.Rela_Obs,\n" +
                                    "relacao.Rela_Total \n" +
                                    "from relacao    join cliente on relacao.Rela_id_Cli = cliente.CodCli \n" +
                                                    "where relacao.CodRela = '"+id+"'";
            
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            rs.next();
            
                cb.setCli_Nome(rs.getString("Cli_Nome"));
                rb.setRela_Serv(rs.getString("Rela_Serv"));
                rb.setRela_Tipo_Serv(rs.getInt("Rela_Tipo_Serv"));
                rb.setRela_Cor(rs.getString("Rela_Cor"));
                rb.setRela_Tipo_Entrega(rs.getInt("Rela_Tipo_Entrega"));
                rb.setRela_Obs(rs.getString("Rela_Obs"));
                rb.setRela_Total(rs.getString("Rela_Total"));
                
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
        }
        return rb;
    }
    
    public List SelecionarRelacaodt (String nome, String data){
        
        try{
            
            List<RelacaoBean> lrb2 = new ArrayList<RelacaoBean>();
            String sql = "Select Rela_dt,"
                    + " Rela_Entrega, "
                    + "Rela_Paciente, "
                    + "Rela_Serv, "
                    + "Rela_Total from relacao join cliente on relacao.Rela_id_Cli = cliente.CodCli \n" +
                                                "where cliente.Cli_Nome = '"+nome+"' and relacao.Rela_dt like '%"+data+"%'";
            
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                RelacaoBean rlb = new RelacaoBean();
                rlb.setRela_dt(rs.getString("Rela_dt"));
                rlb.setRela_Entrega(rs.getString("Rela_Entrega"));
                rlb.setRela_Paciente(rs.getString("Rela_Paciente"));
                rlb.setRela_Serv(rs.getString("Rela_Serv"));
                rlb.setRela_Total(rs.getString("Rela_Total"));
                lrb2.add(rlb);
            }
            rs.close();
            ps.close();
            return lrb2;
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    private String tipoEntrega(String tipo){
        if(Objects.equals(tipo, "0")){
            return "Normal";
        }else{
            return "Urgência";
        }
    }
    
    public void TableFechamento (JTable TBL_P_Dentista, String nome, String mes){
        
        try {
            
            DefaultTableModel model = (DefaultTableModel) TBL_P_Dentista.getModel();
            String sql = "select relacao.Rela_dt, \n" +
                                "relacao.Rela_Entrega,\n" +
                                "relacao.Rela_Paciente,\n" +
                                "relacao.Rela_Serv,\n" +
                                "relacao.Rela_Total \n" +
                                "from relacao    join cliente on relacao.Rela_id_Cli = cliente.CodCli \n" +
                                                "where cliente.Cli_Nome = '"+nome+"' and relacao.Rela_dt like '%"+mes+"%'";
            
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
            TBL_P_Dentista.revalidate();
            ps.close();
            rs.close();  
            
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
            throw new RuntimeException(e);
        }
        
    }
    
     public void TableCliente (JTable TBL_CLiente_P, String mes){
        
        try {
            
            DefaultTableModel model = (DefaultTableModel) TBL_CLiente_P.getModel();
            String sql = "select cliente.Cli_Nome,\n" +
                                "SUM(relacao.Rela_Total) \n" +
                                "from relacao join cliente on relacao.Rela_id_Cli = cliente.CodCli \n" +
                                "where relacao.Rela_dt like '%"+mes+"%' \n" +
                                "group by cliente.Cli_Nome order by cliente.Cli_Nome ASC";

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
            TBL_CLiente_P.revalidate();
            ps.close();
            rs.close();  
            
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
            throw new RuntimeException(e);
        }
        
    }
    
}
