package main.java.app.service;


import main.java.app.domain.Pago;
import main.java.app.domain.Pedido;

public class EmpCaService {

    private PedidoService pedidoService;
    private PagoService pagoService;

    // Constructor
    public EmpCaService(PedidoService pedidoService, PagoService pagoService) {
    this.pedidoService = pedidoService;
	this.pagoService = pagoService;
}

    // Encanear QR
    public Pedido escanearQR(int idPedido) {

    return pedidoService.consultarPedido(idPedido);
}

    // CONFIRMAR PAGO
    public void confirmarPago(Pago pago) {

        pagoService.cambiarEstado(
                pago,
                main.java.app.domain.enums.EstadoPago.PAGADO
        );
}
    // GENERAR FACTURA
    public void generarFactura(Pedido pedido) {

        System.out.println("-------- FACTURA --------");
        System.out.println("Pedido #" + pedido.getId());
        System.out.println("Cliente #" + pedido.getCliente());
        System.out.println("Total: $" + pedido.getTotal());
        System.out.println("------------------------");
    }

}

