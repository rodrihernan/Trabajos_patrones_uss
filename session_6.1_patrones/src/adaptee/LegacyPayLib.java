package adaptee;

public class LegacyPayLib {

    public void realizarTransaccion(int centavos, String codigoDivisa) {

        System.out.println("[LegacyPayLib] Procesando transaccion...");
        System.out.println("Monto en centavos: " + centavos);
        System.out.println("Codigo divisa: " + codigoDivisa);

    }

}
