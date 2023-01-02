package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 9: Realiza un programa que clasifique un triángulo tras recibir el tamaño de sus lados.
Se debe clasificar como triángulo rectángulo, isósceles, equilátero o escaleno.
 */

public class Ejercicio9 {
    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el LadoA  : ");
        String lectura = buffer.readLine();
        //Convertir String a Integer
        float la = Float.parseFloat(lectura);

        System.out.println("Introduce el LadoB  :");
        lectura = buffer.readLine();
        float lb = Float.parseFloat(lectura);

        System.out.println("Introduce el LadoC : ");
        lectura = buffer.readLine();
        float lc = Float.parseFloat(lectura);

        /* Conceptos Geometricos
        Rectangulo => Pitagoras  => H^2 = C1^2 + C2^2
        Isosceles => Si solo 2 lados del rectagulo son iguales
        Equilatero => Si los 3 lados son iguales
        Escaleno => Si no se cumplen las condiciones anteriores.
        */

        if (la == lb && la == lc && lb == lc) {
            System.out.println("El triangulo es EQUILATERO");
        } else if (la == lb || la == lc || lb == lc) {
            System.out.println("El triangulo es ISOSCELES");
        } else {
            System.out.println("El triangulo es ESCALENO");
        }

        //Verifico si es rectangulo H^2 = C1^2 + C2^2
        if (Math.round((Math.pow(la, 2))) == Math.round ((Math.pow(lb, 2)) + (Math.pow(lc, 2)))) {
            System.out.println("... Y ademas Triangulo RECTANGULO");
        } else if ((Math.round(Math.pow(lb, 2))) == Math.round((Math.pow(lc, 2)) + (Math.pow(la, 2)))) {
            System.out.println("... Y ademas Triangulo RECTANGULO");
        } else if ((Math.round(Math.pow(lc, 2))) == Math.round((Math.pow(la, 2)) + (Math.pow(lb, 2)))) {
            System.out.println("... Y ademas Triangulo RECTANGULO");
        }
    }
}
