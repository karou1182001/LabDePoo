/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import blackboard.Curso;
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
public class fCurso 
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
        String [] titulos= {"Codigo del curso", "Nombre del curso", "Director del curso", 
            "Cantidad de profesores"};
        String [] registro= new String[4];
        //Contador de la cantidad de registros
        totalRegistros=0;
        modelo= new DefaultTableModel(null, titulos);
        //Comando de la base de datos para realizar la acción
        sSQL="select * from curso where nomCurso like '%"+ buscar +"%'order by codCurso";
        try 
        {
           Statement st= cn.createStatement();
           ResultSet rs= st.executeQuery(sSQL);
           while(rs.next())
           {
               registro[0]= rs.getString("codCurso");
               registro[1]= rs.getString("nomCurso");
               registro[2]= rs.getString("directorCurso");
               registro[3]= rs.getString("cantProfesores");
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
     
     public boolean insertar(Curso dts)
    {
        //Comando de la base de datos para realizar la acción
        sSQL="insert into curso(codCurso,nomCurso,directorCurso,cantProfesores)"
                + "values (?,?,?,?)";
        try 
        {   
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getCodCurso());
            pst.setString(2, dts.getNomCurso());
            pst.setString(3, dts.getDirectorCurso());
            pst.setInt(4, dts.getCantProfesores());
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
    
      public boolean editar(Curso dts)
    {
        //Comando de la base de datos para realizar la acción
        sSQL="update curso set nomCurso=?, directorCurso=?,cantProfesores=?"
              + "where codCurso=?";
        try
        {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNomCurso());
            pst.setString(2, dts.getDirectorCurso());
            pst.setInt(3, dts.getCantProfesores());
            pst.setString(4, dts.getCodCurso());
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
      
     public boolean eliminar(Curso dts)
    {
        sSQL="delete from grupo where codCurso=?";
        try
        {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            //Obtenemos el nrc para poder eliminar
            pst.setString(1, dts.getCodCurso());
            
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
