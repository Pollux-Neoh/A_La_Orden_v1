package main.java.app.domain;


import main.java.app.domain.enums.RolUsuario;
import main.java.app.domain.enums.Turno;

public class EmpCo extends Empleado {

    //CONSTRUCTOR VACIO
    public EmpCo() {
        super();
        this.rolUsuario = RolUsuario.ENCARGADO_CO;
    }

    // Constructor
    public EmpCo(String nombre, String correo, String contrasenia,
                 String telefono, boolean estado, Turno turno) {

        super(nombre, correo, contrasenia, telefono, estado, turno);
        this.rolUsuario = RolUsuario.ENCARGADO_CO;
    }
}
