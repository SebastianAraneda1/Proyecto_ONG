package cl.ong.mascotas.endpoint.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mascota {
    private int id;
    private String nombre;
    private String genero;
    private String esteril;
    private String tipo;
}
