package EjerciciosWhileManuelFdez;

import LoopsMFR.CalculadoraMenuManuelFdez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

    /*
        2.- Interactuemos un poco con el usuario final pidiéndole un valor inicial y un valor final por consola,
        e incrementemos el valor inicial dado hasta el tope establecido, mostrando el valor de la variable contadora en cada iteracion
    */

    // Declaracion de Variables
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static int valor1;
    static int valor2;
    static int iteraccion = 1;

    //Declaracion de Funciones
    public static void solicitarNumero() throws IOException {
        System.out.println("Introduce Valor Inicial :");
        valor1 = Integer.parseInt(buffer.readLine());
        System.out.println("Intorduce Valor Final:");
        valor2 = Integer.parseInt(buffer.readLine());
    }

    public static void main (String[] args) throws IOException {

        solicitarNumero();

        //validar los valores introducidos
        if (valor1 > valor2) {
            while (valor1 >= valor2) {
                System.out.println("Valor de la iteracion " + iteraccion + " Es: " + valor2 + " de un total de: " + valor1);
                valor2++;
                iteraccion++;
            }
        } else {
            while (valor2 >= valor1) {
                System.out.println("Valor de la iteracion " + iteraccion + " Es: " + valor1 + " de un total de: " + valor2);
                valor1++;
                iteraccion++;
            }
        }
    }
}
