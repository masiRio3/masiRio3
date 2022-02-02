package clases;

public abstract class Productos implements Comparable<Productos> {

    String nombre;
    String unidadVenta;
    double capacidad;
    int precio;

    public Productos(String nombre, String unidadVenta, double capacidad, int precio) {
        this.nombre = nombre;
        this.unidadVenta = unidadVenta;
        this.capacidad = capacidad;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoUnidad() {
        return unidadVenta;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Productos p) {
        return this.getPrecio() > p.getPrecio() ? 1 : this.getPrecio() < p.getPrecio() ? -1 : 0;
    }

}
