package Empresa.Entidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pprincipal {

    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    // Estructuras de datos para almacenar la información
    public static Trabajador[] trabajadores = new Trabajador[10];
    public static Producto[] productos = new Producto[100];
    public static Cliente[] clientes = new Cliente[100];


    public static void main(String[] args) throws IOException {

        trabajadores[0] = new  Trabajador(100, "Manuel", "28934567", 23000, Cargos.TRABAJADOR, "ABC123", 12356, new Cliente[5]);
        trabajadores[1] = new  Trabajador(200, "Luis", "3456789", 45000, Cargos.GERENTE, "ABC123", 12356, new Cliente[5]);
        trabajadores[2] = new  Trabajador(300, "Maria", "86345687", 67000, Cargos.JEFE, "ABC123", 12356, new Cliente[5]);
        trabajadores[3] = new  Trabajador(301, "Pepi", "687", 67000, Cargos.TRABAJADOR, "ABC123", 12356, new Cliente[5]);
        acceso();

        // muestra los trabajadores
        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null) {
                System.out.println(trabajadores[i].getNumeroEmpleado()+ " " + trabajadores[i].getNombre() + " " +trabajadores[i].getDNI());
            }
        }

        // Muestra los productos
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                System.out.println(productos[i].getNombreProducto()+ " " + productos[i].getProductId() + " " +productos[i].getNumeroExistencias());
            }
        }
    }

    static void acceso() throws IOException {
        boolean existe = false;
        int i = 0;

        System.out.println("********************************");
        System.out.println("*    PROGRAMA EMPRESA  2.0     *");
        System.out.println("********************************");
        System.out.println();
        System.out.println("Introduce tu Usuario (DNI):");
        String user = buffer.readLine();
        do {
            if (trabajadores[i].getDNI().equals(user)) {
                existe = true;
                System.out.println("Introduce tu contraseña:");
                String login = buffer.readLine();
                if (trabajadores[i].getContrasena().equals(login)) {
                    System.out.println("Contraseña y Login OK");
                    System.out.println(trabajadores[i].getCargo());
                    menu(trabajadores[i].getCargo());
                    break;
                } else {
                    System.out.println("Contraseña no coincidente");
                    System.out.println("Por razones de seguridad procedemos a desconectarle...");
                    break;
                }
            } else {
                existe = false;
            }
          i++;
        } while ( trabajadores[i] != null);
        if (!existe)  System.out.println("El Usuario no existe");
    }

    static void menu(Cargos c) throws IOException {
        switch (c) {
            case JEFE: Menus.menuJefe();
                       System.out.println("El cargo es: "+ c);
                       break;
            case GERENTE: Menus.menuGerente();
                          System.out.println("El cargo es: "+ c);
                          break;
            case TRABAJADOR: Menus.menuTrabajador();
                             System.out.println("El cargo es: "+ c);
                             break;
        }
    }
}
