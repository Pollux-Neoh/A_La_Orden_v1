package main.java.app.service.Outputports;

import main.java.app.domain.Cliente;
import main.java.app.domain.DetallePedido;
import main.java.app.domain.Pedido;
import main.java.app.domain.enums.EstadoPedido;

import java.util.List;

public interface PedidoServiceContract {

    Pedido realizarPedido(Cliente cliente, List<DetallePedido> detallePedido);

    Pedido consultarPedido(int id);

    void cambiarEstadoPedido(Pedido pedido, EstadoPedido nuevoEstado);

    String generarQr(Pedido pedido);
}
