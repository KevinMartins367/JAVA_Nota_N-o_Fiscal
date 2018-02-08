package Model;

import Bean.FinanceiroBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FinanceiroDAO {
    
    private Connection con;
    
    public Connection getCon(){
       return con;
    }
       
    public void setCon(Connection con){
       this.con=con;
    }
    
    public FinanceiroDAO(Connection con){
       setCon(con);
    }
    
    public void FinanceiroInserir(FinanceiroBean fb){
        
        try {
            
            String sql = "Insert into Financeiro(Fin_renda_pos, Fin_renda_neg, Fin_renda_Total, Fin_Mes, Fin_Ano) values (?,?,?,?,?)";
            PreparedStatement ps = getCon().prepareStatement(sql);
                
            ps.setString(1, fb.getFin_renda_pos());
            ps.setString(2, fb.getFin_renda_neg());
            ps.setString(3, fb.getFin_renda_Total());
            ps.setString(4, fb.getFin_Mes());
            ps.setInt(5, fb.getFin_Ano());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!","INSERÇÃO",JOptionPane.INFORMATION_MESSAGE);            
            
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "erro ao inserir Fechamento","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void TableFinanceiro (JTable TBL_Total, Integer mes, String ano){
        
        try {
             DefaultTableModel model = (DefaultTableModel) TBL_Total.getModel();
            String sql = "select   Fin_renda_pos, Fin_renda_neg, Fin_renda_Total \n" +
                                  "from financeiro where Fin_Mes = '"+mes+"' and Fin_Ano = '"+ano+"'";
            
            PreparedStatement ps = getCon().prepareStatement(sql);             
            ResultSet rs = ps.executeQuery();
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            while (rs.next()){
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3)
                });
            }
            TBL_Total.revalidate();
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            System.out.println("ERRO:" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    
    public void TableDentista (){
        
    }
}
