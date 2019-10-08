/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import blackboard.Estudiante;
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
public class fEstudiante
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
        String [] titulos= {"Codigo del estudiante", "carrera", "semestre", 
            "¿Es asistente de enseñanza?"};
        String [] registro= new String[4];
        //Contador de la cantidad de registros
        totalRegistros=0;
        modelo= new DefaultTableModel(null, titulos);
        //Comando de la base de datos para realizar la acción
        sSQL="select * from estudiante where codigoEst like '%"+ buscar +"%'order by codigoEst";
        try 
        {
           Statement st= cn.createStatement();
           ResultSet rs= st.executeQuery(sSQL);
           while(rs.next())
           {
               registro[0]= rs.getString("codigoEst");
               registro[1]= rs.getString("carrera");
               registro[2]= rs.getString("semestre");
               registro[3]= rs.getString("asistenteEnseñanza");
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
    
     public boolean insertar(Estudiante dts)
    {
        
        //Comando de la base de datos para realizar la acción
        sSQL="insert into estudiante(codigoEst,carrera,semestre,asistenteEnseñanza)"
                + "values (?,?,?,?)";
        
        try 
        {   
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getCodigoEst());
            pst.setString(2, dts.getCarrera());
            pst.setInt(3, dts.getSemestre());
            pst.setString(4, dts.getAsistenteEnseñanza());
            
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
    public boolean editar(Estudiante dts)
    {
        //Comando de la base de datos para realizar la acción
        sSQL="update curso set carrera=?,semestre=?,asistenteEnseñanza=?"
              + "where codigoEst=?";
        try
        {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getCarrera());
            pst.setInt(2, dts.getSemestre());
            pst.setString(3, dts.getAsistenteEnseñanza());
            pst.setInt(4, dts.getCodigoEst());
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
    
    public boolean eliminar(Estudiante dts)
    {
        sSQL="delete from estudiante where codigoEst=?";
        try
        {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            //Obtenemos el nrc para poder eliminar
            pst.setInt(1, dts.getCodigoEst());
            
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
