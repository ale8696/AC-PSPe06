package salesianos.dam.e06_2.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
@Getter @Setter
public class Profesor {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, email;
    private double puntuacion;

    @OneToMany
    private CursoOnline curso;

}
