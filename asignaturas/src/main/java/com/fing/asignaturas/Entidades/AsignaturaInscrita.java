package com.fing.asignaturas.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "asignatura_inscrita")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsignaturaInscrita {
    @Id
    @Column(unique = true, nullable = false)
    private Long id_asignatura_inscrita;
    @OneToOne
    @JoinColumn(name = "codigo_asignatura")
    private Asignatura codigo_asignatura;
    @ManyToOne
    @JoinColumn(name = "rut")
    private Estudiante rut;
    private int veces_inscrita;
    private String estado;
}
