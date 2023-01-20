package ListasyColecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ejercicio3Collections {

    /*
        Crea un conjunto al que se le va a llamar jugadores. Inserta en el conjunto los jugadores del FC Barcelona.
        realiza un bucle sobre los jugadores del conjunto y muestra sus nombres.
        Consulta si en el conjunto existe el jugador «Neymar JR». Avisa si existe o no.
        Crea un segundo conjunto jugadores2 con los jugadores «Piqué» y «Busquets».
        Consulta si todos los elementos de jugadores2 existen en jugadores.
        Realiza una unión de los conjuntos jugadores y jugadores2.
        Elimina todos los jugadores del conjunto jugadores2 y muestra el número de jugadores que tiene el conjunto jugadores2 (debería ahora ser cero).
    */

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static void main (String[] args) throws IOException {

        List<String> conjuntoJugadores = new ArrayList<>();
        List<String> conjuntoJugadores2 = new ArrayList<>();

        String jugador = " ";

        while (!jugador.equals("S")) {
            System.out.println("Introduce Nombre del Jugador (teclear S para finalizar):");
            jugador = buffer.readLine().toUpperCase();
            conjuntoJugadores.add( jugador);
        };
        //Elimino la S de la opción de salir.
        conjuntoJugadores.remove(conjuntoJugadores.size()-1);


        //Mostrar Jugadores
        System.out.println("Lista de jugadores conjunto 1");
        for(String j : conjuntoJugadores) {
            System.out.println(j);
        }

        //consulta si existe el jugador solicitado
        System.out.println("Introduce Nombre del Jugador a buscar:");
        jugador = buffer.readLine().toUpperCase();

        if (conjuntoJugadores.contains(jugador)) {
            System.out.println("El jugador: " + jugador + " Existe");
        } else {
            System.out.println("El jugador: " + jugador + " No Existe");
        }

        // Añado elementos a a lista2
        conjuntoJugadores2.add("PIQUE");
        conjuntoJugadores2.add("BUSQUETS");

        boolean c = false;
        for (int j = 0; j < conjuntoJugadores2.size()-1 ; j++) {
            if (conjuntoJugadores.contains(conjuntoJugadores2.get(j))) {
                c = true;
            }else {
                c = false;
            }
        }

        if (c) {
            //USO el generador (en la clase toString) para mostrar el objeto.
            System.out.println("los jugador: " + conjuntoJugadores2 + " Existen");
        } else {
            System.out.println("El jugador: " + conjuntoJugadores2 + " No Existe");
        }


        // union de los dos conjuntos
        conjuntoJugadores.addAll(conjuntoJugadores2);
        System.out.println("Union de los dos conjuntos");
        conjuntoJugadores.forEach(System.out::println);

        //Borro el conjunto 2
        conjuntoJugadores2.clear();
        System.out.println("Eliminar los elementos de conjunto 2");
        conjuntoJugadores2.forEach(System.out::println);
    }

}
