package cl.ong.mascotas.endpoint;

import cl.ong.mascotas.endpoint.model.Mascota;
import cl.ong.mascotas.repository.model.CommonResponse;
import cl.ong.mascotas.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MascotaController {
    @Autowired
    private MascotaService mascotaService;

    @GetMapping("/mascotas")
    public ResponseEntity<GetMascotasResponse> get(){
        GetMascotasResponse response = new GetMascotasResponse();
        response.setMascotas(mascotaService.getAllMascotas());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/mascotas/{id}")
    public ResponseEntity<GetMascotaResponse> get(@PathVariable int id){
        Mascota foundMascota = mascotaService.findMascotaById(id);

        if(foundMascota != null){
            GetMascotaResponse response = new GetMascotaResponse();
            response.setMascota(foundMascota);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/mascotas/{id}")
    public CommonResponse delete(@PathVariable int id){
        return mascotaService.deleteMascotaById(id);
    }

    @PostMapping("/mascotas")
    public CommonResponse post(@RequestBody Mascota aMascota){
        return mascotaService.addMascota(aMascota);

    }

    @PutMapping("/mascotas/{id}")
    public ResponseEntity<GetMascotaResponse> put(@PathVariable("id") int id, @RequestBody Mascota aMascota){
        Mascota updated = mascotaService.updateMascotaById(id, aMascota);
        if (updated != null) {
            GetMascotaResponse response = new GetMascotaResponse();
            response.setMascota(updated);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
