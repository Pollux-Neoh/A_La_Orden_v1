package main.java.app.repository;

import main.java.app.domain.Restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RestauranteRepository {

    private final List<Restaurante> restaurantes;
    private int siguienteId;

    public RestauranteRepository() {
        this.restaurantes = new ArrayList<>();
        this.siguienteId = 1;
    }

    public void guardar(Restaurante restaurante) {
        Objects.requireNonNull(restaurante, "El restaurante no puede ser nulo.");

        if (restaurante.getId() <= 0) {
            restaurante.setId(siguienteId++);
        } else if (restaurante.getId() >= siguienteId) {
            siguienteId = restaurante.getId() + 1;
        }

        int indice = buscarIndicePorId(restaurante.getId());
        if (indice == -1) {
            restaurantes.add(restaurante);
        } else {
            restaurantes.set(indice, restaurante);
        }
    }

    public Restaurante buscarPorId(int id) {
        int indice = buscarIndicePorId(id);
        return indice == -1 ? null : restaurantes.get(indice);
    }

    public List<Restaurante> listar() {
        return new ArrayList<>(restaurantes);
    }

    public void actualizar(Restaurante restaurante) {
        Objects.requireNonNull(restaurante, "El restaurante no puede ser nulo.");

        int indice = buscarIndicePorId(restaurante.getId());
        if (indice != -1) {
            restaurantes.set(indice, restaurante);
        }
    }

    public void eliminar(int id) {
        int indice = buscarIndicePorId(id);
        if (indice != -1) {
            restaurantes.remove(indice);
        }
    }

    private int buscarIndicePorId(int id) {
        for (int i = 0; i < restaurantes.size(); i++) {
            if (restaurantes.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
