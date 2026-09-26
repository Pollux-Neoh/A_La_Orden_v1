package main.java.app.domain;

import main.java.app.domain.enums.RolUsuario;

public class Administrador extends User {

    // Constructor vacío
    public Administrador() {
        super();
        setRolUsuario(RolUsuario.ADMIN);
    }

    // Constructor
    public Administrador(String nombre, String correo, String contrasenia,
                         String telefono, boolean estado) {

        super(0, nombre, correo, contrasenia, telefono, estado, RolUsuario.ADMIN);
    }
}
