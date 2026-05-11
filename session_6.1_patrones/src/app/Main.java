package app;

import adaptee.LegacyPayLib;
import adapter.LegacyPayAdapter;
import cliente.Tienda;
import target.PasarelaPago;

public class Main {

    public static void main(String[] args) {

        PasarelaPago pagoDirecto = new PasarelaPago() {

            @Override
            public void procesarPago(double monto, String moneda) {

                System.out.println("[Pasarela Moderna]");
                System.out.println("Procesando pago de: "
                        + monto + " " + moneda);

            }
        };

        Tienda tienda1 = new Tienda(pagoDirecto);

        tienda1.cobrar(50.75, "soles");

        // Librería antigua
        LegacyPayLib legacyLib = new LegacyPayLib();

        // Adaptador
        PasarelaPago adapter = new LegacyPayAdapter(legacyLib);

        // Tienda usando el adaptador
        Tienda tienda2 = new Tienda(adapter);

        tienda2.cobrar(25.50, "soles");

        tienda2.cobrar(100.75, "dolares");

    }

}
