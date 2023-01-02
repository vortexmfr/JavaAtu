package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*


    Ejercicio 12: El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno
    y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
    * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
    * De 50 a 99 alumnos, el costo es de 70 euros.
    * De 30 a 49 alumnos, el costo es de 95 euros.
    * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
    Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

 */

public class Ejercicio12 {

    public static void main(String[] args) throws IOException {
        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el Numero de Alumnos: ");
        String lectura = buffer.readLine();

        //Convertir String a Integer
        int alumnos = Integer.parseInt(lectura);

        if (alumnos >= 100) {
            System.out.println(" El precio por alumno: 65 Euros");
        } else if (alumnos >= 50 && alumnos < 100) {
            System.out.println(" El precio por alumno: 70 Euros");
        } else if (alumnos >= 30 && alumnos < 50) {
            System.out.println(" El precio por alumno: 95 Euros");
        } else if (alumnos < 30) {
            System.out.println(" El precio por alumno: " + (4000 / alumnos) + " Euros");
        } else {
            System.out.println("Error");
        }
        // El precio a pagar a la compañia de Autobuses se determina,
        // por el redondeo al alza del numero de alumnos por 30 plazas por autobus
        System.out.println(" Pago empresa de autobuses: "+ (Math.ceil(alumnos/30.0)*4000) + "Euros");

    }
}