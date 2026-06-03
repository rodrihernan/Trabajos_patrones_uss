package composite;

import java.util.ArrayList;
import java.util.List;

public class CategoriaProductos implements ComponenteProducto {

    private final String nombre;

    private final List<ComponenteProducto> componentes =
            new ArrayList<>();

    public CategoriaProductos(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteProducto componente) {

        componentes.add(componente);

    }

    public void eliminar(ComponenteProducto componente) {

        componentes.remove(componente);

    }

    @Override
    public void mostrar(String indent) {
        System.out.println(indent+ "+ Categoria: "+ nombre);
        for (ComponenteProducto componente : componentes) {

            componente.mostrar(indent + "   ");
        }
    }
}