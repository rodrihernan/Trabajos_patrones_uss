package builder;

public class Pedido {

    private String cliente;
    private String direccion;
    private String metodoPago;
    private String tipoEntrega;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public void mostrarPedido() {

        System.out.println("=== PEDIDO ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Direccion: " + direccion);
        System.out.println("Metodo de Pago: " + metodoPago);
        System.out.println("Tipo de Entrega: " + tipoEntrega);

    }

}