package state;

public class EstadoEnviado implements EstadoPedido {

    @Override
    public String getNombre() {
        return "ENVIADO";
    }

}