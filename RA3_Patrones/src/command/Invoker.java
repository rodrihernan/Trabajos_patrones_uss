package command;

import java.util.Stack;

public class Invoker {

    private Stack<Command> historial = new Stack<>();

    public void ejecutarComando(Command comando) {

        comando.ejecutar();
        historial.push(comando);

    }

    public void deshacer() {

        if (!historial.isEmpty()) {

            historial.pop().deshacer();

        } else {

            System.out.println("No hay acciones para deshacer.");

        }

    }

}