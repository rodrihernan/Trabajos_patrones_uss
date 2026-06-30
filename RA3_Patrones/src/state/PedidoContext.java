package state;

public class PedidoContext {

    private EstadoPedido estado;

    public PedidoContext() {

        estado = new EstadoCreado();

    }

    public void cambiarEstado(EstadoPedido estado) {

        this.estado = estado;

    }

    public String getEstado() {

        return estado.getNombre();

    }

}