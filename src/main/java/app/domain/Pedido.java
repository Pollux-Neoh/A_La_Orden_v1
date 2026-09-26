package main.java.app.domain;

import main.java.app.domain.enums.EstadoPedido;

import java.util.List;

public class Pedido {

    private int id;
    private Cliente cliente;
    private List<DetallePedido> detalles;
    private EstadoPedido estado;
    private double total;


    //---------------------------

    // Constructor vacío
    public Pedido() {
    }

    // Constructor
    public Pedido(int id, Cliente cliente, List<DetallePedido> detalles,
                  EstadoPedido estado, double total) {

        this.id = id;
        this.cliente = cliente;
        this.detalles = detalles;
        this.estado = estado;
        this.total = total;
    }

    //---------------------------
    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    //---------------------------

    // METODOS CALCULAR TOTAL
    public double calcularTotal() {

        double total = 0;

        for (DetallePedido detalle : detalles) {
            total += detalle.calcularSubtotal();
        }

        this.total = total;

        return total;
    }


    public void cambiarEstado(EstadoPedido estado) {
        this.estado = estado;
    }
}





