package Val;

public class practicante extends alumno {
    //atributos propios de la subclase
    private String idpracticante;

    //constructor
    public practicante(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        idpracticante = "unknown";
    }

    //metodos propios de la subclase
    public void setidpracticante(String idpracticante) {
        this.idpracticante = idpracticante;
    }

    public String getidpracticante() {
        return idpracticante;
    }

    public String tostring() {
        return "" + getnombre() + "" + getapellidos() + " - " + getedad() + " - " + getidpracticante();
    }
}