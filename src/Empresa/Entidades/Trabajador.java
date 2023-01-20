package Empresa.Entidades;

public class Trabajador {
    private int numeroEmpleado;
    private String nombre;
    private String DNI;
    private int salario;
    private Cargos cargo;
    private String contrasena;
    private long ventas;
    private Cliente[] clientes;
    private Producto[] productos;

    public Trabajador(int numeroEmpleado, String nombre, String DNI, int salario, Cargos cargo, String contrasena, long ventas, Cliente[] clientes) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.DNI = DNI;
        this.salario = salario;
        this.cargo = cargo;
        this.contrasena = contrasena;
        this.ventas = ventas;
        this.clientes = clientes;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public long getVentas() {
        return ventas;
    }

    public void setVentas(long ventas) {
        this.ventas = ventas;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
}