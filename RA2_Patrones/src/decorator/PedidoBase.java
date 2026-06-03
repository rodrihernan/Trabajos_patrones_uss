package decorator;

public class PedidoBase implements PedidoServicio {

    @Override
    public String getDescripcion() {
        return "Pedido Base";
    }

    @Override
    public double getCosto() {
        return 100.00;
    }
}