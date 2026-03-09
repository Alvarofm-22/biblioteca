package BiblioUni.Controller;

import BiblioUni.Model.Libro;
import BiblioUni.Service.LibroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libros")
@RequiredArgsConstructor
public class LibroController {

    private final LibroService libroService;

    @GetMapping("/{isbn}")
    public Libro buscar(@PathVariable String isbn){
        return libroService.buscarPorId(isbn);
    }

    @PostMapping
    public Libro insertar(@RequestBody Libro libro){
        return libroService.insertar(libro);
    }

    @PutMapping
    public Libro actualizar(@RequestBody Libro libro){
        return libroService.actualizar(libro);
    }

    @DeleteMapping("/{isbn}")
    public void eliminar(@PathVariable String isbn){
        libroService.eliminar(isbn);
    }

}
