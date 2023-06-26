package cl.ong.mascotas.service;

import cl.ong.mascotas.endpoint.model.Mascota;
import cl.ong.mascotas.repository.MascotaRepository;
import cl.ong.mascotas.repository.model.MascotaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MascotaService {
    @Autowired
    private MascotaRepository mascotaRepository;
    public List<Mascota> getAllMascotas(){
        List<Mascota> finalMascotas = new ArrayList<>();
        List<MascotaEntity> mascotas = (List<MascotaEntity>)mascotaRepository.findAll();
        for (MascotaEntity entity: mascotas){
            Mascota mascota = new Mascota();
            mascota.setId(entity.getId());
            mascota.setNombre(entity.getNombre());
            mascota.setGenero(entity.getGenero());
            mascota.setEsteril(entity.get());
            mascota.setTipo(entity.get());
            finalMascotas.add(mascota);
        }
        return finalMascotas;
    }

    public Mascota findMascotaById(int id){
        Optional<MascotaEntity> foundMascota = mascotaRepository.findById(id);
        boolean isFound = foundMascota.isPresent();
        if(isFound){
            MascotaEntity dbMascota = foundMascota.get();
            Mascota mascota = new Mascota();
            mascota.setId(dbMascota.getId());
            mascota.setNombre(dbMascota.getNombre());
            mascota.setGenero(dbMascota.getGenero());
            mascota.setEsteril(dbMascota.get());
            mascota.setTipo(dbMascota.get());
            return mascota;
        }
        else {
            return null;
        }
    }
}
