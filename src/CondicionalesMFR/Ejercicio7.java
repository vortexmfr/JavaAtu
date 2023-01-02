package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
/*


    Ejercicio 7: Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
    * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
    * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
    * Otros casos -> NO ACEPTADA

 */
public class Ejercicio7<edad> {

    public static void main(String[] args) throws IOException {
        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la edad: ");
        String lectura = buffer.readLine();

        //Convertir String a Integer
        int edad = Integer.parseInt(lectura);

        //Lectura del segundo valor
        System.out.println("Introduce la nota: ");
        lectura = buffer.readLine();
        int nota = Integer.parseInt(lectura);

        //Lectura del tercer valor
        System.out.println("Introduce el Sexo [M], [F]: ");
        String sexo = buffer.readLine();
        sexo = sexo.toUpperCase(Locale.ROOT);

        if (nota >= 5 && edad >= 18) {
            if (sexo.equals("M"))
                System.out.println(" La solicitud POSIBLEMENTE aceptada");
            else if (sexo.equals("F"))
                System.out.println(" La solicitud ACEPTADA");
            else
                System.out.println(" La solicitud NO aceptada");
        } else {
            System.out.println(" La solicitud NO aceptada");
        }
    }
}
