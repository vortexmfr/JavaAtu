package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
/*
Ejercicio 5: Realiza un programa que lea una cadena por teclado y compruebe si esta en mayusculas
 */

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce una cadena de caracteres: ");
        String lectura = buffer.readLine();

        // Verifico si la cadena introducida es igual que la covertida a mayusculas.

        if (lectura == lectura.toUpperCase(Locale.ROOT))
            System.out.println("La cadena: " + lectura + " Esta en mayusculas");
        else
            System.out.println("La cadena: " + lectura + " Esta en minusculas");
    }
}
