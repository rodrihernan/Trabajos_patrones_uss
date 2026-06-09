package decorator;

public class GarantiaDecorator extends PedidoDecorator {

    public GarantiaDecorator(PedidoServicio pedido) {
        super(pedido);
    }
    @Override
    public String getDescripcion() {

        return pedido.getDescripcion()+ " + Garantia Extendida";
    }
    @Override
    public double getCosto() {

        return pedido.getCosto() + 80.00;
    }
}