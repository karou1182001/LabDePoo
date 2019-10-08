package blackboard;

//import java.util.ArrayList;

public class Grupo
{
  //Atributos
  public int nrc;
  public int cantEst;
  public int codCurso;
  public int codigoProf;
  public int codAsistEnseñanza;
  
//  public WebMail elWebMail;
//  public Contenido elContenido;
//  public ArrayList<Estudiante> elEstudiante;
//  public ArrayList<Profesor> elProfesor;
//  public ArrayList<DocenteAuxiliar> elDocenteAux;
//  public ArrayList<Evaluacion> laEvaluacion;
//  public ArrayList<Calificacion> laCalificacion;
  
//Contructores

    public Grupo(int nrc, int cantEst, int codCurso, int codigoProf,
            int codAsistEnseñanza) 
    {
        this.nrc = nrc;
        this.cantEst = cantEst;
        this.codCurso = codCurso;
        this.codigoProf = codigoProf;
        this.codAsistEnseñanza = codAsistEnseñanza;
    }

    public Grupo()
    {
    }
 //Getters and setters

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public int getCantEst() {
        return cantEst;
    }

    public void setCantEst(int cantEst) {
        this.cantEst = cantEst;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public int getCodigoProf() {
        return codigoProf;
    }

    public void setCodigoProf(int codigoProf) {
        this.codigoProf = codigoProf;
    }

    public int getCodAsistEnseñanza() {
        return codAsistEnseñanza;
    }

    public void setCodAsistEnseñanza(int codAsistEnseñanza) {
        this.codAsistEnseñanza = codAsistEnseñanza;
    }
    
  
}