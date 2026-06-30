package state;

public class EstadoCancelado implements EstadoPedido {

    @Override
    public String getNombre() {
        return "CANCELADO";
    }

}