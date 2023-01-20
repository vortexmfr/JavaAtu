package Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Ejercicio3Map {
    /*
        Genera 1000 números aleatorios y guardalos en una estructura de datos,
        muestra cada número en orden de menor a mayor y el número de veces que se ha repetido.
     */


    public static void main (String[] args) throws IOException {

        //Uso TreeMap por que ordena de menor a mayor los elementos insertados.
        TreeMap< Integer, Integer> treemapa = new TreeMap<Integer, Integer>();

        Random random = new Random();

        //Rellenamos el TreeMap
        for (int n = 0; n < 1000; n ++) {
            int key = random.nextInt(500);
            int valor = 1;
            if (treemapa.containsKey(key)) {
                valor = treemapa.get(key) + 1;
            }
            treemapa.put( key, valor);
        }

        for(Map.Entry<Integer,Integer>  m : treemapa.entrySet()) {
            System.out.println(m.getKey() + "  " +m.getValue());
        }

    }

}
