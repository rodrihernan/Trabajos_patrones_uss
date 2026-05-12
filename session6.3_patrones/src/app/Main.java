package app;

import abstraction.Reporte;
import concrete_implementor.ExportadorArchivo;
import concrete_implementor.ExportadorConsola;
import implementor.Exportador;
import java.util.ArrayList;
import java.util.List;
import refined_abstraction.ReporteDetallado;
import refined_abstraction.ReporteResumen;

public class Main {

    public static void main(String[] args) {

        // Lista de ventas
        List<String> ventas = new ArrayList<>();

        ventas.add("Venta Laptop S/3500");
        ventas.add("Venta Mouse S/80");
        ventas.add("Venta Monitor S/900");
        ventas.add("Venta Teclado S/150");

        Exportador consola = new ExportadorConsola();
        Exportador archivo = new ExportadorArchivo();

        Reporte resumenConsola = new ReporteResumen(consola);
        resumenConsola.generar(ventas);

        Reporte resumenArchivo = new ReporteResumen(archivo);
        resumenArchivo.generar(ventas);

        Reporte detalladoConsola = new ReporteDetallado(consola);
        detalladoConsola.generar(ventas);

        Reporte detalladoArchivo = new ReporteDetallado(archivo);
        detalladoArchivo.generar(ventas);

    }

}
