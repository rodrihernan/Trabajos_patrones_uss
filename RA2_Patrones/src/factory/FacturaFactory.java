package factory;

public class FacturaFactory extends ComprobanteFactory {

    @Override
    public Comprobante crearComprobante() {

        return new Factura();
    }
}
