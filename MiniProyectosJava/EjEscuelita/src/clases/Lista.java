package clases;

import java.util.LinkedList;
import java.util.List;

public class Lista {

    private List<Productos> listaDeProductos;

    public Lista() {
        this.listaDeProductos = new LinkedList<>();
    }

    public void agregarProducto(Productos p) {
        this.listaDeProductos.add(p);
    }

    public void cargarListaDeProductos() {
        Gaseosa g1 = new Gaseosa("Coca-Cola Zero", "Litros", 1.5, 20);
        System.out.println(g1.toString());
        this.agregarProducto(g1);

        Gaseosa g2 = new Gaseosa("Coca-Cola", "Litros", 1.5, 18);
        System.out.println(g2.toString());
        this.agregarProducto(g2);

        Perfumeria p1 = new Perfumeria("Shampoo Sedal", "Contenido", 500, 19);
        System.out.println(p1.toString());
        this.agregarProducto(p1);

        Fruteria f1 = new Fruteria("Frutillas", "kilo", 1, 64);
        System.out.println(f1.toString());
        this.agregarProducto(f1);

        System.out.println("=============================");
    }

    public void comparadorDeProductos() {
        Productos max, min;
        max = this.listaDeProductos.get(0);
        min = this.listaDeProductos.get(0);
        for (Productos producto : listaDeProductos) {

            if (producto.compareTo(max) > 0) {
                 max = producto;
            } else if (producto.compareTo(min) < 0) {
                 min = producto;
            }

        }

        System.out.println("Producto más caro: " + max.getNombre());
        System.out.println("Producto más barato: " + min.getNombre());

    }

}
