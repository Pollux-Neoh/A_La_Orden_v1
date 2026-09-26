package main.java.app.domain;

import main.java.app.domain.enums.RolUsuario;

public class Cliente extends User {

    private String direccion;

    public Cliente() {
        super();
        this.rolUsuario = RolUsuario.CLIENTE;
    }


    public Cliente(int id, String nombre, String correo, String contrasenia,
                   String telefono, boolean estado, String direccion) {

        super(id, nombre, correo, contrasenia, telefono, estado, RolUsuario.CLIENTE);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}



/*
    //MÉTODOS SEGÚN EL DIAGRAMA UML

    public List<Producto> seleccionarProductos() {
        System.out.println("El cliente " + this.nombre + " está seleccionando productos...");
        return new ArrayList<>(); // Retorna una lista vacía por ahora como cascarón
    }

    public Pedido realizarPedido() {
        System.out.println("El cliente " + this.nombre + " ha realizado un nuevo pedido.");
        return null; // Retornará el objeto Pedido cuando construyamos la lógica
    }

    public void pagarPedido() {
        System.out.println("El cliente " + this.nombre + " está procesando el pago del pedido.");
    }

    public List<Pedido> verEstadoPedido() {
        System.out.println("Consultando el historial/estado de pedidos de: " + this.nombre);
        return new ArrayList<>(); // Retorna lista vacía por ahora
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
*/