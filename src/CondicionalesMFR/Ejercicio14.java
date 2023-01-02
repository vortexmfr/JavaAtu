package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Ejercicio 14: Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras
    y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
    Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
    Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”.
 */


public class Ejercicio14 {

    public static void main(String[] args) throws IOException {
        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la tirada del dado [1-6]: ");
        String lectura = buffer.readLine();

        //Convertir String a Integer
        int dado = Integer.parseInt(lectura);

        switch (dado) {
            case 1:
                System.out.println("Cara opuesta SEIS");
                break;
            case 2:
                System.out.println("Cara opuesta CINCO");
                break;
            case 3:
                System.out.println("Cara opuesta CUATRO");
                break;
            case 4:
                System.out.println("Cara opuesta TRES");
                break;
            case 5:
                System.out.println("Cara opuesta DOS");
                break;
            case 6:
                System.out.println("Cara opuesta UNO");
                break;
            default:
                System.out.println("ERROR: número incorrecto");
                break;
        }
    }
}
