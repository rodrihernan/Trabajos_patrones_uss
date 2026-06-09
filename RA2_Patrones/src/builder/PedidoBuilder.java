package builder;

public class PedidoBuilder {

    private final Pedido pedido;

    public PedidoBuilder() {
        pedido = new Pedido();
    }

    public PedidoBuilder setCliente(String cliente) {
        pedido.setCliente(cliente);
        return this;
    }

    public PedidoBuilder setDireccion(String direccion) {
        pedido.setDireccion(direccion);
        return this;
    }

    public PedidoBuilder setMetodoPago(String metodoPago) {
        pedido.setMetodoPago(metodoPago);
        return this;
    }

    public PedidoBuilder setTipoEntrega(String tipoEntrega) {
        pedido.setTipoEntrega(tipoEntrega);
        return this;
    }

    public Pedido build() {
        return pedido;
    }

}