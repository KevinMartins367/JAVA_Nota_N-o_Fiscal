package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    
    public static Connection abrirConexao(){
    
        Connection con = null;
        try{
            String url = "jdbc:mysql://127.0.0.1/bdlabororto?user=root&password=root";
            
            con = (Connection) DriverManager.getConnection(url);
            
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao conectar","Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro","Erro",JOptionPane.ERROR_MESSAGE); 
            
        }
        return con; 
    }  
}