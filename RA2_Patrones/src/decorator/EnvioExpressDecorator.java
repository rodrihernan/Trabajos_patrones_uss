package decorator;

public class EnvioExpressDecorator extends PedidoDecorator {

    public EnvioExpressDecorator(PedidoServicio pedido) {
        super(pedido);
    }
    @Override
    public String getDescripcion() {

        return pedido.getDescripcion()+ " + Envio Express";
    }
    @Override
    public double getCosto() {

        return pedido.getCosto() + 25.00;
    }
}