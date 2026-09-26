package main.java.app.domain;

import main.java.app.domain.enums.RolUsuario;
import main.java.app.domain.enums.Turno;

public class EmpCa extends Empleado {

    // Constructor vacío
    public EmpCa() {
        super();
        setRolUsuario(RolUsuario.CAJERO);
    }

    // Constructor
    public EmpCa(String nombre, String correo, String contrasenia,
                 String telefono, boolean estado, Turno turno) {

        super(nombre, correo, contrasenia, telefono, estado, turno);
        setRolUsuario(RolUsuario.CAJERO);
    }
}
