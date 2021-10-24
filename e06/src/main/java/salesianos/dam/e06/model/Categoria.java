package salesianos.dam.e06.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
@Getter @Setter
public class Categoria implements Serializable {

    @Id
    @GeneratedValue
    protected Long id;

    protected String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }
}
