package app;

import adapter.PagoAdapter;
import adapter.PagoExterno;
import adapter.PasarelaPago;

import builder.Pedido;
import builder.PedidoBuilder;

import composite.CategoriaProductos;
import composite.Producto;

import decorator.EnvioExpressDecorator;
import decorator.GarantiaDecorator;
import decorator.PedidoBase;
import decorator.PedidoServicio;

import factory.BoletaFactory;
import factory.Comprobante;
import factory.ComprobanteFactory;

import singleton.ConfiguracionSistema;

public class Main {

    public static void main(String[] args) {

        System.out.println(" ----------- SAGA FALABELLA -----------");

        // SINGLETON
        ConfiguracionSistema config
                = ConfiguracionSistema.getInstancia();

        System.out.println("Empresa: " + config.getEmpresa());
        System.out.println("IGV: " + config.getIgv());
        System.out.println();

        // COMPOSITE
        CategoriaProductos tecnologia = new CategoriaProductos("Tecnologia");

        tecnologia.agregar(new Producto("Laptop Lenovo", 3500));
        tecnologia.agregar(new Producto("Mouse Logitech", 120));
        tecnologia.mostrar("");
        System.out.println();

        // BUILDER
        Pedido pedido = new PedidoBuilder()
                .setCliente("Hernán Rodriguez")
                .setDireccion("Chiclayo")
                .setMetodoPago("Tarjeta")
                .build();

        pedido.mostrarPedido();
        System.out.println();

        // DECORATOR
        PedidoServicio servicio = new EnvioExpressDecorator(new GarantiaDecorator(new PedidoBase()));
        System.out.println(servicio.getDescripcion());
        System.out.println("Costo: S/. " + servicio.getCosto());
        System.out.println();

        // FACTORY
        ComprobanteFactory factory = new BoletaFactory();
        Comprobante comprobante = factory.crearComprobante();
        comprobante.generar();
        System.out.println();

        // ADAPTER
        PasarelaPago pago = new PagoAdapter(new PagoExterno());
        pago.procesarPago(servicio.getCosto());
    }

}
