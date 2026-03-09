package BiblioUni.Service;

import BiblioUni.Model.Libro;

import java.util.Collection;

public interface LibroService {

    public abstract Collection<Libro> listarTodo();

    public abstract Libro buscarPorId(String isbn);

    public abstract Libro insertar(Libro libro);

    public abstract Libro actualizar(Libro libro);

    public abstract void eliminar(String isbn);

}
