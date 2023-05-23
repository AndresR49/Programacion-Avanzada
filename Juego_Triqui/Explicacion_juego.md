Juego del triqui en Java. Se explicará su función:

- Se importa la clase `Scanner` del paquete `java.util` para permitir la entrada de datos desde el teclado.

- Se declara la clase `Triqui` que contiene la lógica del juego.

- Se definen dos constantes `JUGADOR1` y `JUGADOR2` que representan los símbolos de los jugadores en el juego ('O' y 'X' respectivamente).

- Se declara una matriz de caracteres llamada `tablero` de tamaño 3x3 para representar el estado del juego.

- Se declara la variable `jugadorActual` que indica cuál jugador tiene el turno en el juego.

- En el constructor de la clase `Triqui`, se inicializa el tablero llamando al método `inicializarTablero()`, se establece `JUGADOR1` como el jugador actual y se inicializa el tablero con espacios en blanco.

- El método `imprimirTablero()` se encarga de mostrar el estado actual del tablero en la consola. Utiliza ciclos `for` para recorrer las filas y columnas de la matriz, y muestra el contenido de cada celda con bordes y separadores.

- El método `cambiarJugador()` actualiza la variable `jugadorActual` cambiándola al siguiente jugador. Si el jugador actual es `JUGADOR1`, se cambia a `JUGADOR2`, y viceversa.

- El método `realizarMovimiento(int fila, int columna)` permite a un jugador realizar un movimiento en el tablero. Verifica si la posición especificada es válida (dentro de los límites del tablero y sin estar ocupada) y actualiza el tablero con el símbolo del jugador actual. Retorna `true` si el movimiento se realizó con éxito, o `false` si la posición no es válida.

El código también incluye un método `jugar()` que se encarga de ejecutar el juego completo. Utiliza un objeto `Scanner` para leer las entradas del usuario desde el teclado. En cada iteración del bucle principal, muestra el estado actual del tablero, solicita al jugador actual que ingrese una fila y columna para realizar su movimiento, verifica si hay un ganador y actualiza el jugador actual. El juego termina cuando hay un ganador.

Finalmente, el método `main()` crea una instancia de la clase `Triqui` y llama al método `jugar()` para iniciar el juego.

Este código en Java te permite jugar al triqui en la consola, interactuando con los jugadores y mostrando el estado del tablero en cada turno.
