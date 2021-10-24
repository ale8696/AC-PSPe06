package salesianos.dam.e06.service;

import org.springframework.stereotype.Service;
import salesianos.dam.e06.model.Producto;
import salesianos.dam.e06.repository.ProductoRepository;
import salesianos.dam.e06.service.base.BaseService;

@Service
public class ProductoService extends BaseService<Producto, Long, ProductoRepository> {
}
