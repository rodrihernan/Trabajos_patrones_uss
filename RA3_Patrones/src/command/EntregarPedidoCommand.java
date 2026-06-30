package command;

import model.Pedido;

public class EntregarPedidoCommand implements Command {

    private Pedido pedido;

    public EntregarPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void ejecutar() {
        pedido.entregar();
    }

    @Override
    public void deshacer() {
        pedido.enviar();
    }
}
