package Parcialfinalp;

//Se crea una clase llamada ConjuntoDeDatosTabular con herencia de ConjuntoDeDatos
class ConjuntoDeDatosTabular extends ConjuntoDeDatos {
    private int nColumnas;
    private int nFilas;

    //Constructor de ConjuntoDeDatosTabular
    public ConjuntoDeDatosTabular(String nombre, int tamano, int numeroDeColumnas, int numeroDeFilas) {
        super(nombre, tamano);
        this.nColumnas = nColumnas;
        this.nFilas = nFilas;
    }

    //se reescribe describir para esta clase

    @Override
    public String describir() {
        return "Nombre: " + nombre + "\n" +
                "Tamaño: " + tamano + "\n" +
                "Tipo: Tabular" + "\n" +
                "Filas: " + nFilas + "\n" +
                "Columnas: " + nColumnas;
    }
}
