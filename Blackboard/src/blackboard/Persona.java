package blackboard;


public class Persona
{
  //Atributos
  
  protected int codigo;
  public String nombres;
  public String apellidos;
  protected String contraseña;
  public int edad;
  protected int cedula;
  public String correo;
  public String tipoUsuario;

    
  public void verGruposPasados() 
  {
  }

  public void verGruposActuales()
  {
  }

  public void enviarMensaje() 
  {
  }
  
  //Constructores
    public Persona(int codigo, String nombres, String apellidos, String 
            contraseña, int edad, int cedula, String correo, String tipoUsuario) 
    {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.edad = edad;
        this.cedula = cedula;
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
    }
    

    public Persona() 
    {
    }
    
    //Getters and Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
   
  
    
}