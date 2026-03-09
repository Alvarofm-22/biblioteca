package BiblioUni.Service;

import BiblioUni.Model.Prestamo;

import java.util.Collection;
import java.util.List;

public interface PrestamoService {

    Prestamo registrarPrestamo(Long usuarioId, String isbn);

    Collection<Prestamo> listarPrestamos();

    Prestamo buscarPrestamo(Long id);
}