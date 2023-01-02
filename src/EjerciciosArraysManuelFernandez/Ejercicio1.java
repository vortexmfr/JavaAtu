package EjerciciosArraysManuelFernandez;

/*
1 -Crea un array de números donde le indicamos por teclado el tamaño del array,
rellenaremos el array con números aleatorios entre 0 y 9,
al final muestra por pantalla el valor de cada posición y la suma de todos los valores.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {

        //Lectura por teclado
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la longitud del array: ");
        String lectura = buffer.readLine();
        int longitud = Integer.parseInt(lectura);

        int array[] = new int[longitud];
        int contador = 0;
        int suma = 0;

        while (contador < array.length) {
            array[contador] = (int) (Math.random()*10);
            System.out.println(" La posicion ["+contador+"] contiene el valor: "+ array[contador]);
            suma = suma + array[contador];
            contador++;
        }
        System.out.println(" La suma de los valores de Array es: "+ suma);

    }
}
