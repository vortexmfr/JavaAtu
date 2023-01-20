package ClasesManuelFernandez;

public class Materia {
    private String nombre;
    private Alumno[] alumnos;
    private Profesor profesor;

    public Materia(String nombre, Alumno[] alumnos, Profesor profesor) {
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int i, Alumno alumnos) {
        this.alumnos[i] = alumnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

}
