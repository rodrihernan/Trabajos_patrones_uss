package command;
import model.Pedido;
public class CancelarPedidoCommand implements Command {

    private final Pedido pedido;

    public CancelarPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void ejecutar() {
        pedido.cancelar();
    }

    @Override
    public void deshacer() {
        System.out.println("Cancelación revertida.");
    }
}
