package Parcialfinalp;
//Se crea la clase ConjuntoDeDatosImagen con herencia de ConjuntoDeDatos
class ConjuntoDeDatosImagen extends ConjuntoDeDatos {
    private int ancho;
    private int alto;

    //Constructor de ConjuntoDeDatosImagen
    public ConjuntoDeDatosImagen(String nombre, int tamanio, int ancho, int alto) {
        super(nombre, tamanio);
        this.ancho = ancho;
        this.alto = alto;
    }

    //Método describir. Devuelve una descripción del conjunto de datos de tipo imagen.

    @Override
    public String describir() {
        return "Nombre: " + nombre + "\n" +
                "Tamaño: " + tamano + "\n" +
                "Tipo: Imagen" + "\n" +
                "Ancho: " + ancho + "\n" +
                "Alto: " + alto;
    }
}
