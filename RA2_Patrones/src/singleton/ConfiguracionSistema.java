package singleton;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    private final String empresa;
    private final double igv;

    private ConfiguracionSistema() {
        this.empresa = "Saga Falabella";
        this.igv = 0.18;
    }

    public static ConfiguracionSistema getInstancia() {

        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }

        return instancia;
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getIgv() {
        return igv;
    }

}
