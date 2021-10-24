package salesianos.dam.e06.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salesianos.dam.e06.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
