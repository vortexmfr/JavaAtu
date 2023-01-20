package ListasyColecciones;

public class Producto {

    private String nombreProducto;
    private float precioUnidad;
    private int numeroExistencias;

    public Producto(String nombreProducto, float precioUnidad, int numeroExistencias) {
        this.nombreProducto = nombreProducto;
        this.precioUnidad = precioUnidad;
        this.numeroExistencias = numeroExistencias;
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

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precioUnidad=" + precioUnidad +
                ", numeroExistencias=" + numeroExistencias +
                '}';
    }
}
