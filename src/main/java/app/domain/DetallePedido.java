package main.java.app.domain;

public class DetallePedido {
    private int id;
    private Producto producto;
    private int cantidad;
    private double subtotal;



    //---------------------------
    //Constructor vacio
    public DetallePedido() {

    }

    public DetallePedido(int id, Producto producto, int cantidad, double subtotal) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    //---------------------------
    //GETTERS SETTERS


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    //METODOS
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

}
