package Empresa.Entidades;

public class Cliente {

    private String nombre;
    private String DNI;
    private int saldo;
    private int compras;

    public Cliente(String nombre, String DNI, int saldo, int compras) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.saldo = saldo;
        this.compras = compras;
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }
}
