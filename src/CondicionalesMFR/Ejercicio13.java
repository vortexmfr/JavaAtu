package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Ejercicio13 {
    /*
    Ejercicio 13: La política de cobro de una compañía telefónica es:
    Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, de tal forma que
    los primeros cinco minutos cuestan 1 euro,
    los siguientes tres, 80 céntimos,
    los siguientes dos minutos a 70 céntimos
    y a partir del décimo minuto, 50 céntimos.
    Además, se carga un impuesto de 3% cuando es domingo, y si es otro día, en turno de mañana 15% y en turno de tarde 10%.
    Realiza un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
    */

    public static void main(String[] args) throws IOException {
        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce numero de minutos de la llamada: ");
        String lectura = buffer.readLine();
        int minutos = Integer.parseInt(lectura);
        float costeLlamada = 0;

        System.out.println("Es Domingo?  [S/N]");
        String domingo = buffer.readLine();
        domingo = domingo.toUpperCase(Locale.ROOT);

        System.out.println("Es Mañana o Tarde? [M/T] ");
        String franja = buffer.readLine();
        franja = franja.toUpperCase(Locale.ROOT);

        // Primeros 5 minutos
        if (minutos-5 > 0) {
            costeLlamada = costeLlamada + (5 * 1);
            minutos = minutos - 5;
        } else {
            costeLlamada = costeLlamada + (minutos * 1);
            minutos = 0;
        }

        //Primeros 8 minutos
        if (minutos-3 > 0){
            costeLlamada = (float) (costeLlamada + (3.0 * 0.80));
            minutos = minutos - 3;
        } else {
            costeLlamada = (float) (costeLlamada + (minutos * 0.80));
            minutos = 0;
        }

        //Primeros 10 minutos
        if (minutos-2 > 0){
            costeLlamada = (float) (costeLlamada + (2.0 * 0.70));
            minutos = minutos - 2;
        }  else {
            costeLlamada = (float) (costeLlamada + (minutos * 0.70));
            minutos = 0;
        }

        // Resto de minutos
        if (minutos > 0) {
            costeLlamada = (float) (costeLlamada + (minutos * 0.50));
        }

        System.out.println("Precio LLamada sin suplementos:  "+ costeLlamada);

        //Verificamos si es Domingo - Mañana o Tarde
        if(domingo.contains("S")) {
            costeLlamada = (float) (costeLlamada*1.03);
            System.out.println("Precio LLamada Suplemento Domingo: "+ costeLlamada);
        } else if(franja.contains("M")) {
            costeLlamada = (float) (costeLlamada*1.15);
            System.out.println("Precio LLamada Suplemento Mañana: "+ costeLlamada);
        } else if (franja.contains("T")) {
            costeLlamada = (float) (costeLlamada*1.10);
            System.out.println("Precio LLamada Suplemento Tarde: "+ costeLlamada);
        } else {
            System.out.println("Error");
        }

    }

}
