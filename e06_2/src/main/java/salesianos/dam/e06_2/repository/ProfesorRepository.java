package salesianos.dam.e06_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salesianos.dam.e06_2.model.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
