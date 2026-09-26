package main.java.app.service;

import main.java.app.domain.Administrador;
import main.java.app.domain.Restaurante;
import main.java.app.repository.RestauranteRepository;

import java.util.List;

public class AdministradorService {

    private Administrador administrador;
    private RestauranteRepository restauranteRepository;

    // Constructor
    public AdministradorService(Administrador administrador,
                                RestauranteRepository restauranteRepository) {

        this.administrador = administrador;
        this.restauranteRepository = restauranteRepository;
    }

    // Registrar un restaurante
    public void registrarRestaurante(Restaurante restaurante) {

        if (restaurante == null) {
            System.out.println("El restaurante no puede ser nulo.");
            return;
        }

        restauranteRepository.guardar(restaurante);

        System.out.println(
                "Restaurante registrado por: " + administrador.getNombre()
        );
    }

    // Consultar un restaurante
    public Restaurante consultarRestaurante(int id) {
        return restauranteRepository.buscarPorId(id);
    }

    // Listar todos los restaurantes
    public List<Restaurante> listarRestaurantes() {
        return restauranteRepository.listar();
    }

    // Actualizar un restaurante
    public void actualizarRestaurante(Restaurante restaurante) {

        if (restaurante == null) {
            System.out.println("El restaurante no puede ser nulo.");
            return;
        }

        restauranteRepository.actualizar(restaurante);
    }

    // Eliminar un restaurante
    public void eliminarRestaurante(int id) {
        restauranteRepository.eliminar(id);
    }
}
