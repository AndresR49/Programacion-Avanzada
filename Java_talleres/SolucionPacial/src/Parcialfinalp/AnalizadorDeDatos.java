package Parcialfinalp;

import java.util.ArrayList;

//Se crea una clase llamada Analizador de datos
class AnalizadorDeDatos {
    private ArrayList<ConjuntoDeDatos> conjuntosDeDatos;
    //Constructor de la clase AnalizadorDeDatos.
    public AnalizadorDeDatos() {
        this.conjuntosDeDatos = new ArrayList<>();
    }
    public void añadirConjuntoDeDatos(ConjuntoDeDatos conjuntoDeDatos) {
        conjuntosDeDatos.add(conjuntoDeDatos);
    }

//Metodo para eliminar
    public void eliminarConjuntoDeDatos(String nombre) {
        //se crea una variable vacia
        ConjuntoDeDatos conjuntoEliminar = null;
        //for para buscar
        for (ConjuntoDeDatos conjunto : conjuntosDeDatos) {
            if (conjunto.nombre.equals(nombre)) {

                conjuntoEliminar = conjunto;
                break;
            }
        }
        // condicional
        if (conjuntoEliminar != null) {
            //se elimina lo que este en esa variable en la lista
            conjuntosDeDatos.remove(conjuntoEliminar);
        }
    }

    public ArrayList<String> describirConjuntosDeDatos() {
        ArrayList<String> descripciones = new ArrayList<>();

        for (ConjuntoDeDatos conjunto : conjuntosDeDatos) {
            descripciones.add(conjunto.describir());
        }
        return descripciones;
    }
}
