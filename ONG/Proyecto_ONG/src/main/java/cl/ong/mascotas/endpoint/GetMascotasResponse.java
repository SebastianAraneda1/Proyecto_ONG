package cl.ong.mascotas.endpoint;

import cl.ong.mascotas.endpoint.model.Mascota;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetMascotasResponse {
    private List<Mascota> mascotas;
}
