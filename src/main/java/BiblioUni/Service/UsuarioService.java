package BiblioUni.Service;

import BiblioUni.Model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario registrar(Usuario usuario);

    List<Usuario> listar();

    Usuario buscarPorId(Long id);

    Usuario actualizar(Usuario usuario);

    void eliminar(Long id);

}