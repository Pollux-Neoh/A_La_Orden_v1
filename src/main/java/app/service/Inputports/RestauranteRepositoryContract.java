package main.java.app.service.Inputports;

import main.java.app.domain.Restaurante;

import java.util.List;

public interface RestauranteRepositoryContract {

    void guardar(Restaurante restaurante);

    Restaurante buscarPorId(int id);

    List<Restaurante> listar();

    void actualizar(Restaurante restaurante);

    void eliminar(int id);
}
