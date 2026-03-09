package BiblioUni.Service;

import BiblioUni.Model.Libro;
import BiblioUni.Repository.LibroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class LibroServiceImpl implements LibroService {

    private final LibroRepository libroRepository;

    @Override
    public Collection<Libro> listarTodo() {
        return (Collection<Libro>) libroRepository.findAll();
    }

    @Override
    public Libro buscarPorId(String isbn) {
        return libroRepository.findById(isbn).orElse(null);
    }

    @Override
    public Libro insertar(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro actualizar(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public void eliminar(String isbn) {
        libroRepository.deleteById(isbn);
    }

}
