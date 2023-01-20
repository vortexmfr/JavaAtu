package Empresa.Entidades;

public class Producto {

    private String productId;  // Assignarle la posición del array
    private String nombreProducto;
    private float precioUnidad;
    private int numeroExistencias;

    public Producto(String productId, String nombreProducto, float precioUnidad, int numeroExistencias) {
        this.productId = productId;
        this.nombreProducto = nombreProducto;
        this.precioUnidad = precioUnidad;
        this.numeroExistencias = numeroExistencias;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getNumeroExistencias() {
        return numeroExistencias;
    }

    public void setNumeroExistencias(int numeroExistencias) {
        this.numeroExistencias = numeroExistencias;
    }
}
