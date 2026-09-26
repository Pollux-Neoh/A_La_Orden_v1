package main.java.app.repository;
import main.java.app.domain.Pedido;

import java.util.ArrayList;
import java.util.List;


public class PedidoRepository {

    private List<Pedido> pedidos;

    //---------------------------
    //ID QUE SE ASIGNARA AL SGT PEDIDO
    private int siguienteId;

    //Constructor


    public PedidoRepository() {
        this.pedidos = new ArrayList<>();
        this.siguienteId = 1;
    }

    //---------------------------
    //GUARDAR PEDIDO
    public void guardar(Pedido pedido){
        // Si el pedido no tiene ID, se le asigna automáticamente
        if (pedido.getId() == 0) {
            pedido.setId(siguienteId); siguienteId++; }

        pedidos.add(pedido);

        }


    //---------------------------
    //BUSCAR POR ID
    public Pedido buscarPorId(int id){
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == id){
                return pedido;
            }
        }
        return null;
    }

    //LISTAR TODOS LOS PEDIDOS
    public List<Pedido> listar() {
        return pedidos;
    }



    //---------------------------
    //ELIMINAR PEDIDO
    public void eliminar(int id){
        Pedido pedido = buscarPorId(id);
        if  (pedido != null){
            pedidos.remove(pedido);
        }
    }
}
