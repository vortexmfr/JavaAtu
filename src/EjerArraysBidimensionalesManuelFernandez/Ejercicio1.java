package EjerArraysBidimensionalesManuelFernandez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
/*
    Crea un programa que pida por pantalla cuatro países y a continuación tres ciudades de cada uno de estos países.
    Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea el número asignado a cada país
     y el segundo índice el número asignado a cada ciudad.
*/

public static void main (String[] args) throws IOException {

    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    //Declaro el array multidemensional
    String[][] paisCiudad = new String[4][3];
    int j = 0;

    //Recorro y cargo el array con lso datos introducidos por usuario
    for (int i = 0 ; i < paisCiudad.length ; i++ ) {  // con array.length veo primera dimension
        j = 0;
        System.out.print("Introduce Un Pais: ");
        paisCiudad[i][j] = buffer.readLine();

        for (j = 0; j < paisCiudad[0].length ; j++)  {// Con array[0].length veo 2ª dimension con array[0][0].length 3ª
            System.out.print("Introduce Una Ciudad: ");
            paisCiudad[i][j] = buffer.readLine();
        }
    }

    //Muestro el array
    for (int i = 0 ; i < 4 ; i++ ) {
        j=0;
        System.out.println(" Pais: "+ paisCiudad[i][j]);
        for (j = 0; j < 3; j++) {
            System.out.println(" \t Ciudades : "+ paisCiudad[i][j]);
        }
    }
    }

}
