package main.java.app.service;

import main.java.app.domain.Empleado;
import main.java.app.domain.enums.Turno;
import main.java.app.repository.EmpleadoRepository;

public class EmpleadoService {

    private EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    //REGISTRAR EMPLEADO
    public Empleado registrarEmpleado(String nombre, String correo,
                                      String contraseña, String telefono,
                                      boolean estado, Turno turno) {
        Empleado empleado = new Empleado(nombre,correo,contraseña,telefono,estado,turno);

        empleadoRepository.guardar(empleado);

        return empleado;

    }

    //ACTUALIZAR EMPLEADO
    public void actualizarEmpleado(Empleado empleado) {
        empleadoRepository.actualizar(empleado);

    }

    //ELIMINAR EMPLEADO

    public void eliminarEmpleado(int id){
        empleadoRepository.eliminar(id);
    }






}
