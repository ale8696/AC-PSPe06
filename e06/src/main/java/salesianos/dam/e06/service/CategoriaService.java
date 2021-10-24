package salesianos.dam.e06.service;

import org.springframework.stereotype.Service;
import salesianos.dam.e06.model.Categoria;
import salesianos.dam.e06.repository.CategoriaRepository;
import salesianos.dam.e06.service.base.BaseService;

@Service
public class CategoriaService extends BaseService<Categoria, Long, CategoriaRepository> {
}
