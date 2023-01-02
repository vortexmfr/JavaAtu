package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 16:

Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur,
Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida.
Lo anterior se muestra en la siguiente tabla:

ZONA UBICACIÓN          COSTO/KILOGRAMO
1 América del Norte       24,00 euros
2 América Central         20, 00 euros
3 América del Sur         21,00 euros
4 Europa                  10,00 euros
5 Asia                    18,00 euros
Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por cuestiones de logística y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
 */


public class Ejercicio16 {
    public static void main(String[] args) throws IOException {
        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ZONA UBICACIÓN\n" +
                "1 América del Norte\n" +
                "2 América Central\n" +
                "3 América del Sur\n" +
                "4 Europa\n" +
                "5 Asia");
        System.out.println("Introduce la zona de destino [1-5]: ");
        String lectura = buffer.readLine();
        int zona = Integer.parseInt(lectura);

        System.out.println("Introduce el Peso de la carga (Kgr.): ");
        lectura = buffer.readLine();
        float kilos = Float.parseFloat(lectura);

        if (kilos > 5) {
            System.out.println("El peso de su envio " + kilos + " Excede de los 5 Kg. maximos autorizados");
            System.out.println("Su envio no puede ser enviado");
        } else {

            switch (zona) {
                case 1:
                    System.out.println("El coste del envio es: " + (24.0 * kilos));
                    break;
                case 2:
                    System.out.println("El coste del envio es: " + (20.0 * kilos));
                    break;
                case 3:
                    System.out.println("El coste del envio es: " + (21.0 * kilos));
                    break;
                case 4:
                    System.out.println("El coste del envio es: " + (10.0 * kilos));
                    break;
                case 5:
                    System.out.println("El coste del envio es: " + (18.0 * kilos));
                    break;
                default:
                    System.out.println("ERROR: Zona no especificada correctamente");
                    break;
            }
        }
    }
}
