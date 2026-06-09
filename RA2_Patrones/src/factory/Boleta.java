package factory;

public class Boleta implements Comprobante {

    @Override
    public void generar() {

        System.out.println("=== BOLETA DE VENTA ===");
        System.out.println("Saga Falabella");
        System.out.println("Cliente: Consumidor Final");

    }

}
    