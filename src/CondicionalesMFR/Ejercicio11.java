package CondicionalesMFR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/*
    Ejercicio 11: La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B),
    y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño,
    se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
    * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
    * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.

 */

public class Ejercicio11 {

    public static void main(String[] args) throws IOException {
        //Lectura del primer valor
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el Precio Inicial del kilo de Uva (Euros): ");
        String lectura = buffer.readLine();
        //Convertir String a Integer
        float precio = Float.parseFloat(lectura);

        System.out.println("Introduce el Tipo de Uva  [A] o [B]");
        //lectura = buffer.readLine();
        String tipo = buffer.readLine();
        tipo = tipo.toUpperCase(Locale.ROOT);

        System.out.println("Introduce el Tamaño de Uva  [1] o [2]");
        lectura = buffer.readLine();
        float tamanno = Float.parseFloat(lectura);

        if (tipo.equals("A")) {
            if (tamanno == 1) {
                System.out.println(" El Precio recibido  Tipo A es: " + (precio + 0.20));
            } else if (tamanno == 2) {
                System.out.println(" El Precio recibido Tipo A es: " + (precio + 0.30));
            } else {
                    System.out.println(" Error Tamaño introducido");
            }
        } else if (tipo.equals("B")) {
            if (tamanno == 1) {
                System.out.println(" El Precio recibido Tipo B es: " + (precio - 0.30));
            } else if (tamanno == 2) {
                System.out.println(" El Precio recibido Tipo B es: " + (precio - 0.50));
            } else {
                    System.out.println(" Error Tamaño introducido");
            }
        }
    }
}
