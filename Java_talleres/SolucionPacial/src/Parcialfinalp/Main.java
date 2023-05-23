package Parcialfinalp;

import java.util.ArrayList;

/*
- Respuestas teoría
- 1. a. Verdadero- 2. a. Verdadero- 3. b. Falso- 4. Verdadero- 5. Verdadero
- 6. A) - 7. D) - 8. D) - 9. A) - 10. D)
*/

//Se crea la clase main de solucion del parcial
public class Main {
    public static void main(String[] args) {
        AnalizadorDeDatos analizador = new AnalizadorDeDatos();

        ConjuntoDeDatosTabular conjuntoTabular = new ConjuntoDeDatosTabular("Trabajadores", 90, 9, 10);
        analizador.añadirConjuntoDeDatos(conjuntoTabular);

        ConjuntoDeDatosImagen conjuntoImagen1 = new ConjuntoDeDatosImagen("Fotos", 100, 60, 90);
        analizador.añadirConjuntoDeDatos(conjuntoImagen1);

        ConjuntoDeDatosImagen conjuntoImagen2 = new ConjuntoDeDatosImagen("Imágenes", 400, 200, 310);
        analizador.añadirConjuntoDeDatos(conjuntoImagen2);

        ArrayList<String> descripciones = analizador.describirConjuntosDeDatos();
        for (String descripcion : descripciones) {
            System.out.println(descripcion);
            System.out.println("------------------------------");
        }
    }
}
