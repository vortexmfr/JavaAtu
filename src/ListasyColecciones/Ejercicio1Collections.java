package ListasyColecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

public class Ejercicio1Collections {
    /*
    1: Programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de tipo Integer.
       La lectura de números enteros termina cuando se introduzca el valor -99. Este valor no se guarda en el ArrayList.
       continuación el programa mostrará por pantalla el número de valores que se han leído, su suma y su media.
       Por último se mostrarán todos los valores leídos, indicando cuántos de ellos son mayores que la media.


     */

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static void main (String[] args) throws IOException {
       int valor=0;
       int suma=0;
       int media=0;
       Collection<Integer> lista = new ArrayList<>();

       while (valor != -99) {
           System.out.println("Introduce Valor (teclear -99 para salir):");
           valor = Integer.parseInt(buffer.readLine());
           lista.add(valor);
       };
       lista.remove(-99);

        System.out.println("los elementos introducidos son: " + lista.size());
        /*For tradicional*/
        for (Integer integer : lista) {
            suma = suma + integer;
        }
        System.out.println("La suma es: "+ suma +" El promedio: "+ suma/ lista.size());


        /*Usando lamdas*/
        suma = 0;
        lista.forEach(integer -> {
            System.out.println(integer);;
        });
        //Lamda tope de gama
        lista.forEach(System.out::println);

    }

}
