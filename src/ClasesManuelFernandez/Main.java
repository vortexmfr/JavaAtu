package ClasesManuelFernandez;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
public class Main {

    private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    private static Profesor[] profesores = new Profesor[10];
    private static Alumno[] alumnos = new Alumno[100];

    public static void main(String[] args) throws IOException {

        Profesor profesor = new Profesor("Jose", "Dalia",56, new Date(), "Programacion", new Materia[5]);
        profesores[0] = profesor;
        profesores[1] = new Profesor("Luis", "C/ Pez", 45, new Date(), "Redes", new Materia[5]);

        //Alumnos
        Alumno alumno = new Alumno( "Javier", 45);
        Alumno alumno2 = new Alumno("Miguel Angel", 34);

        //                                                      |-> Como es de un array defino el tamaño del array en el constructor.
        Materia materia = new Materia("Java", new Alumno[2], profesor);
        materia.setAlumnos(0, alumno);
        materia.setAlumnos(1, alumno2);
        profesor.getMaterias()[0] = materia;

        for (int i = 0; i < profesor.getMaterias(0).getAlumnos().length; i++) {
            System.out.println(profesor.getMaterias(0).getAlumnos()[i].getNombre());
            System.out.println(profesor.getNombre());
            System.out.println(materia.getNombre());
        }

        System.out.println(profesor.getMaterias(0).getNombre());
    }


    public static void ejemploInstanciar() throws IOException {
        //vamos a visualizar los profesores
        Profesor profe_mates = new Profesor("Manuel", "Dalia 42", 26, new Date(), "Programacion Java");
        Profesor profe_html = new Profesor("Yuyu", "Dalia 36", 42, new Date(), "Programacion HTML");

        // Creo un nuevo alumno
        Alumno alumno1 = new Alumno("Miriam", 21, new Date(), "ASIR", "ASIR_1", "Calle del Pez", new Materia[10]);
        System.out.println(alumno1.getNombre() + "  " + alumno1.getDireccion());

        //Visualizo nombre del profesor
        System.out.println(profe_mates.getNombre());
        //Actualizo el nombre del profe
        profe_mates.setNombre("Miguel");
        System.out.println(profe_mates.getNombre());

        //Solicito nombre del profesor
        System.out.println("Introduce nommbre del profesor:");
        String nombre = buffer.readLine();
        profe_mates.setNombre(nombre);

        //solicito edad del profesor
        System.out.println("Introduce la edad del profesor:");
        int edad = Integer.parseInt(buffer.readLine());
        profe_mates.setEdad(edad);
        System.out.println(profe_mates.getNombre() + "  " + profe_mates.getEdad());


    }
}
