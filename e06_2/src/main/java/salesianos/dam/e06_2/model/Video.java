package salesianos.dam.e06_2.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
@Getter @Setter
public class Video {

    @Id
    @GeneratedValue
    private Long id;

    private double orden;
    private String titulo, url;
    @Lob
    private String descripcion;

    @ManyToOne()
    private CursoOnline curso;

}
