package Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class Ejercicio4Map {
    /*
        Implementa un HashMap que introduzca 1000 valores aleatorios (En la key y en el value):
        Elimina del mapa todos las que sean menores de 100 y guardalas en una lista y muestra ambas colecciones.
        Del mapa inicial, elimina todos los valores en los que la key y el value tengan un valor distinto entre sí, a continuación, imprime el mapa.

     */

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static void main (String[] args) throws IOException {

        LinkedHashMap< Integer, Integer> hashlista = new LinkedHashMap<Integer, Integer>();
        LinkedHashMap< Integer, Integer> hashlista2 = new LinkedHashMap<Integer, Integer>();
        LinkedHashMap< Integer, Integer> hashlistaDuplicados = new LinkedHashMap<Integer, Integer>();

        Random random = new Random();

        //Creamos el hashMap
        for (int n = 0; n < 1000; n ++) {
            hashlista.put( random.nextInt(500), random.nextInt(500));
        }

        for(Map.Entry<Integer,Integer>  m : hashlista.entrySet()) {
            //System.out.println(m.getKey() + "  " +m.getValue());
            if ((int) m.getKey() <= 100) {
                hashlista2.put(m.getKey(), m.getValue());
            }
        }

        for(Map.Entry<Integer,Integer> m : hashlista.entrySet()) {
            System.out.println(" Lista Original-> "+ m.getKey() + "  " +m.getValue());
        }

        for(Map.Entry<Integer,Integer> m : hashlista2.entrySet()) {
            System.out.println(" L2 menor de 100 -> " + m.getKey() + "  " +m.getValue());
        }


        for(Map.Entry<Integer,Integer> m : hashlista.entrySet()) {
            if (!Objects.equals(m.getValue(), m.getKey())) {
                //Almaceno los objetos duplicados
                hashlistaDuplicados.put(m.getKey(), m.getValue());
            }
        }

        for(Map.Entry<Integer,Integer> m : hashlistaDuplicados.entrySet()) {
            hashlista.remove(m.getKey());
        }

        if (hashlista.isEmpty()) {
            System.out.println("No hay pares Key->Value duplicados");
        } else {
            for(Map.Entry<Integer,Integer> m : hashlista.entrySet()) {
                System.out.println(" Lista Original Iguales-> "+ m.getKey() + "  " +m.getValue());
            }
        }


    }

}
