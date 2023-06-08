/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhodeprogramacao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Bento Ambrósio
 */
public class ConexaoBD {
    
    Statement conec = null;
    ResultSet result = null;
    
   public Connection conet() throws ClassNotFoundException{
       Connection conecta = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql//localhost:3306/programa?user=root&password=";
            conecta = DriverManager.getConnection(url);
    }catch(SQLException ex){
            System.out.println("");
    }
        return conecta;
   }
    
   
    
    
}
