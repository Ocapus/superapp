package com.acme.superapp.dom;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;

    @Column(name = "creado_en")
    private Instant creadoEn = Instant.now();

    /* getters y setters / records más adelante */
}