package BiblioUni.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "estudiantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Estudiante extends Usuario {

    private String carrera;

    private Integer semestre;

    private Integer maxPrestamos = 3;
}