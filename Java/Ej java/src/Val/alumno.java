package Val;

public class alumno extends Persona{
    //atributos propios de la subclase
    private String idalumno;

    //constructor
    public alumno (String nombre, String apellidos, int edad){
        super (nombre, apellidos, edad);
        idalumno = "unknown";
    }

    //metodos propios de la subclase
    public void setidalumno (String idalumno){
        this.idalumno = idalumno;
    }

    public String getidalumno(){
        return idalumno;}

    public String tostring(){
        return ""+getnombre()+""+getapellidos()+" - "+getedad()+" - "+getidalumno();
    }
}