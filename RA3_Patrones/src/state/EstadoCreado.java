package state;

public class EstadoCreado implements EstadoPedido {

    @Override
    public String getNombre() {
        return "CREADO";
    }

}