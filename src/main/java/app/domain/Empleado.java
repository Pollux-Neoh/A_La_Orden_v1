package main.java.app.domain;

import main.java.app.domain.enums.RolUsuario;
import main.java.app.domain.enums.Turno;



public class Empleado extends User {

    private Turno turno;



    // CONSTRUCTOR VACIO
    public Empleado() {
        super();
        this.rolUsuario = RolUsuario.EMPLEADO;
    }


    // CONSTRUCTOR
    public Empleado(String nombre, String correo, String contraseña,
                    String telefono, boolean estado, Turno turno) {

        super(0, nombre, correo, contraseña, telefono, estado, RolUsuario.EMPLEADO);
        this.turno = turno;
    }


    //GETTERS SETTERS

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
