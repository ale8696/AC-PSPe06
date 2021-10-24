import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import salesianos.dam.e06.model.CatAlimentacion;
import salesianos.dam.e06.model.Categoria;
import salesianos.dam.e06.model.Producto;
import salesianos.dam.e06.service.CategoriaService;
import salesianos.dam.e06.service.ProductoService;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ProductoService productoService;
    private final CategoriaService categoriaService;

    @PostConstruct
    public void Test() {

        Categoria categoria1 = Categoria.builder()
                .nombre("Ferreteria")
                .build();

        CatAlimentacion italiana = new CatAlimentacion("Alimentacion", "Comida italiana");

        Producto producto = Producto.builder()
                .nombre("Espaguetis Boloñesa")
                .pvp(3.45)
                .categoria(italiana)
                .build();

    }

}
