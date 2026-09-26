package main.java.app.domain;
import main.java.app.domain.enums.EstadoPago;
import main.java.app.domain.enums.MetodoPago;

import java.time.LocalDateTime;


public class Pago {

    private int id;
    private Pedido pedido;
    private double monto;
    private EstadoPago estado;
    private LocalDateTime fecha;
    private MetodoPago metodoPago;


    //CONSTRUCTOR VACIO

    //CONSTRUCTOR
    public Pago(Pedido pedido, double monto, EstadoPago estado,
                LocalDateTime fecha, MetodoPago metodoPago) {

        this.pedido = pedido;
        this.monto = monto;
        this.estado = estado;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
    }

    public Pago() {

    }

    //SETTERS GETTERS


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public EstadoPago getEstado() {
        return estado;
    }

    public void setEstado(EstadoPago estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }


}

