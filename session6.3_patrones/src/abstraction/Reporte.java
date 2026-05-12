package abstraction;

import implementor.Exportador;
import java.util.List;

public abstract class Reporte {

    protected final Exportador exportador;

    public Reporte(Exportador exportador) {
        this.exportador = exportador;
    }

    public abstract void generar(List<String> datos);

}
