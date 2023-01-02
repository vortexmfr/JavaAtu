package EjerArraysBidimensionalesManuelFernandez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
    /*
        Tres en raya! crea el juego de 3 en raya,
        la matriz será de 3x3 y tienen que introducirse los valores por terminal.
     */

    //Reprentaciones de los jugadores y del simbolo vacio
    static final char jugador1 = 'X';
    static final char jugador2 = 'O';
    static final char VACIO = '-';

    //turno actual
    //true = jugador1, false = jugador2
    static boolean turno;

    //tablero donde vamos a jugar
    static char[][] tablero = new char[3][3];

    //Creación de buffer de entrada de datos
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    static void inicializarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = VACIO;
            }
        }
    }

    static void mostrarTablero() {
        System.out.println("Columnas");
        System.out.println("[0][1][2]");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(" "+ tablero[i][j] + " ");
            }
            System.out.println("" + "< Fila:" + i);
        }
    }

    static boolean verificarResultados () {
        boolean gana = false;

        //Horizontales
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2])
                gana = true;
        }

        //Verticales
        for (int j = 0; j < tablero.length; j++) {
            if (tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j])
                gana = true;
        }

        //Diagonales
        if ((tablero[2][0] == tablero[1][1] && tablero[1][1] == tablero[0][2]) ||
            (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2])) {
            gana = true;
        }

        return gana;
    }

    static int validaEntrada(String cadena) throws IOException {
        int valor;
        do {
            System.out.print(cadena);
            String lectura = buffer.readLine();
            //Manejo la excepción de una entrada no válida
            try {
                valor = Integer.parseInt(lectura);
            } catch (NumberFormatException ex) {
                valor= -1;
            }
        } while ( valor < 0 || valor > 2);
        return valor;
    }

    static void pedirCoordenadasJugador(boolean tur) throws IOException {
        int coor1, coor2;
        //compruebo que este libre la coordenada
        do {
            coor2 = validaEntrada("Introduce la Columna [0,1,2]: ");
            coor1 = validaEntrada("Introduce la Fila [0,1,2]: ");
        } while (tablero[coor1][coor2] != '-');

        //Dependiendo del jugador que este jugando anoto "X" o "O"
        if (tur) {
            tablero[coor1][coor2] = jugador1;
        } else {
            tablero[coor1][coor2] = jugador2;
        }
    }

    public static void main(String[] args) throws IOException {

        inicializarTablero();
        mostrarTablero();
        //Comienza el jugador1
        System.out.println("El turno es para el Jugador 1");
        turno = true;

        for (int i = 0; i < 9; i++) {
            pedirCoordenadasJugador(turno);
            mostrarTablero();
            //cambio de jugador
            turno = !turno;
            if (turno)
                System.out.println("El turno es para Jugador 1");
            else
                System.out.println("El turno es para Jugador 2");

            //Después de la cuarta tirada (al manos un jugador puso las 3 fichas) comienzo a verificar
            if (i > 3 && verificarResultados() == true ) {
                    System.out.println("ENHORABUENA HAS GANADO!!!");
                    //Termino el juego saliendo el bucle for, al encontrar un ganador.
                    break;
            }
        }

    }
}
