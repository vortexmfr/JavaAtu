package ListasyColecciones;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ejercicio5Collections {

    /*
        Genera una lista de numeros aleatorios (200 iteraciones)
        Guarda de forma ordenada los numeros en una coleccion,
        y los numeros que salgan repetidos guardalos en una segunda coleccion e indica cuantas veces se han repetido.
        Muestra la lista final de los numeros ordenados y el numero de veces que se ha repetido cada uno.
    */


    public static void main (String[] args) throws IOException {

        List<Integer> lista200 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        Random random = new Random();
        for(int i=0;i<100;i++){
            lista200.add(random.nextInt(100));
        }

        //ordeno la lista principal aunque no hace falta
        lista200 = lista200.stream().sorted().collect(Collectors.toList());

        for(int s : lista200) {
            //Verifico que hay mas de una repeticion y lo añado a la tabla 2
            if (Collections.frequency(lista200, s) > 1) {
                lista2.add(s);
            }
        }
        //          |Selecciono los datos unicos de las lista2
        for(int s : lista2.stream().distinct().collect(Collectors.toList())) {
            System.out.println(s + " -> " + Collections.frequency(lista2, s));
        }
    }

}
