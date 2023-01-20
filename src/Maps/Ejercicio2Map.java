package Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio2Map {
    /*
    Ingrese cualquier cadena de caracteres, como aaabbbccsghedkok,
    para contar el número de ocurrencias de cada carácter en la cadena. La salida tiene la forma de a (1) b (2)…
     */

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static void main (String[] args) throws IOException {

        LinkedHashMap< Character, Integer> lista = new LinkedHashMap<Character, Integer>();

        System.out.println("Introduce la cadena:");
        String cadena = buffer.readLine();

        //recorremos la cadena
        for (int n = 0; n < cadena.length(); n ++) {
            int valor = 1;
            char c = cadena.charAt (n);
            if(lista.containsKey(c)) {
                valor = lista.get(c) + 1;
            }
            lista.put(Character.valueOf(c), valor);
        }

        for(Map.Entry m : lista.entrySet()) {
            System.out.println(m.getKey() + "  (" +m.getValue() + ")");
        }

    }

}
