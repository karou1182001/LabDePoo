package blackboard;

//import java.util.ArrayList;

public class Estudiante extends Persona 
{
  //Atributos
  public int codigoEst;
  public String carrera;
  public Integer semestre;
  public String asistenteEnseñanza;
//  public ArrayList<Grupo> grupos;
//  public ArrayList<Calificacion> calificaciones;
//  public ArrayList<GrupoEvaluacion> gruposEval;

  public void cargarDoc() 
  {
      
  }
  
  //Constructores

    public Estudiante(int codigoEst, String carrera, Integer semestre, String
            asistenteEnseñanza) 
    {
        this.codigoEst = codigoEst;
        this.carrera = carrera;
        this.semestre = semestre;
        this.asistenteEnseñanza = asistenteEnseñanza;
    }

    public Estudiante() 
    {
    }

    public int getCodigoEst() {
        return codigoEst;
    }

    public void setCodigoEst(int codigoEst) {
        this.codigoEst = codigoEst;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getAsistenteEnseñanza() {
        return asistenteEnseñanza;
    }

    public void setAsistenteEnseñanza(String asistenteEnseñanza) {
        this.asistenteEnseñanza = asistenteEnseñanza;
    }
    
    
  

}