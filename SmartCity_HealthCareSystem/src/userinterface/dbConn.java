package userinterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wilson
 */
public class dbConn {
 static Connection conn=null;
    public static Connection getConn(){
        
        try {
            
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
          return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        } catch (ClassNotFoundException ex) {
         Logger.getLogger(dbConn.class.getName()).log(Level.SEVERE, null, ex);
         return null;
     }
    
   
    }  
}
