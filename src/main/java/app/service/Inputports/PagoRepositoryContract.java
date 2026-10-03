package main.java.app.service.Inputports;

import main.java.app.domain.Pago;

import java.util.List;

public interface PagoRepositoryContract {

    void guardar(Pago pago);

    Pago buscarPorId(int id);

    List<Pago> listar();

    void eliminar(int id);
}
