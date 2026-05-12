package concrete_implementor;

import implementor.Exportador;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ExportadorArchivo implements Exportador {

    @Override
    public void exportar(String titulo, List<String> filas) {

        String nombreArchivo = titulo.replace(" ", "_") + ".txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {

            writer.println("===== " + titulo + " =====");

            for (String fila : filas) {
                writer.println(fila);
            }

            System.out.println("[Archivo] Reporte exportado: " + nombreArchivo);

        } catch (IOException e) {

            System.out.println("Error al escribir archivo");

        }

    }

}
