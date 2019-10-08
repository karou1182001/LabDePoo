package blackboard;

//import java.util.ArrayList;


public class Curso 
{
  //Atributos
  public String codCurso;
  public String nomCurso;
  public String directorCurso;
  public int cantProfesores;
  //public ArrayList<Grupo> elGrupo;
  
  //Constructores

    public Curso(String codCurso, String nomCurso, String directorCurso, int 
            cantProfesores) 
    {
        this.codCurso = codCurso;
        this.nomCurso = nomCurso;
        this.directorCurso = directorCurso;
        this.cantProfesores = cantProfesores;
    }

    public Curso() 
    {
    }
    //Getters ans setters

    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public String getNomCurso() {
        return nomCurso;
    }

    public void setNomCurso(String nomCurso) {
        this.nomCurso = nomCurso;
    }

    public String getDirectorCurso() {
        return directorCurso;
    }

    public void setDirectorCurso(String directorCurso) {
        this.directorCurso = directorCurso;
    }

    public int getCantProfesores() {
        return cantProfesores;
    }

    public void setCantProfesores(int cantProfesores) {
        this.cantProfesores = cantProfesores;
    }
    
  
}