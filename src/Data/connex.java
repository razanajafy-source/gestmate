/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ANONYME
 */
public class connex {
    Connection conn = null;
     public static Connection ConnexionDB(){
     try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/plan" ,"root" ,"");
          
            return conn;
     }catch(ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null,e);
     return null;
     }
        
    
    }
}
