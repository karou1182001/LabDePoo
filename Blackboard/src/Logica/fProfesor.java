/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import blackboard.Estudiante;
import blackboard.Profesor;
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
public class fProfesor 
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
        String [] titulos= {"Codigo del profesor", "Área enfasis", "Departamento"};
        String [] registro= new String[3];
        //Contador de la cantidad de registros
        totalRegistros=0;
        modelo= new DefaultTableModel(null, titulos);
        //Comando de la base de datos para realizar la acción
        sSQL="select * from profesor where codigoProf like '%"+ buscar +"%'order by codigoProf";
        try 
        {
           Statement st= cn.createStatement();
           ResultSet rs= st.executeQuery(sSQL);
           while(rs.next())
           {
               registro[0]= rs.getString("codigoProf");
               registro[1]= rs.getString("areaEnfasis");
               registro[2]= rs.getString("departamento");
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
    public boolean insertar(Profesor dts)
    {
        
        //Comando de la base de datos para realizar la acción
        sSQL="insert into profesor(codigoProf,areaEnfasis,departamento)"
                + "values (?,?,?,?)";
        
        try 
        {   
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getCodigoProf());
            pst.setString(2, dts.getAreaEnfasis());
            pst.setString(3, dts.getDepartamento());
            
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
    
}
