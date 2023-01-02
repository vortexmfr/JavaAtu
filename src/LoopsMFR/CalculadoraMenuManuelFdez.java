package LoopsMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CalculadoraMenuManuelFdez {

    // Declaracion de Variables
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static int valor1;
    static int valor2;

    //Declaracion de Funciones
    private static void solicitarNumero() throws IOException {
        System.out.println("Introduce Valor1:");
        valor1 = Integer.parseInt(buffer.readLine());
        System.out.println("Intorduce valor2:");
        valor2 = Integer.parseInt(buffer.readLine());
    }

    public static void suma(int val1, int val2) {
        System.out.println("La suma es: " + (val1 + val2));
    }

    private static void resta(int val1, int val2) {
        System.out.println("La resta es: " + (val1 - val2));
    }

    private static void division(int val1, int val2) {
        System.out.println("La division es: " + (val1 / val2));
    }

    private static void multiplicacion(int val1, int val2) {
        System.out.println("La multiplicacion es: " + (val1 * val2));
    }

    private static void potencia (int val1, int val2) {
        int pot=1;

        if (val2 >= 0) {
            //Exponiente positivo y cero
            while (val2 >0) {
                pot = pot * val1;
                val2 --;
            }
            System.out.println("La Potencia es: " + pot);
        } else {
            //Exponente negativo es 1/exponente positivo
            while (val2 < 0) {
                pot = pot * (val1*-1);
                val2 ++;
            }
            System.out.println("La Potencia es: " + (1.0 / (pot * -1)));
        }
    }

    public static void main(String[] args) throws IOException {

        int option = 0;

        do {
            System.out.println("0 -Saliendo del programa...");
            System.out.println("1 -Sumar");
            System.out.println("2 -Restar");
            System.out.println("3 -Multiplicar");
            System.out.println("4 -Dividir");
            System.out.println("5 -Potencia");
            System.out.println("6 -Salir");

            option = Integer.parseInt(buffer.readLine());

            if (option > 0 && option < 6) {
                solicitarNumero();
            }

            switch (option) {
                case 0:
                    System.out.println("Saliendo del programa....");
                    break;
                case 1:
                    suma(valor1, valor2);
                    break;
                case 2:
                    resta(valor1, valor2);
                    break;
                case 3:
                    multiplicacion(valor1, valor2);
                    break;
                case 4:
                    division(valor1, valor2);
                    break;
                case 5: potencia(valor1,valor2);
                        break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (option != 0);

    }
}