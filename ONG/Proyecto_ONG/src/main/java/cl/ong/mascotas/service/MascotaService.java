package cl.ong.mascotas.service;

import cl.ong.mascotas.endpoint.model.Mascota;
import cl.ong.mascotas.repository.MascotaRepository;
import cl.ong.mascotas.repository.model.CommonResponse;
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
            mascota.setEsteril(entity.getEsteril());
            mascota.setTipo(entity.getTipo());
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
            mascota.setEsteril(dbMascota.getEsteril());
            mascota.setTipo(dbMascota.getTipo());
            return mascota;
        }
        else {
            return null;
        }
    }

    public CommonResponse deleteMascotaById(int id) {
        CommonResponse response = new CommonResponse();
        try {
            Optional<MascotaEntity> foundMascota = mascotaRepository.findById(id);
            boolean isFound = foundMascota.isPresent();
            if ( !isFound ){
                response.setStatus("401");
                response.setMessage("Not Found");
                return response;
            }
            MascotaEntity dbMascota = foundMascota.get();
            mascotaRepository.delete(dbMascota);
            response.setStatus("200");
            response.setMessage("OK");
            return response;

        }
        catch (Exception e){
            response.setStatus("500");
            response.setMessage(e.getMessage());
            return response;
        }

    }

    public CommonResponse addMascota(Mascota aMascota) {
        CommonResponse response = new CommonResponse();
        try {
            MascotaEntity newMascota = new MascotaEntity();
            newMascota.setNro_Chip(aMascota.getNro_Chip());
            newMascota.setEdad(aMascota.getEdad());
            newMascota.setNombre(aMascota.getNombre());
            newMascota.setGenero(aMascota.getGenero());
            newMascota.setEsteril(aMascota.getEsteril());
            newMascota.setTipo(aMascota.getTipo());
            mascotaRepository.save(newMascota);
            response.setMessage("OK");
            response.setStatus("200");

        }catch ( Exception e ){
            response.setMessage("NoOK");
            response.setStatus("500");
        }
        return response;
    }

    public Mascota updateMascotaById(int id, Mascota aMascota) {
        Optional<MascotaEntity> foundMascota = mascotaRepository.findById(id);
        boolean isFound = foundMascota.isPresent();
        if(isFound){
            MascotaEntity mascota = foundMascota.get();
            mascota.setNombre(aMascota.getNombre());
            mascota.setGenero(aMascota.getGenero());
            mascota.setEsteril(aMascota.getEsteril());
            mascota.setTipo(aMascota.getTipo());
            mascotaRepository.save(mascota);
            return aMascota;
        }
        return null;
    }
}
