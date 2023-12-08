package com.fing.asignaturas.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estudiante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    @Id
    @Column(unique = true, nullable = false)
    private String rut;
    @ManyToOne
    @JoinColumn(name = "codigo_carrera")
    private Carrera codigo_carrera;
    private String nombres;
    private String apellidos;
    private String email;
    private int cantidad_asignaturas;
    private String nivel;
    private String estado;
}
