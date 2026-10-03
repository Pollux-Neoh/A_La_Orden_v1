package main.java.app.service.Outputports;

import main.java.app.domain.Restaurante;

import java.util.List;

public interface RestauranteServiceContract {

    void registrarRestaurante(Restaurante restaurante);

    Restaurante consultarRestaurante(int id);

    List<Restaurante> listarRestaurantes();

    void actualizarRestaurante(Restaurante restaurante);

    void eliminarRestaurante(int id);
}
