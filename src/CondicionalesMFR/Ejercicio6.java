package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

        Ejercicio 6: Realiza un programa que calcule la potencia de un número, dado este y su exponente. Pueden ocurrir tres casos:
        * El exponente sea positivo: imprime el resultado en pantalla.
        * El exponente sea 0, el resultado es 1.
        * El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

*/

public class Ejercicio6 {

    public static void main(String[] args) throws IOException {
        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce La Base: ");
        String lectura = buffer.readLine();

        //Convertir String a Integer
        int base = Integer.parseInt(lectura);

        //Lectura del segundo valor
        System.out.println("Introduce el Exponente: ");
        lectura = buffer.readLine();
        int exponente = Integer.parseInt(lectura);

        if (exponente == 0) {
            System.out.println(" La potencia de base: " + base + " Y exponente:" + exponente + " Es: 1");
        } else {
            if (exponente > 0) {
                System.out.println("La potencia de base: " + base + " Y exponente: " + exponente + " Es: " + Math.pow(base, exponente));
            } else {
                //hago el exponente positivo
                exponente = exponente * -1;
                //Aplico la formula solicitada en el ejercicio "El exponente sea negativo, el resultado es 1/potencia con el exponente positivo."
                System.out.println("La potencia de base: " + base + " Y exponente negativo: " + exponente + " Es: " + (1/(Math.pow(base, exponente))));
            }
        }
    }
}
