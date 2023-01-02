package EjerArraysBidimensionalesManuelFernandez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
    /*
    Crea un array de números y otro de String de 10 posiciones donde insertaremos notas entre 0 y 10
    (debemos controlar que inserte una nota valida), pudiendo ser decimal la nota en el array de números,
    en el de Strings se insertaran los nombres de los alumnos.

    Después, crearemos un array de String donde insertaremos el resultado de la nota con palabras.

    Si la nota esta entre 0 y 4,99 , sera un suspenso
    Si esta entre 5 y 6,99 , sera un bien.
    Si esta entre 7 y 8,99 sera un notable.
    Si esta entre 9 y 10 sera un sobresaliente.

    Muestra por pantalla, el alumno su nota y su resultado en palabras. Crea los métodos que creas conveniente.

    */

    static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int MAXLON = 10; //Longitud maxima de los arrays
        double nota = 0;
        double[] notas = new double[MAXLON];
        String[] nombres = new String[MAXLON];
        //Acumulo nombre y notes en texto
        String[][] nombreNotasTexto = new String[2][MAXLON];

        // Introducir los nombres
        for (int i = 0; i < nombres.length ; i++) {
            System.out.print("Introduce el nombre del Alumno ["+ (i+1) +"]: ");
            nombres[i] = buff.readLine();
        }

        // Introducir y validar las notas
        System.out.println(" Introducimos notas ");
        System.out.println("====================");
        for (int i = 0; i < notas.length ; i++) {
            Boolean check = true;
            while (check) {
                System.out.print("Introduce la nota del Alumno "+ nombres[i]+" : ");
                //Gestiono el error de que introduzca una cadena
                try {
                    nota = Double.parseDouble(buff.readLine());
                } catch (Exception e) {
                    System.out.println("Nota no valida");
                    continue; // Para que no salga del while
                }
                if (nota > 0.0 && nota <= 10.0) {
                    notas[i] = nota;
                    check = false;
                } else {
                    System.out.println("Nota no valida");
                }
            }
        }

        //Muestros los resultados
        System.out.println(" Listado de Notas ");
        System.out.println("====================");
        for (int i = 0 ; i < nombreNotasTexto[0].length ; i++){
                nombreNotasTexto[0][i] = nombres[i];
                nombreNotasTexto[1][i] = convertirNota(notas[i]);
            System.out.println("El alumno: " + nombreNotasTexto[0][i] + " Tiene una nota de: " + nombreNotasTexto[1][i]);
        }
    }

        // Validadcion de la nota introducida
        private static String convertirNota(double nota) {
            String mensaje = "Fallo";
            if (nota > 0 && nota <= 4.99) {
                mensaje = "Suspenso";
            } else if (nota >= 5 && nota <= 6.99) {
                mensaje = "Bien";
            } else if (nota >= 7 && nota <= 8.99) {
                mensaje = "Notable";
            } else if (nota >= 9 && nota <= 10) {
                mensaje = "Sobresaliente";
            }
            return mensaje;
        }
}

