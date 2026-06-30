package observer;

import javax.swing.JLabel;

public class EstadoObserver implements Observer {

    private JLabel estado;

    public EstadoObserver(JLabel estado) {
        this.estado = estado;
    }

    @Override
    public void actualizar(String mensaje) {

        estado.setText(mensaje);

    }

}
