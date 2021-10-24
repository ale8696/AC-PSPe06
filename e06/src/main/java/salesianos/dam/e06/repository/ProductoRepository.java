package salesianos.dam.e06.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salesianos.dam.e06.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
