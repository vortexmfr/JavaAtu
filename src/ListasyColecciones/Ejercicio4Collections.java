package ListasyColecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ejercicio4Collections {

    /*
       Genera una lista que vaya del 0 al 100, utilizando numeros aleatorios para rellenarla.
       Una vez la lista este completa esta se mostrara por terminal y el programa terminara.
       Intenta hacer estas operaciones en una sola linea, es decir, encadenando metodos de collection
    */


    public static void main (String[] args) throws IOException {

        List<String> lista100 = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<100;i++){
            lista100.add(String.valueOf(random.nextInt(100)));
        }

        System.out.println("No ordenados");
        lista100.forEach(System.out::println);

        System.out.println("Ordenados");
        lista100 = lista100.stream().sorted().collect(Collectors.toList());
        System.out.println(lista100);

    }

}
