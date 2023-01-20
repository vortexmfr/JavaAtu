package ClasesManuelFernandez;

import java.util.Date;

public class Alumno {

    private String nombre;
    private int edad;
    private Date nacimiento;
    private String rama;
    private String clase;
    private String direccion;
    private Materia[] materias;


    public Alumno() {
    }
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }
    public Alumno(String nombre, int edad, Date nacimiento, String rama, String clase, String direccion, Materia[] materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.rama = rama;
        this.clase = clase;
        this.direccion = direccion;
        this.materias = materias;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public Materia getMateria(int i) {
        return materias[i];
    }

    public void setMateria(int i, Materia materia) {
        materias[i] = materia;
    }
}

