/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class connection {
    public static Connection connect(){
        try{
            //String username = "root";
           // String pass = "12345";
           // String sqlconnect = "jdbc:mysql://localhost:3307/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
          
            Class.forName("com.mysql. jdbc.Driver");  
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql//localhost/database","root","");
            JOptionPane.showMessageDialog( null, "connected" );
            return conn;
        
                    }catch(Exception e){
        JOptionPane.showMessageDialog( null, e );
        }
        return null;
    }
}
