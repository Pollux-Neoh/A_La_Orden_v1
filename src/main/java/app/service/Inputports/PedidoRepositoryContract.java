package main.java.app.service.Inputports;

import main.java.app.domain.Pedido;

import java.util.List;

public interface PedidoRepositoryContract {

    void guardar(Pedido pedido);

    Pedido buscarPorId(int id);

    List<Pedido> listar();

    void eliminar(int id);
}
