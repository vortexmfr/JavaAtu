package ListasyColecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ejercicio2Collections {

    /*
    2: Un supermercado nos pide que hagamos una pequeña aplicación que almacene los productos pasados por el escaner.
    La aplicación debe almacenar Productos (clase), cada producto al crearse contiene una cantidad y un precio (estos dos generados aleatoriamente).
    Calcular el precio total de una lista de entre 1 y 8 productos (aleatorio). Mostrar un ticket con
    todo lo vendido y el precio final como se hacen en los supermercados.
    */

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static void main (String[] args) throws IOException {

        List<Producto> listaProductos = new ArrayList<>();


        String producto = "H";

        while (!producto.equals("S")) {
            System.out.println("Introduce Nombre del producto (teclear S para finalizar):");
            producto = buffer.readLine().toUpperCase();
            listaProductos.add( new ListasyColecciones.Producto(  producto, (float) Math.random()*10,  (int) (Math.random()*30)));
        };
        //Elimino la S de la opción de salir.
        listaProductos.remove(listaProductos.size()-1);

        // Accedo por posición a la lista
        float totalAcumulado =0;
        float totalProductos = 0;

        System.out.println("=======================================================");
        System.out.println("=====  SUPERMERCADO:   EL QUE MAS MOLA DEL BARRIO  =====");
        System.out.println("=======================================================");
        System.out.println(" Fecha: " + new Date());
        System.out.println(" Producto     Unidades       Precio       total");
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.print(" "+ listaProductos.get(i).getNombreProducto() + "\t");
            System.out.print("\t\t" +listaProductos.get(i).getNumeroExistencias() + "\t ");
            System.out.print("\t\t" +listaProductos.get(i).getPrecioUnidad()+ "\t");
            System.out.println(listaProductos.get(i).getNumeroExistencias()*listaProductos.get(i).getPrecioUnidad());
            totalAcumulado = totalAcumulado + (listaProductos.get(i).getNumeroExistencias()*listaProductos.get(i).getPrecioUnidad());
            totalProductos = totalProductos + listaProductos.get(i).getNumeroExistencias();
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("           TOTAL:                 "+ totalAcumulado );
        System.out.println("************   Gracias por su visita ******************");


        /*

        //ACCEDO AL ELEMENTO (NO HACE FALTA CONTADOR)
        for(Producto p : listaProductos) {
            System.out.println(p.getNombreProducto());
        }

        //USO el generador (en la clase toString) para mostrar el objeto.
        listaProductos.forEach(System.out::println);


        //USO el generador (en la clase toString) para mostrar el objeto.
        System.out.println(listaProductos);
        */
    }

}
