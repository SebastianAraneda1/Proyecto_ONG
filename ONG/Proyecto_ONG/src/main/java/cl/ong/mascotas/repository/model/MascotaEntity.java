package cl.ong.mascotas.repository.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="mascotas")
@Getter
@Setter
public class MascotaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 6, name = "patente")
    private String nombre;
    @Column(nullable = false, length = 30)
    private String genero;
    @Column(nullable = false, length = 30)
    private boolean esteril;
    @Column(nullable = false, length = 10)
    private boolean tipo;

}
