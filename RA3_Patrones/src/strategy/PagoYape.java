package strategy;

import javax.swing.JOptionPane;

public class PagoYape implements MetodoPago {

    @Override
    public void pagar(double monto) {

        JOptionPane.showMessageDialog(null,
                "Pago realizado con YAPE\nMonto: S/. " + monto);

    }

}