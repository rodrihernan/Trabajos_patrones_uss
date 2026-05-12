package concrete_implementor;

import implementor.Exportador;
import java.util.List;

public class ExportadorConsola implements Exportador {

    @Override
    public void exportar(String titulo, List<String> filas) {

        System.out.println("\n===== " + titulo + " =====");

        for (String fila : filas) {
            System.out.println(fila);
        }

    }

}
