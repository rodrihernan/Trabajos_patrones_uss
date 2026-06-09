package decorator;

public class EmpaquePremiumDecorator extends PedidoDecorator {

    public EmpaquePremiumDecorator(PedidoServicio pedido) {
        super(pedido);
    }
    @Override
    public String getDescripcion() {

        return pedido.getDescripcion()+ " + Empaque Premium";
    }
    @Override
    public double getCosto() {

        return pedido.getCosto() + 15.00;
    }
}
