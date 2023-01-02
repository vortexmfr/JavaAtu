package EjerciciosArraysManuelFernandez;

/*
Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas).
Después, ve pidiendo posiciones del array por teclado y si la posicion es correcta,
se añadira a una cadena que se mostrara al final, se dejará de insertar cuando se introduzca un -1.

Por ejemplo, si escribo los siguientes numeros
0 //Añadira la ‘A’
5 //Añadira la ‘F’
25 //Añadira la ‘Z’
50 //Error, inserte otro numero
-1 //fin

Cadena resultante: AFZ
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {

        char[] arrayLetras  = { 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','Y','Z'};
        String cadena = "";
        int posicion1 = 0;

        while (posicion1 != -1) {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce una posicion del array, (Para salir teclea -1)");
            String lectura = buffer.readLine();
            posicion1 = Integer.parseInt(lectura);

            if (posicion1 > 0 && posicion1 <= arrayLetras.length) {
                System.out.println("La letra en la posicion: " + posicion1 + " es: " + arrayLetras[posicion1]);
                cadena = cadena + arrayLetras[posicion1];
            } else if (posicion1 != -1) {
                System.out.println(" Error inserte otro numero");
            } else {
                System.out.println("Saliendo del programa... hasta la proxima");
            }
        }
        System.out.println("La cadena resultante es: "+ cadena);

    }

}
