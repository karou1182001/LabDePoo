/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import blackboard.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author María Zapata
 */
public class fUsuario
{
    private Conexion mysql= new Conexion();
    private Connection cn= mysql.conectar();
    private String sSQL= "";
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar)
    {
        //Instanciar tabla
        DefaultTableModel modelo;
        //Crear lista de títulos de la tabla
        String [] titulos= {"Código", "Nombres", "Apellidos", "Edad", "Cédula", 
            "Correo", "Contraseña", "Tipo de Usuario"};
        String [] registro= new String[8];
        //Contador de la cantidad de registros
        totalRegistros=0;
        modelo= new DefaultTableModel(null, titulos);
        //Comando de la base de datos para realizar la acción
        sSQL="select * from registrousuarios where nombres like '%"+ buscar +"%'order by codigo";
        try 
        {
           Statement st= cn.createStatement();
           ResultSet rs= st.executeQuery(sSQL);
           while(rs.next())
           {
               registro[0]= rs.getString("codigo");
               registro[1]= rs.getString("nombres");
               registro[2]= rs.getString("apellidos");
               registro[3]= rs.getString("edad");
               registro[4]= rs.getString("cedula");
               registro[5]= rs.getString("correo");
               registro[6]= rs.getString("contraseña");
               registro[7]= rs.getString("tipoUsuario");
               totalRegistros++;
               //A la tabla modelo le vas a asignar en pantalla los registros de
               //la base de datos
               modelo.addRow(registro);
           }
           //Devuelve la tabla
           return modelo;
        } catch (Exception e) 
        {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar(Persona dts)
    {
        //Comando de la base de datos para realizar la acción
        sSQL="insert into registrousuarios (codigo,nombres,apellidos,edad,cedula,correo,"
                + "contraseña,tipoUsuario)"+ "values (?,?,?,?,?,?,?,?)";
        try 
        {   
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getCodigo());
            pst.setString(2, dts.getNombres());
            pst.setString(3, dts.getApellidos());
            pst.setInt(4, dts.getEdad());
            pst.setInt(5, dts.getCedula());
            pst.setString(6, dts.getCorreo());
            pst.setString(7, dts.getContraseña());
            pst.setString(8, dts.getTipoUsuario());
            
            int n= pst.executeUpdate();
            if(n!=0)
            {
                return true;
            }
            else
            {
                return false;
            }
           
        } catch (Exception e) 
        {
            JOptionPane.showConfirmDialog(null, e);
             return false;
             
        }
    }
    
    public boolean editar(Persona dts)
    {
        //Comando de la base de datos para realizar la acción
        sSQL="update registrousuarios set nombres=?,apellidos=?,edad=?,cedula=?, "
                + "correo=?,contraseña=?,tipoUsuario=? where codigo=?";
        try
        {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombres());
            pst.setString(2, dts.getApellidos());
            pst.setInt(3, dts.getEdad());
            pst.setInt(4, dts.getCedula());
            pst.setString(5, dts.getCorreo());
            pst.setString(6, dts.getContraseña());
            pst.setString(7, dts.getTipoUsuario());
            pst.setInt(8, dts.getCodigo());
            
            int n= pst.executeUpdate();
            if (n!=0)
            {
                return true;
            }
            else
            {
                return false;
            }
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"error acá");
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean eliminar(Persona dts)
    {
        sSQL="delete from registrousuarios where codigo=?";
        try
        {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getCodigo());
            
            int n= pst.executeUpdate();
            if (n!=0)
            {
                return true;
            }
            else
            {
                return false;
            }
            
        } catch (Exception e) 
        {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
}
