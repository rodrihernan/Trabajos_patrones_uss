package app;

import adapter.PagoAdapter;
import adapter.PagoExterno;
import adapter.PasarelaPago;

import builder.Pedido;
import builder.PedidoBuilder;

import composite.CategoriaProductos;
import composite.Producto;

import decorator.EmpaquePremiumDecorator;
import decorator.EnvioExpressDecorator;
import decorator.GarantiaDecorator;
import decorator.PedidoBase;
import decorator.PedidoServicio;

import factory.BoletaFactory;
import factory.Comprobante;
import factory.ComprobanteFactory;
import factory.FacturaFactory;

import singleton.ConfiguracionSistema;

public class Main {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("        SAGA FALABELLA");
        System.out.println("----------------------------------------");

        // SINGLETON
        
        System.out.println("\n[CONFIGURACION DEL SISTEMA]");

        ConfiguracionSistema config
                = ConfiguracionSistema.getInstancia();

        System.out.println("Empresa: "
                + config.getEmpresa());

        System.out.println("IGV: "
                + config.getIgv());
        
        // COMPOSITE
        
        System.out.println("\n[CATALOGO DE PRODUCTOS]");

        CategoriaProductos tecnologia
                = new CategoriaProductos("Tecnologia");

        tecnologia.agregar(
                new Producto(
                        "Laptop Lenovo",
                        3500
                )
        );

        tecnologia.agregar(
                new Producto(
                        "Mouse Logitech",
                        120
                )
        );

        CategoriaProductos hogar
                = new CategoriaProductos("Hogar");

        hogar.agregar(
                new Producto(
                        "Refrigeradora LG",
                        2800
                )
        );

        hogar.agregar(
                new Producto(
                        "Microondas Samsung",
                        650
                )
        );

        tecnologia.mostrar("");
        hogar.mostrar("");
        
        // BUILDER
        
        System.out.println("\n====================================");
        System.out.println("          PRIMER PEDIDO");
        System.out.println("-------------------------------------------");

        Pedido pedido1
                = new PedidoBuilder()
                        .setCliente("Juan Perez")
                        .setDireccion("Chiclayo")
                        .setMetodoPago("Tarjeta")
                        .build();

        pedido1.mostrarPedido();
        
        // DECORATOR
        
        System.out.println("\n[SERVICIOS ADICIONALES]");

        PedidoServicio servicio1
                = new EnvioExpressDecorator(
                        new GarantiaDecorator(
                                new PedidoBase()
                        )
                );

        System.out.println(
                servicio1.getDescripcion()
        );

        System.out.println(
                "Costo total: S/. "
                + servicio1.getCosto()
        );
        
        // FACTORY
        
        System.out.println("\n[GENERANDO COMPROBANTE]");

        ComprobanteFactory factory1
                = new BoletaFactory();

        Comprobante comprobante1
                = factory1.crearComprobante();

        comprobante1.generar();
        
        // ADAPTER
        
        System.out.println("\n[PROCESANDO PAGO]");

        PasarelaPago pago1
                = new PagoAdapter(
                        new PagoExterno()
                );

        pago1.procesarPago(
                servicio1.getCosto()
        );
        
        // SEGUNDO PEDIDO
        
        System.out.println("\n====================================");
        System.out.println("          SEGUNDO PEDIDO");
        System.out.println("---------------------------------------");

        Pedido pedido2
                = new PedidoBuilder()
                        .setCliente("Maria Torres")
                        .setDireccion("Lima")
                        .setMetodoPago("Yape")
                        .build();

        pedido2.mostrarPedido();

        System.out.println("\n[SERVICIOS ADICIONALES]");

        PedidoServicio servicio2
                = new EmpaquePremiumDecorator(
                        new EnvioExpressDecorator(
                                new PedidoBase()
                        )
                );

        System.out.println(
                servicio2.getDescripcion()
        );

        System.out.println(
                "Costo total: S/. "
                + servicio2.getCosto()
        );

        System.out.println("\n[GENERANDO COMPROBANTE]");

        ComprobanteFactory factory2
                = new FacturaFactory();

        Comprobante comprobante2
                = factory2.crearComprobante();

        comprobante2.generar();

        System.out.println("\n[PROCESANDO PAGO]");

        PasarelaPago pago2
                = new PagoAdapter(
                        new PagoExterno()
                );

        pago2.procesarPago(
                servicio2.getCosto()
        );

        System.out.println("\n====================================");
        System.out.println("        FIN DEL SISTEMA");

    }

}

