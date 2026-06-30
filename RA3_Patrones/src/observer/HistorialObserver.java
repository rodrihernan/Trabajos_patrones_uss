package observer;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JTextArea;

public class HistorialObserver implements Observer {

    private JTextArea area;

    public HistorialObserver(JTextArea area) {
        this.area = area;
    }

    @Override
    public void actualizar(String mensaje) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

        String hora = LocalTime.now().format(formato);

        area.append("=====================================\n");
        area.append(hora + "  " + mensaje + "\n\n");

    }

}
