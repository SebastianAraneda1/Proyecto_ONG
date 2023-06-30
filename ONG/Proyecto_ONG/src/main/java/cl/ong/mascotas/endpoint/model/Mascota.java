package cl.ong.mascotas.endpoint.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mascota {
    private int id;
    private int nroChip;
    private int edad;
    private String nombre;
    private String genero;
    private String esteril;
    private String tipo;
}
