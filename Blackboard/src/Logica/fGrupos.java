/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import blackboard.Grupo;
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
public class fGrupos
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
        String [] titulos= {"Nrc", "Cantidad de Estudiantes", "Código del curso", 
            "Código del profesor", "Código de Asistente de enseñanza"};
        String [] registro= new String[5];
        //Contador de la cantidad de registros
        totalRegistros=0;
        modelo= new DefaultTableModel(null, titulos);
        //Comando de la base de datos para realizar la acción
        sSQL="select * from grupo where nrc like '%"+ buscar +"%'order by nrc";
        try 
        {
           Statement st= cn.createStatement();
           ResultSet rs= st.executeQuery(sSQL);
           while(rs.next())
           {
               registro[0]= rs.getString("nrc");
               registro[1]= rs.getString("cantEst");
               registro[2]= rs.getString("codCurso");
               registro[3]= rs.getString("codigoProf");
               registro[4]= rs.getString("codAsistEnseñanza");
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
    
    public boolean insertar(Grupo dts)
    {
        //Comando de la base de datos para realizar la acción
        sSQL="insert into grupo (nrc,cantEst,codCurso,codigoProf,codAsistEnseñanza)"
                + "values (?,?,?,?,?)";
        try 
        {   
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getNrc());
            pst.setInt(2, dts.getCantEst());
            pst.setInt(3, dts.getCodCurso());
            pst.setInt(4, dts.getCodigoProf());
            pst.setInt(5, dts.getCodAsistEnseñanza());
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
    
    public boolean editar(Grupo dts)
    {
        //Comando de la base de datos para realizar la acción
        sSQL="update grupo set cantEst=?,codCurso=?,codigoProf=?, "
                + "codAsistEnseñanza=? where nrc=?";
        try
        {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getCantEst());
            pst.setInt(2, dts.getCodCurso());
            pst.setInt(3, dts.getCodigoProf());
            pst.setInt(4, dts.getCodAsistEnseñanza());
            pst.setInt(5, dts.getNrc());
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
    
     public boolean eliminar(Grupo dts)
    {
        sSQL="delete from grupo where nrc=?";
        try
        {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            //Obtenemos el nrc para poder eliminar
            pst.setInt(1, dts.getNrc());
            
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
