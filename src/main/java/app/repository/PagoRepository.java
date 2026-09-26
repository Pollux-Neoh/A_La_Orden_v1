package main.java.app.repository;

import main.java.app.domain.Pago;

import java.util.ArrayList;
import java.util.List;


public class PagoRepository {
    private List<Pago> pagos;

    // ID asignado al sgt pago
    private int siguienteId;

    public PagoRepository() {
        pagos = new ArrayList<>();
        siguienteId = 1;
    }
    // Guardar un pago
    public void guardar(Pago pago) {

        // Si el pago no tiene ID, se le asigna automáticamente
        if (pago.getId() == 0) {
            pago.setId(siguienteId);
            siguienteId++;
        }

        pagos.add(pago);
    }

    // Buscar un pago por ID
    public Pago buscarPorId(int id) {

        for (Pago pago : pagos) {

            if (pago.getId() == id) {
                return pago;
            }
        }

        return null;
    }
    // Listar todos los pagos
    public List<Pago> listar() {
        return pagos;
    }

    // Eliminar un pago
    public void eliminar(int id) {

        Pago pago = buscarPorId(id);

        if (pago != null) {
            pagos.remove(pago);
        }
    }
}
