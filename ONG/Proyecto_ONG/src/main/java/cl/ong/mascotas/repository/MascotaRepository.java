package cl.ong.mascotas.repository;

import cl.ong.mascotas.repository.model.MascotaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository
        extends CrudRepository<MascotaEntity, Integer> {
}
