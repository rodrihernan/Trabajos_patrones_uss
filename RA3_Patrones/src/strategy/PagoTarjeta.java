package strategy;

import javax.swing.JOptionPane;

public class PagoTarjeta implements MetodoPago {

    @Override
    public void pagar(double monto) {

        JOptionPane.showMessageDialog(null,
                "Pago realizado con TARJETA\nMonto: S/. " + monto);

    }

}
