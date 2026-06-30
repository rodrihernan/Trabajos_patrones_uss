package state;

public class EstadoPagado implements EstadoPedido {

    @Override
    public String getNombre() {
        return "PAGADO";
    }

}