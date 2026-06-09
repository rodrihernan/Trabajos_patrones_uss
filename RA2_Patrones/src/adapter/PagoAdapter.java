package adapter;

public class PagoAdapter implements PasarelaPago {

    private final PagoExterno pagoExterno;

    public PagoAdapter(PagoExterno pagoExterno) {
        this.pagoExterno = pagoExterno;
    }

    @Override
    public void procesarPago(double monto) {

        System.out.println("[Adapter] Adaptando sistema de pago...");
        pagoExterno.realizarTransaccion(monto);
    }
}
