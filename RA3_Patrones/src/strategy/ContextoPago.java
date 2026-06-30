package strategy;

public class ContextoPago {

    private MetodoPago metodoPago;

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void procesarPago(double monto) {

        if (metodoPago != null) {
            metodoPago.pagar(monto);
        }
    }
}
