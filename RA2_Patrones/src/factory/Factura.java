package factory;

public class Factura implements Comprobante {

    @Override
    public void generar() {

        System.out.println("=== FACTURA ===");
        System.out.println("Saga Falabella");
        System.out.println("Cliente Empresarial");

    }

}
