package cl.ong.mascotas.endpoint;

import cl.ong.mascotas.endpoint.model.Mascota;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetMascotaResponse {
    private Mascota mascota;
}
