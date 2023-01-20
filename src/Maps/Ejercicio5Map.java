package Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ejercicio5Map {
    /*
        5.-Dado un String con una frase, guarda cada carácter de forma individual e indica en qué posiciones del String aparece
        PE:  java Concordance Hello World
            {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}

     */
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static void main (String[] args) throws IOException {

        LinkedHashMap< Character, List<Integer>> mapa = new LinkedHashMap<>();
        System.out.println("Introduce la cadena:");
        String cadena = buffer.readLine();

        //recorremos la cadena
        for (int n = 0; n < cadena.length(); n ++) {
            char c = cadena.charAt (n);
            if(mapa.containsKey(c)) {
                //Obtengo la referencia del value con mapa.get(c) que es el key y le añado add(n) un elemento.
                mapa.get(c).add(n);
            } else {
                mapa.put(c, new ArrayList<>()); //Creo la lista
                mapa.get(c).add(n); // Añado el elemento a la lista
            }
        }

        for(Map.Entry<Character, List<Integer>> m : mapa.entrySet()) {
            System.out.println(" Valor-> "+ m.getKey() + "  " +m.getValue());
        }

    }

}
