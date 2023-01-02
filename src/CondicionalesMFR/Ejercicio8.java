package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 8: Realiza un programa que pida los puntos centrales de dos circunferencias (x1, y1), (x2, y2) y los radios de las mismas (r1, r2).
El programa debe clasificar según corresponda como: exteriores, tangentes exteriores, secantes, tangentes interiores, interiores o concéntricas.
 */

public class Ejercicio8 {

    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el punto central X1 de la circunferencia 1  : ");
        String lectura = buffer.readLine();
        //Convertir String a Integer
        int X1 = Integer.parseInt(lectura);

        System.out.println("Introduce el punto central Y1 de la circunferencia 1  :");
        lectura = buffer.readLine();
        int Y1 = Integer.parseInt(lectura);

        System.out.println("Introduce el punto central X2 de la circunferencia 2  : ");
        lectura = buffer.readLine();
        int X2 = Integer.parseInt(lectura);

        System.out.println("Introduce el punto central Y2 de la circunferencia 1  : ");
        lectura = buffer.readLine();
        int Y2 = Integer.parseInt(lectura);

        System.out.println("Introduce el radio R1 de la circunferencia 1  : ");
        lectura = buffer.readLine();
        int R1 = Integer.parseInt(lectura);

        System.out.println("Introduce el radio R2 de la circunferencia 2: ");
        lectura = buffer.readLine();
        int R2 = Integer.parseInt(lectura);



        //Calculamos la distancia entre ambas circumferencias
        // Distancia = RaizCuadrada( (X2-X1)^2 + (Y2-Y1)^2 )
        double distancia = Math.sqrt(Math.pow((X2-X1),2)+ Math.pow((Y2-Y1),2));
        System.out.println("La distancia es: "+ distancia);

        /*  TIPOS DE CIRCUNFERENCIAS
            http://maralboran.org/wikipedia/index.php/Plantilla:Posici%C3%B3n_circ-circ
            Si distancia = 0, ambas circunferencias serán concéntricas.
            Si distancia > (r1+r2), son circunferencias exteriores.
            Si distancia > 0 y distancia < valor absoluto de (r1-r2), son circunferencias interiores.
            Si distancia = (r1+r2), son circunferencias tangentes exteriores.
            Si distancia = valor absoluto de (r1-r2), son tangentes interiores.
            Si distancia < (r1 + r2) y distancia > valor absoluto de (r1-r2), son circunferencias secantes.
         */

        if (distancia == 0) {
            System.out.println("Circunferencias Concéntricas.");
        } else if (distancia > (R1+R2)) {
            System.out.println("Circunferencias Exteriores.");
        } else if ((distancia > 0) && distancia < Math.abs(R1-R2)) {
            System.out.println("Circunferencias Interiores.");
        } else if (distancia == (R1+R2)) {
            System.out.println("Circunferencias Tangentes exteriores.");
        } else if (distancia == Math.abs(R1-R2)) {
            System.out.println("Circunferencias Tangentes interiores.");
        } else if (distancia < (R1+R2) && distancia > Math.abs(R1-R2)) {
            System.out.println("Circunferencias Secantes.");
        }
    }
}
