package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 4: Crea un programa que pida al usuario dos números y muestre el resultado de su división.
Si el segundo número es 0, debe mostrar un mensaje de error.
 */

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el Dividendo: ");
        String lectura = buffer.readLine();

        //Convertir String a Integer
        float numero1 = Float.parseFloat(lectura);

        //Lectura del segundo valor
        System.out.println("Introduce el Divisor: ");
        lectura = buffer.readLine();
        float numero2 = Float.parseFloat(lectura);

        if (numero2 == 0) {
            System.out.println("Error en el divisor; este debe de ser mayor que Cero");
        } else {
            System.out.println("La divison de: " + numero1 + " Dividido entre: "+ numero2 + " Es: " + numero1/numero2 );
        }

    }
}
