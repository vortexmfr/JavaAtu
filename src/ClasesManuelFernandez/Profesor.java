package ClasesManuelFernandez;

import java.util.Date;

public class Profesor {

    private String nombre;
    private String direccion;
    private int edad;
    private Date nacimiento;
    private String rama;
    private Materia[] materias;

    //Creamos el constructor
    public Profesor(String nombre, String direccion, int edad, Date nacimiento, String rama) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.rama = rama;
    }

    public Profesor(String nombre, String direccion, int edad, Date nacimiento, String rama, Materia[] materias) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.rama = rama;
        this.materias = materias;
    }

    //Puede haber mas de un constructor en este caso solo se podra actualizar nombre y edad
    public Profesor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Setters and Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 15)
            System.out.println("Tu nombre es muy largo..");
        else
            this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Materia[] getMaterias() {
        return materias;
    }
    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }
    public Materia getMaterias(int i) {
        return materias[i];
    }

}
