import java.util.Scanner;

public class Triqui {
    // Se define los símbolos
    private static final char JUGADOR1 = 'O';
    private static final char JUGADOR2 = 'X';

    // Se defina una matriz 3x3
    private char[][] tablero;
    private char jugadorActual;

    // Constructor de la clase
    public Triqui() {
        tablero = new char[3][3];
        jugadorActual = JUGADOR1;
        inicializarTablero();
    }
    // Método para inicializar el tablero
    private void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }
    // Método para imprimir el tablero actual
    private void imprimirTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    // Método para cambiar al siguiente jugador
    private void cambiarJugador() {
        if (jugadorActual == JUGADOR1) {
            jugadorActual = JUGADOR2;
        } else {
            jugadorActual = JUGADOR1;
        }
    }
    // Método para realizar un movimiento en el tablero
    private boolean realizarMovimiento(int fila, int columna) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
            tablero[fila][columna] = jugadorActual;
            return true;
        }
        return false;
    }
    // Método para verificar si hay un ganador en todos las direcciones
    private boolean hayGanador() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugadorActual && tablero[1][j] == jugadorActual && tablero[2][j] == jugadorActual) {
                return true;
            }
        }
        if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
            return true;
        }

        return false;
    }
    // Método para jugar a triqui
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        System.out.println("-----Bienvenido a Triqui-----");
        System.out.println("Jugador 1: " + JUGADOR1);
        System.out.println("Jugador 2: " + JUGADOR2);
        System.out.println("Empieza el jugador 1.");

        while (!juegoTerminado) {
            imprimirTablero();

            System.out.print("Jugador " + jugadorActual + ", ingrese un numero del (0-2) para la fila: ");
            int fila = scanner.nextInt();

            System.out.print("Jugador " + jugadorActual + ", ingrese un numero del (0-2) para la columna: ");
            int columna = scanner.nextInt();

            if (realizarMovimiento(fila, columna)) {
                if (hayGanador()) {
                    System.out.println("¡Felicidades, jugador " + jugadorActual + "! Has ganado.");
                    juegoTerminado = true;
                } else {
                    cambiarJugador();
                }
            } else {
                System.out.println("Ubicacion incorrecta. Intenta nuevamente.");
            }
        }
        imprimirTablero();
        scanner.close();
    }
    // main para ejecutar el juego
    public static void main(String[] args) {
        Triqui juego = new Triqui();
        juego.jugar();
    }
}
