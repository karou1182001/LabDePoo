package blackboard;

import java.util.ArrayList;

public class Profesor extends Persona
{

  public String areaEnfasis;
  public ArrayList<Grupo> elGrupodeProf;
  
  //Constructores

    public Profesor(String areaEnfasis) 
    {
        this.areaEnfasis = areaEnfasis;
    }
    
    //Getters and setters
    public String getAreaEnfasis() 
    {
        return areaEnfasis;
    }

    public void setAreaEnfasis(String areaEnfasis)
    {
        this.areaEnfasis = areaEnfasis;
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