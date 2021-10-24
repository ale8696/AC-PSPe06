package salesianos.dam.e06_2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import salesianos.dam.e06_2.model.CursoOnline;
import salesianos.dam.e06_2.model.Profesor;
import salesianos.dam.e06_2.model.Video;
import salesianos.dam.e06_2.service.CursoOnlineService;
import salesianos.dam.e06_2.service.ProfesorService;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final CursoOnlineService cursoOnlineService;
    private final ProfesorService profesorService;

    @PostConstruct
    public void test() {

        CursoOnline curso1 = CursoOnline.builder()
                .nombre("DAM")
                .puntuacion(8.5)
                .build();

        Profesor profesor1 = Profesor.builder()
                .nombre("Luismi")
                .email("luismi@salesianos.edu")
                .puntuacion(10)
                .curso(curso1)
                .build();

        Video video1 = Video.builder()
                .orden(1)
                .titulo("Introduccion a Java")
                .descripcion("En este video Os introduciremos a las bases de uno de los lenguajes de programación mas populares")
                .url("https://www.youtube.com/kjbasdfpq1")
                .build();

    }

}
