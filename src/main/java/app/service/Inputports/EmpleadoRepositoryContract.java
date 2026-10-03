package main.java.app.service.Inputports;

import main.java.app.domain.Empleado;

import java.util.List;

public interface EmpleadoRepositoryContract {

    void guardar(Empleado empleado);

    Empleado buscarPorId(int id);

    List<Empleado> listar();

    void actualizar(Empleado empleado);

    void eliminar(int id);
}
