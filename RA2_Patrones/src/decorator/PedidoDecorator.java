package decorator;

public abstract class PedidoDecorator implements PedidoServicio {

    protected final PedidoServicio pedido;

    public PedidoDecorator(PedidoServicio pedido) {
        this.pedido = pedido;
    }

    @Override
    public String getDescripcion() {
        return pedido.getDescripcion();
    }

    @Override
    public double getCosto() {
        return pedido.getCosto();
    }

}