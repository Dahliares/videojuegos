package es.saraland.videojuegos.entities;


import lombok.Data;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Data
@Table(name="juegos")
public class Videojuego implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nombre;
    @Column(length = 50)
    private String consola;
    @Column(length = 50)
    private String tipo;

    @Column(length = 50)
    private String saga;

    @Column(length = 50)
    private String formato;

    @Column(length = 50)
    private String idioma;

    @Column(length = 50)
    private String estado;

    @Column(length = 50)
    private String compania;

    @Column(length = 100)
    private String comentarios;




}
