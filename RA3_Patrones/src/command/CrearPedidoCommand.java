package command;

import model.Pedido;

public class CrearPedidoCommand implements Command {

    private final Pedido pedido;

    public CrearPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void ejecutar() {
        pedido.crear();
    }

    @Override
    public void deshacer() {
        pedido.eliminar();
    }
}