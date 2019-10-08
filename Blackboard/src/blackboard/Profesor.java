package blackboard;

import java.util.ArrayList;

public class Profesor extends Persona
{

  public String areaEnfasis;
  public String departamento;
  public int codigoProf;
  //public ArrayList<Grupo> elGrupodeProf;
  
  //Constructores

    public Profesor(String areaEnfasis, String departamento, int codigoProf)
    {
        this.areaEnfasis = areaEnfasis;
        this.departamento = departamento;
        this.codigoProf = codigoProf;
    }

    public Profesor() 
    {
    }

    
    
    //Getters and setters

    public String getAreaEnfasis() {
        return areaEnfasis;
    }

    public void setAreaEnfasis(String areaEnfasis) {
        this.areaEnfasis = areaEnfasis;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCodigoProf() {
        return codigoProf;
    }

    public void setCodigoProf(int codigoProf) {
        this.codigoProf = codigoProf;
    }
    
    
  
  
  //Métodos generales
  public void calificar()
  {
  }

  public void crearCarpetas() 
  {
  }

  public void crearEnlaces()
  {
  }

  public void crearEvaluacion() 
  {
  }

  public void publicarAnuncio()
  {
  }

  public void crearGrupoEval()
  {
  }

  public void cargarDoc() 
  {
  }

  public void crearColCalif() 
  {
  }

}