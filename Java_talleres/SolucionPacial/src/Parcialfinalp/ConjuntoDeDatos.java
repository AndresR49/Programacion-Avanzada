package Parcialfinalp;

//Se crea una clase abstracta llamada ConjuntoDeDatos
abstract class ConjuntoDeDatos {
    protected String nombre;
    protected int tamano;
   //Se crea el contructor de la clase
    public ConjuntoDeDatos(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }
    //Método abstracto describir.
    public abstract String describir();
}
