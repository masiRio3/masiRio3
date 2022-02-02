package clases;

public class Gaseosa extends Productos {

    public Gaseosa(String nombre, String unidadVenta, double capacidad, int precio) {
        super(nombre, unidadVenta, capacidad, precio);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre);
        sb.append(" /// ");
        sb.append("Litros: ").append(capacidad);
        sb.append(" /// ");
        sb.append("Precio: $").append(precio);
        return sb.toString();
    }

    public int compareTo(Gaseosa o) {
        return this.getPrecio() > o.getPrecio() ? 1 : this.getPrecio() < o.getPrecio() ? -1 : 0;

    }

}
