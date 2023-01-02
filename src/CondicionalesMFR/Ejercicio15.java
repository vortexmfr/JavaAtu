package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 15: Realiza un programa que pida el día de la semana (del 1 al 7)
y escriba el día correspondiente. Si introducimos otro número nos da un error.
 */


public class Ejercicio15 {


    public static void main(String[] args) throws IOException {
        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el dia de la semana [1-7]: ");
        String lectura = buffer.readLine();

        //Convertir String a Integer
        int dado = Integer.parseInt(lectura);

        switch (dado) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domindo");
                break;
            default:
                System.out.println("ERROR: Dia de la semana incorrecto");
                break;
        }
    }
}
