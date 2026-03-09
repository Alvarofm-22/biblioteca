package BiblioUni.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "libros")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Libro {

    @Id
    private String isbn;

    private String titulo;

    private String autor;

    private String editorial;

    private Integer cantDisponible;

    @OneToMany(mappedBy = "libro")
    private List<Prestamo> prestamos;
}