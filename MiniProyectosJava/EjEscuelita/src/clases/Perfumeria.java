
package clases;

public class Perfumeria extends Productos {
    
   public Perfumeria (String nombre,String tipoUnidad, double capacidad, int precio) {
        super(nombre, tipoUnidad, capacidad, precio);
       
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nombre: ").append(nombre);
        sb.append(" /// ");
        sb.append("Contenido: ").append((int)capacidad+" ml");
        sb.append(" /// ");
        sb.append("Precio: $").append(precio);
        return sb.toString();
    }
    
    
    
}
