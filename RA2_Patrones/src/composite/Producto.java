package composite;

public class Producto implements ComponenteProducto {

    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {this.nombre = nombre;this.precio = precio;
    }
    @Override
    public void mostrar(String indent) {

        System.out.println(indent+ "- Producto: "+ nombre+ " | Precio: S/. "+ precio);
    }
}