package cl.ong.mascotas.repository.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;


@Entity
@Table(name="mascotas")
@Getter
@Setter
public class MascotaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 6)
    private String nombre;
    @Column(nullable = false, length = 30)
    private String genero;
    @Column(nullable = false, length = 30)
    private String esteril;
    @Column(nullable = false, length = 10)
    private String tipo;

}
