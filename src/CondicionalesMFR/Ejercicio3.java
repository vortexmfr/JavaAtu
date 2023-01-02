package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Ejercicio 3: Realiza un programa que pida un número por teclado y nos indique si es par o impar
 */
public class Ejercicio3 {
    public static void main(String[] args) throws IOException {

        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el valor a operar: ");
        String lectura = buffer.readLine();

        //Convertir String a Integer
        int numero1 = Integer.parseInt(lectura);

        System.out.println("Numero Par");
        if (numero1 % 2 == 0) {
            System.out.println("El numero: " + numero1 + " Es Par");
        } else {
            System.out.println("El numero: " + numero1 + " Es Impar");
        }
    }
}
