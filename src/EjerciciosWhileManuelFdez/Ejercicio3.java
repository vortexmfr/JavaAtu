package EjerciciosWhileManuelFdez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

    /*
        3.- Vamos a generar un número aleatorio entre el 1 y el 100 y le vamos a pedir al usuario que lo adivine,
        sin embargo lo vamos a ayudar un poco por cada respuesta le diremos si está más por debajo o por encima del valor hasta que lo adivine
     */

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int valor1 = 0;
        //Generar numero aleatorio
        int numero = (int)(Math.random()*100+1);


        System.out.println("***********************************");
        System.out.println("**    Bienvenido al programa     **");
        System.out.println("**   Adivina el numero oculto    **");
        System.out.println("***********************************");

        while (numero != valor1) {
            System.out.println("¿Cual crees que es numero secreto? :");
            valor1 = Integer.parseInt(buffer.readLine());
            if (valor1 == numero) {
                System.out.println(" Genial has ACERTADO, el numero secreto es: "+ numero);
            } else {
                if (valor1 > numero) {
                    System.out.println(" Pista ==> El valor secreto es Menor");
                } else {
                    System.out.println(" Pista ==> El valor secreto es Mayor");
                }
            }

        }
    }
}
