/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package system;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
        

/**
 *
 * @author chris
 */
public class System {
  
   
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       loading load = new loading();
       load.setVisible(true);
       
       
       login log = new login();
        try{
            for(int i = 0; i<=100; i++){
            
            Thread.sleep(20);
            load.progress.setValue(i);
            
            
                    
            }
            
        
        
        }catch (Exception e){
            
  
        }
        new loading().setVisible(false);
        log.setVisible(true);
        load.dispose();
        
   
    }
   
    
}
