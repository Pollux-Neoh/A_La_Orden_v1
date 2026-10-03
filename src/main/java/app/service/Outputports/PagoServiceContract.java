package main.java.app.service.Outputports;

import main.java.app.domain.Pago;
import main.java.app.domain.Pedido;
import main.java.app.domain.enums.EstadoPago;
import main.java.app.domain.enums.MetodoPago;

public interface PagoServiceContract {

    Pago procesarPago(Pedido pedido, double monto, MetodoPago metodoPago);

    Pago consultarPago(int id);

    void cambiarEstado(Pago pago, EstadoPago nuevoEstado);
}
