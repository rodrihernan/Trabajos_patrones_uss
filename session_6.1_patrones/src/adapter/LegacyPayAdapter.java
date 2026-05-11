package adapter;

import adaptee.LegacyPayLib;
import target.PasarelaPago;

public class LegacyPayAdapter implements PasarelaPago {

    private final LegacyPayLib legacyPayLib;
    String codigoDivisa;

    public LegacyPayAdapter(LegacyPayLib legacyPayLib) {
        this.legacyPayLib = legacyPayLib;
    }

    @Override
    public void procesarPago(double monto, String moneda) {

        System.out.println("[Adapter] Adaptando pago moderno a libreria legacy");
        int centavos = (int) (monto * 100);
        if (moneda.equalsIgnoreCase("soles")) {
            this.codigoDivisa = "PEN";
        } else if (moneda.equalsIgnoreCase("dolares")) {
            this.codigoDivisa = "USD";
        } else {
            this.codigoDivisa = moneda.toUpperCase();
        }

        System.out.println("Monto original: " + monto + " " + moneda);
        System.out.println("Monto convertido: " + centavos + " centavos");

        legacyPayLib.realizarTransaccion(centavos, codigoDivisa);

    }

}
