package main.java.app.service;

import main.java.app.domain.Cliente;
import main.java.app.domain.DetallePedido;
import main.java.app.domain.Pedido;
import main.java.app.domain.enums.EstadoPago;
import main.java.app.domain.enums.EstadoPedido;
import main.java.app.repository.PedidoRepository;

import java.util.List;

public class PedidoService {

    private PedidoRepository pedidoRepository;


    //CONSTRUCTOR
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }


    //METODOS
    //REALIZAR PEDIDO
    public Pedido realizarPedido(Cliente cliente, List<DetallePedido> detallePedido){

        Pedido pedido = new Pedido();

        pedido.setCliente(cliente);
        pedido.setDetalles(detallePedido);
        pedido.setEstado(EstadoPedido.EN_CREACION);
        pedido.calcularTotal();
        pedidoRepository.guardar(pedido);
        return pedido;

    }

    //CONSULTAR PEDIDO
    public Pedido consultarPedido(int id){
        return pedidoRepository.buscarPorId(id);
    }

    // CAMBIAR ESTADO DEL PEDIDO
    public void cambiarEstadoPedido(Pedido pedido, EstadoPedido nuevoEstado){
        pedido.cambiarEstado(nuevoEstado);
    }

    //GENERAR QR

    public String generarQr(Pedido pedido){
        return "QR-PEDIDO-" + pedido.getId();
    }



}
