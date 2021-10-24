package salesianos.dam.e06_2.service;

import org.springframework.stereotype.Service;
import salesianos.dam.e06_2.model.Profesor;
import salesianos.dam.e06_2.repository.ProfesorRepository;
import salesianos.dam.e06_2.service.base.BaseService;

@Service
public class ProfesorService extends BaseService<Profesor, Long, ProfesorRepository> {
}
