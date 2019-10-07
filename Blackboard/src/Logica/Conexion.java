/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author María Zapata
 */
public class Conexion
{
    public String db= "baseblackboard";
    public String url="jdbc:mysql://127.0.0.1/" + db;
    public String user= "root";
    public String pass="";
    
    //Constructor:
    public Conexion()
    {
        
    }
    
    //Método de conexión
    public Connection conectar()
    {
       Connection link= null;
        try 
        {
           
           Class.forName("org.gjt.mm.mysql.Driver");
           link= DriverManager.getConnection(this.url, this.user, this.pass);
          
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
    
}
