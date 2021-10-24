package salesianos.dam.e06.model;

import lombok.*;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Getter @Setter
public class CatAlimentacion extends Categoria{

    private String tipo;

    public CatAlimentacion(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

}
