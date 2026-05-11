package cliente;

import target.PasarelaPago;

public class Tienda {

    private final PasarelaPago pasarelaPago;

    public Tienda(PasarelaPago pasarelaPago) {
        this.pasarelaPago = pasarelaPago;
    }

    public void cobrar(double monto, String moneda) {

        System.out.println("\n[Tienda] Iniciando pago...");
        pasarelaPago.procesarPago(monto, moneda);

    }

}
