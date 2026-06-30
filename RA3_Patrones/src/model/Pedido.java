package model;

import java.util.ArrayList;
import observer.Observer;
import observer.Subject;

public class Pedido implements Subject {

    private Cliente cliente;
    private Producto producto;
    private int cantidad;
    private String metodoPago;
    private String estado;
    private ArrayList<Observer> observadores = new ArrayList<>();

    public Pedido() {
        estado = "CREADO";
    }

    public Pedido(Cliente cliente, Producto producto, int cantidad, String metodoPago) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.metodoPago = metodoPago;
        this.estado = "CREADO";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // ===========================
    // Métodos que usará Command
    // ===========================
    public void crear() {
        estado = "CREADO";
        notificar("Pedido Creado");
    }

    public void pagar() {
        estado = "PAGADO";
        notificar("Pago procesado correctamente");
    }

    public void enviar() {
        estado = "ENVIADO";
        notificar("Pedido enviado al cliente");
    }

    public void entregar() {
        estado = "ENTREGADO";
        notificar("Pedido entregado");
    }

    public void cancelar() {
        estado = "CANCELADO";
        notificar("Pedido cancelado");
    }

    public void eliminar() {
        estado = " ";
        notificar("Pedido Eliminado");
    }

    @Override
    public void agregarObserver(Observer o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObserver(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificar(String mensaje) {
        for (Observer o : observadores) {
            o.actualizar(mensaje);
        }
    }

    public boolean estaCreado() {
        return estado.equals("CREADO");
    }

    public boolean estaPagado() {
        return estado.equals("PAGADO");
    }

    public boolean estaEnviado() {
        return estado.equals("ENVIADO");
    }

    public boolean estaEntregado() {
        return estado.equals("ENTREGADO");
    }

    public boolean estaCancelado() {
        return estado.equals("CANCELADO");
    }

    public double calcularTotal() {
        return producto.getPrecio() * cantidad;

    }
}
