package main.java.app.service.Outputports;

import main.java.app.domain.Pago;
import main.java.app.domain.Pedido;

public interface EmpCaServiceContract {

    Pedido escanearQR(int idPedido);

    void confirmarPago(Pago pago);

    void generarFactura(Pedido pedido);
}
