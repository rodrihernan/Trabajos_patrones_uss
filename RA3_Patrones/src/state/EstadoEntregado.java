package state;

public class EstadoEntregado implements EstadoPedido {

    @Override
    public String getNombre() {
        return "ENTREGADO";
    }

}