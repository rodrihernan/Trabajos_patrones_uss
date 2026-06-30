package command;

import model.Pedido;

public class EnviarPedidoCommand implements Command {

    private Pedido pedido;

    public EnviarPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void ejecutar() {
        pedido.enviar();
    }

    @Override
    public void deshacer() {
        pedido.cancelar();
    }

}
