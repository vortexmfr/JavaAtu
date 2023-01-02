package EjerciciosArraysManuelFernandez;

/*
4 .-
Crea dos arrays de números con una posición pasado por teclado.

Uno de ellos estará rellenado con números aleatorios,
después crea un nuevo array como el primer array (usa de nuevo new con el primer array)
con el mismo tamaño que se ha pasado por teclado, rellenalo de nuevo con números aleatorios.

Después, crea un método que tenga como parámetros,
los dos arrays y devuelva uno nuevo con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente.
Por último, muestra el contenido de cada array.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {

    //Declaracion del metodo
    public static void multiplica_array( int[] arr1, int[] arr2) {
        int[] arreglo3 = new int[arr1.length];

        for ( int i= 0; i < arr1.length ; i++) {
                System.out.println(" Valor Posicion Array1["+i+"]= "+ arr1[i] + "  " +  "Y Array2["+i+"] " +arr2[i]);
                arreglo3[i] = arr1[i] * arr2[i];
        }

        for (int valor : arreglo3) {
            System.out.println(" La multiplicacion de los Arrays es: "+ valor);
        }
    }
    public static void main (String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la longitud del array: ");
        String entrada = buffer.readLine();
        int tamanno = Integer.parseInt(entrada);
        int contador = 0;

        //Declaro los Arrays
        int[] arreglo1 = new int[tamanno];
        int[] arreglo2 = new int[tamanno];

        //Inicialzo array con valores random
        while (contador < arreglo1.length) {
            arreglo1[contador] = (int) (Math.random() * 100);
            arreglo2[contador] = (int) (Math.random() * 100);
            contador++;
        }

        //Llamada al metodo
        multiplica_array(arreglo1,arreglo2);

    }
}
