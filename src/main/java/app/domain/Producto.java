package main.java.app.domain;

public class Producto {

    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadDisp;
    private boolean disponible;


    //---------------------------
    //CONSTRUCTORES
    // Constructor vacío
    public Producto() {

    }

    public Producto(int id, String nombre, String descripcion, double precio, int cantidadDisp, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadDisp = cantidadDisp;
        this.disponible = disponible;
    }


    //---------------------------
    //GETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisp() {
        return cantidadDisp;
    }

    public void setCantidadDisp(int cantidadDisp) {
        this.cantidadDisp = cantidadDisp;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


}
