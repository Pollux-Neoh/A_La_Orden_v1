package main.java.app.service.Outputports;

import main.java.app.domain.Empleado;
import main.java.app.domain.enums.Turno;

public interface EmpleadoServiceContract {

    Empleado registrarEmpleado(String nombre, String correo, String contraseña,
                               String telefono, boolean estado, Turno turno);

    void actualizarEmpleado(Empleado empleado);

    void eliminarEmpleado(int id);
}
