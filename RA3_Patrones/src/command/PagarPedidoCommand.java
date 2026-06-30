package command;

import model.Pedido;

public class PagarPedidoCommand implements Command {
    private final Pedido pedido;
    public PagarPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }
    @Override
    public void ejecutar() {
        pedido.pagar();
    }

    @Override
    public void deshacer() {
        System.out.println("Pago revertido.");
    }

}
