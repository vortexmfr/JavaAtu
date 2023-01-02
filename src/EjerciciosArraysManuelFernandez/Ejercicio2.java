package EjerciciosArraysManuelFernandez;
/*
2 -Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
   Obtén la suma de todos ellos y la media.

 */
public class Ejercicio2 {

    public static void main (String[] args) {


        int array[] = new int[100];
        int contador = 0;
        int suma = 0;
        float media = 0;

        while (contador < array.length) {
            array[contador] = contador + 1;
            suma = suma + array[contador];
            contador ++;
        }
        System.out.println(" La suma del array es: "+ suma +" Y la media = "+ suma/contador);
    }


}
