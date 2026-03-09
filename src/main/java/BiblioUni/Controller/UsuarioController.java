package BiblioUni.Controller;

import BiblioUni.Model.Usuario;
import BiblioUni.Service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.listar();
    }

    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Long id){
        return usuarioService.buscarPorId(id);
    }

    @PostMapping
    public Usuario registrar(@RequestBody Usuario usuario){
        return usuarioService.registrar(usuario);
    }

    @PutMapping
    public Usuario actualizar(@RequestBody Usuario usuario){
        return usuarioService.actualizar(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        usuarioService.eliminar(id);
    }
}