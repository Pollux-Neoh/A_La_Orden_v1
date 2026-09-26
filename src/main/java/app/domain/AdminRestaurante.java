package main.java.app.domain;

import main.java.app.domain.enums.RolUsuario;

public class AdminRestaurante extends User {

    private Restaurante restaurante;

    // Constructor vacío
    public AdminRestaurante() {
        super();
        setRolUsuario(RolUsuario.ADMIN_RESTAURANTE);
    }

    // Constructor
    public AdminRestaurante(String nombre, String correo,
                            String contrasenia, String telefono,
                            boolean estado, Restaurante restaurante) {

        super(0, nombre, correo, contrasenia, telefono,
                estado, RolUsuario.ADMIN_RESTAURANTE);

        this.restaurante = restaurante;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
