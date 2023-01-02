package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 1: Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
Ejercicio 2: Realiza un programa que reciba dos números por teclado e indique cuál es menor o si son iguales.
 */


public class Ejercicio1y2 {

    public static void main(String[] args) throws IOException {
        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el valor a operar: ");
        String lectura = buffer.readLine();

        //Convertir String a Integer
        int numero1 = Integer.parseInt(lectura);

        //Lectura del segundo valor
        System.out.println("Introduce el segundo valor a operar: ");
        lectura = buffer.readLine();
        int numero2 = Integer.parseInt(lectura);

        if (numero1 > numero2) {
            System.out.println("El numero: " + numero1 + " Es mayor que: " + numero2);
        } else {
            if (numero1 == numero2){
                System.out.println("El numero: " + numero2 + " Es Igual que: " + numero1);
            } else {
            System.out.println("El numero: " + numero2 + " Es mayor que: " + numero1);
            }
        }
    }
}
