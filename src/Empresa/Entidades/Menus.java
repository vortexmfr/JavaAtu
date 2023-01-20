package Empresa.Entidades;
import java.io.IOException;
import java.util.Arrays;

import static Empresa.Entidades.Pprincipal.*;

public class Menus {

    static void menuJefe() throws IOException {

        System.out.println("Menu JEFE ");
        int option = 0;
        do {
            System.out.println("0 -Salir del Menu...");
            System.out.println("1 -Crear Trabajador");
            System.out.println("2 -Desvincular Trabajador");
            System.out.println("3 -Cerrar Empresa");

            option = Integer.parseInt(buffer.readLine());

            switch (option) {
                case 0:
                    System.out.println("Saliendo del programa....");
                    break;
                case 1:
                    crearTrabajador("");
                    break;
                case 2:
                    desvincularTrabajador();
                    break;
                case 3:
                    cerrarEmpresa();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 0);
    }

    static void menuGerente() throws IOException {
        System.out.println("Menu GERENTE");
        int option = 0;
        do {
            System.out.println("0 -Saliendo del Menu...");
            System.out.println("1 -Repartir Clientes");
            System.out.println("2 -Crear Trabajador");
            System.out.println("3 -Añadir Inventario");

            option = Integer.parseInt(buffer.readLine());

            switch (option) {
                case 0:
                    System.out.println("Saliendo del programa....");
                    break;
                case 1:
                    repartirClientes();
                    break;
                case 2:
                    crearTrabajador("");
                    break;
                case 3:
                    anadirInventario();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 0);
    }

    static void menuTrabajador() throws IOException {
        System.out.println("Menu TRABAJADOR");
        int option = 0;
        do {
            System.out.println("0 -Saliendo del Menu...");
            System.out.println("1 -Conseguir Cliente");

            option = Integer.parseInt(buffer.readLine());

            switch (option) {
                case 0:
                    System.out.println("Saliendo del programa....");
                    break;
                case 1:
                    conseguirCliente();
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (option != 0);
    }

    static void conseguirCliente() {

        System.out.println("Conseguir Cliente");

    }

    static void repartirClientes() {
        System.out.println("Conseguir Cliente");
    };

    static void crearTrabajador(String car) throws IOException {
        Cargos cargo;

        System.out.println("Crear Trabajador");

        System.out.println("Introduce numero del empleado:");
        int numero = Integer.parseInt(buffer.readLine());
        System.out.println("Introduce nombre del empleado:");
        String name = buffer.readLine();
        System.out.println("Introduce DNI del empleado:");
        String dnis =buffer.readLine();
        System.out.println("Introduce Salario del empleado:");
        int salario = Integer.parseInt(buffer.readLine());

        //Si creo Jefe lo paso por Parametro
        if (car != "") {
            cargo = Cargos.valueOf(car);
        } else {
            System.out.println("Introduce Cargo del empleado:");
            cargo = Cargos.valueOf(buffer.readLine());
        }

        System.out.println("Introduce contraseña del empleado:");
        String login = buffer.readLine();
        System.out.println("Introduce ventas del empleado:");
        int ventas = Integer.parseInt(buffer.readLine());

        int i = 0;
        while (trabajadores[i] !=null) {
            i++;
        }
        Pprincipal.trabajadores[i] = new  Trabajador(numero, name, dnis, salario, cargo, login,ventas, new Cliente[5]);
    };

    static void anadirInventario() throws IOException {

        System.out.println("Añadir Inventario");
        String salir;
        do {
            System.out.println("Introduce Id del Producto:");
            String pId = buffer.readLine();
            System.out.println("Introduce el Nombre del producto:");
            String nompro = buffer.readLine();
            System.out.println("Introduce el Precio por Unidad:");
            float precio = Float.parseFloat(buffer.readLine());
            System.out.println("Introduce el numero de productos:");
            int existencias = Integer.parseInt(buffer.readLine());

            int i = 0;
            while (productos[i] !=null) {
                i++;
            }
            productos[i] = new Producto(pId, nompro, precio, existencias);

            System.out.print("Desea añadir mas productos (s/n) ? ");
            salir =  (buffer.readLine()).toUpperCase();

        } while (salir.equals("S") );

    };

    static void desvincularTrabajador() throws IOException {

        System.out.println("Desvincular trabajador");
        System.out.println("Introduce el numero de empleado:");
        int emp = Integer.parseInt(buffer.readLine());
        int posicion = buscarNumEmpleado(emp);
        if (posicion == 10) {
            System.out.println("Empleado no encontrado");
        } else {
            System.out.println( " Nombre Empleado: " + trabajadores[posicion].getNombre() +
                                " Nombre de los Clientes: " + Arrays.toString(trabajadores[posicion].getClientes()) +
                                " Numero de Clientes: " + trabajadores[posicion].getClientes().length +
                                " Promedio de Ventas: " + trabajadores[posicion].getVentas());
            trabajadores[posicion] = null;
        }
    }

    private static int buscarNumEmpleado(int emp) {
        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null) {
                if (trabajadores[i].getNumeroEmpleado() == emp) {
                    System.out.println(trabajadores[i].getNombre() + "  " + trabajadores[i].getDNI());
                    return i;
                }
            }
        }
        return 10;
    }

    ;
    static void cerrarEmpresa() {
        System.out.println("Cerrar Empresa");
    };
}
