package main.java.app.service;

import main.java.app.domain.Pago;
import main.java.app.domain.Pedido;
import main.java.app.domain.enums.EstadoPago;
import main.java.app.domain.enums.EstadoPedido;
import main.java.app.domain.enums.MetodoPago;
import main.java.app.repository.PagoRepository;

import java.time.LocalDateTime;

public class PagoService {
    private PagoRepository pagoRepository;

    public PagoService(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    //PROCESAR UN PAGO

    public Pago procesarPago(Pedido pedido, double monto, MetodoPago metodoPago) {

        Pago pago = new Pago();

        pago.setPedido(pedido);
        pago.setMonto(monto);
        pago.setEstado(EstadoPago.PAGADO);
        pago.setFecha(LocalDateTime.now());
        pago.setMetodoPago(metodoPago);

        pagoRepository.guardar(pago);

        return pago;
    }
    // Consultar un pago
    public Pago consultarPago(int id) {
        return pagoRepository.buscarPorId(id);
    }

    // Cambiar estado del pago
    public void cambiarEstado(Pago pago, EstadoPago nuevoEstado) {
        pago.setEstado(nuevoEstado);
    }

}
