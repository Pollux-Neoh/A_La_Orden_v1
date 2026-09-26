package main.java.app.repository;

import main.java.app.domain.Empleado;

import java.util.ArrayList;
import java.util.List;


public class EmpleadoRepository {

    private List<Empleado> empleados;

    //ID QUE SE ASIGA AL SGT EMPLEADO
    private int siguienteId;

    public EmpleadoRepository() {
        empleados = new ArrayList<>();
        siguienteId = 000;

    }

    //GUARDAR EMPLEADO
    public void guardar(Empleado empleado) {

        //SI EL EMPLEADO NO TIENE ID SE LE ADIGNA UNO
        if (empleado.getId() == 0) {
            empleado.setId(siguienteId);
            siguienteId++;
        }

        empleados.add(empleado);

    }

    //BUSCAR EMPLEADO POR ID
    public Empleado buscarPorId(int id) {
        for (Empleado empleado : empleados) {

            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }

    //LISTAR TODOS LOS EMPLEADOS
    public List<Empleado> listar() {
        return empleados;
    }

    //ACTUALIZAR EMPLEADO
    public void actualizar(Empleado empleado) {

        Empleado empleadoExistente = buscarPorId(empleado.getId());

        if (empleadoExistente != null) {
            empleados.remove(empleadoExistente);
            empleados.add(empleado);
        }

    }

    //ELIMINAR EMPLEADO
    public void eliminar(int id) {

        Empleado empleado = buscarPorId(id);

        if (empleado != null) {
            empleados.remove(empleado);
        }
    }


}
