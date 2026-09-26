package main.java.app.domain;
//atributos
import java.util.ArrayList;
import java.util.List;


public class Restaurante {

    // Atributos
    private int id;
    private String nombre;
    private String direccion;
    private String horario;
    private String imagen;
    private double calificacionPromedio;
    private double latitud;
    private double longitud;
    private List<Producto> productos;

    // Constructores
    public Restaurante() {
        this.productos = new ArrayList<>();
    }

    public Restaurante(int id, String nombre, String direccion, String horario, String imagen,
                       double calificacionPromedio, double latitud, double longitud,
                       List<Producto> productos) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.horario = horario;
        this.imagen = imagen;
        this.calificacionPromedio = calificacionPromedio;
        this.latitud = latitud;
        this.longitud = longitud;
        this.productos = productos;
    }

    // Getters y setters
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getCalificacionPromedio() {
        return calificacionPromedio;
    }

    public void setCalificacionPromedio(double calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}
