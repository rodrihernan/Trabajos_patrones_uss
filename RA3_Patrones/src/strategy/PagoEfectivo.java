package strategy;

import javax.swing.JOptionPane;

public class PagoEfectivo implements MetodoPago {

    @Override
    public void pagar(double monto) {

        JOptionPane.showMessageDialog(null,
                "Pago realizado en EFECTIVO\nMonto: S/. " + monto);

    }

}