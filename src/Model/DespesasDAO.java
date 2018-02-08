package Model;

import Bean.DespesasBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DespesasDAO {
    
    private Connection con;
    
    public Connection getCon(){
       return con;
    }
       
    public void setCon(Connection con){
       this.con=con;
    }
    
    public DespesasDAO(Connection con){
       setCon(con);
    }
    
    public void InserirDespesas(DespesasBean db){
        
        try {
            
            String sql = "Insert into Despesas (Desp_Tipo, Desp_Titulo, Desp_Preco, Desp_dt)"
                    + " values (?,?,?,?)";
            
            PreparedStatement ps = getCon().prepareStatement(sql);
                
            ps.setString(1, db.getDesp_Tipo());
            ps.setString(2, db.getDesp_Titulo());
            ps.setString(3, db.getDesp_Preco());
            ps.setString(4, db.getDesp_dt());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!","INSERÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao inserir Despesas","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void TableDespesas (JTable TBL_Despesas, String mes){
        
        try {
            
            DefaultTableModel model = (DefaultTableModel) TBL_Despesas.getModel();
            String sql = "select   despesas.Desp_Tipo, \n" +
                                  "despesas.Desp_Titulo, \n" +
                                  "despesas.Desp_Preco,  \n" +
                                  "despesas.Desp_dt  \n" +
                                  "from despesas where  substring(despesas.Desp_dt,4,10) like '%"+mes+"%'";
            
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
            TBL_Despesas.revalidate();
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            throw new RuntimeException(e);
        }
        
    }
    
    public DespesasBean DespesasSelecionartodas (DespesasBean db, String inicio, String fim){
        
        try {
            
            String sql =    "select Sum(Desp_Preco) as despesas \n" +
                            "from despesas where Desp_dt between '"+inicio+"' and '"+fim+"'";
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            db.setDesp_Preco(rs.getString("despesas"));
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
        }
        return db;
    }
    
    public List ListarDespesas (String data){
        
        try{
            
            List<DespesasBean> ldb2 = new ArrayList<DespesasBean>();
            String sql = "Select Desp_Tipo,"
                    + " Desp_Titulo, "
                    + "Desp_Preco, "
                    + "Desp_dt from despesas where Desp_dt like '%"+data+"'";
            
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                DespesasBean db = new DespesasBean();
                db.setDesp_Tipo(rs.getString("Desp_Tipo"));
                db.setDesp_Titulo(rs.getString("Desp_Titulo"));
                db.setDesp_Preco(rs.getString("Desp_Preco"));
                db.setDesp_dt(rs.getString("Desp_dt"));
                ldb2.add(db);
            }
            rs.close();
            ps.close();
            return ldb2;
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void ExcluirDespesas(DespesasBean db){
        
        try{
            String sql = "Delete from despesas where Desp_Titulo=? and Desp_Preco=? and Desp_dt=?";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, db.getDesp_Titulo());
            ps.setString(2, db.getDesp_Preco());
            ps.setString(3, db.getDesp_dt());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados deletados com sucesso!","EXCLUÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao despesas Trabalho","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
