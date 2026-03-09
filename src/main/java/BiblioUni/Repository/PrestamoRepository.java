package BiblioUni.Repository;


import BiblioUni.Enum.EstadoPrestamo;
import BiblioUni.Model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

    long countByUsuarioIdAndEstado(Long usuarioId, EstadoPrestamo estado);

}