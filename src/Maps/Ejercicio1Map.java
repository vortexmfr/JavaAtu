package Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ejercicio1Map {
    /*
    1:Dado un String compuesto por letras minúsculas, encuentra el primer carácter que NO se repite y muestralo por consola,
    si no hay ningun caracter unico, muestra “_”
      "xxzyzx"
      "xxzyzxy"
      "cbaac"
      "abcabc"
      "dssfpp"
      "dssfppdf"
      "hhhtgg"
      "hhhh"
     */


    public static void main (String[] args) throws IOException {

        HashMap< Integer, String>  mapa = new HashMap<Integer, String >();
        HashMap< Character, Integer>  almacenar = new HashMap<Character, Integer>();

        mapa.put(1,"xxzyzx");
        mapa.put(2,"xxzyzxy");
        mapa.put(3,"cbaac");
        mapa.put(4,"abcabc");
        mapa.put(5,"dssfpp");
        mapa.put(6,"dssfppdf");
        mapa.put(7,"hhhtgg");
        mapa.put(8,"hhhh");

        char caracter = 0;
        boolean verificar = false;

        for (int i = 1; i <= mapa.size(); i++) {
            char[] caracteres = mapa.get(i).toCharArray();
            System.out.println(caracteres);

            for (int j = 0; j < caracteres.length; j++) {
                caracter = caracteres[j];
                int valor = 1;
                if (almacenar.containsKey(caracter)) {
                    valor = almacenar.get(caracter) + 1;
                }
                almacenar.put(caracter, valor);
            }
            //System.out.println(almacenar);

            for (HashMap.Entry<Character, Integer> entry : almacenar.entrySet()) {
                if (entry.getValue() == 1) {
                    verificar = true;
                    System.out.println("Caracter no repetido: " + entry.getKey() + " Repeticiones :" + entry.getValue());
                    break;
                }
            }
            if(!verificar) {
                System.out.println("No hay caracter unico");
            }
            verificar = false;
            almacenar.clear();
        }


        /*

        mapa.entrySet().stream().filter()

                .filter(x -> "something".equals(x.getValue())).map(x->x.getValue()).collect(Collectors.joining());

        System.out.println("Iterating Hasmap...");
        for(Map.Entry<Integer,String> m : mapa.entrySet()) {
            System.out.println(m.getKey() + "  " +m.getValue());
        }
    */



    }

}
