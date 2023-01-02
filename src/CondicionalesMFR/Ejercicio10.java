package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 10: Escribe un programa que reciba un año y nos diga si es bisiesto o no.
 */


public class Ejercicio10 {

    public static void main(String[] args) throws IOException {

        /*
        Año bisiesto es el divisible entre 4,
        salvo que sea año secular -último de cada siglo, terminado en «00»-,
        en cuyo caso también ha de ser divisible entre 400.
        */


        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un año: ");
        String lectura = buffer.readLine();

        //Convertir String a Integer
        int anno = Integer.parseInt(lectura);

        if (anno % 400 == 0)
            System.out.println("El año: " + anno + " Es bisiesto");
        else if (anno % 4 == 0 && anno % 100 != 0)
            System.out.println("El año: " + anno + " Es bisiesto");
        else
            System.out.println("El año: " + anno + " No es bisiesto");


    }
}
