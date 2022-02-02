package clases;

public class Fruteria extends Productos {

    public Fruteria(String nombre, String unidadVenta, double capacidad, int precio) {
        super(nombre, unidadVenta, capacidad, precio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre);
        sb.append(" /// ");
        sb.append("Precio: $").append(precio);
        sb.append(" /// ");
        sb.append("Unidad de venta: ").append(unidadVenta);

        return sb.toString();
    }

}
