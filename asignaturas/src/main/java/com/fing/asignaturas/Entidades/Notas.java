package com.fing.asignaturas.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "notas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notas {
    @Id
    @Column(unique = true, nullable = false)
    private Long id_nota;
    @ManyToOne
    @JoinColumn(name = "codigo_asignatura")
    private Asignatura codigo_asignatura;
    @ManyToOne
    @JoinColumn(name = "rut")
    private Estudiante rut;
    private float nota;
    private Long semestre;
    private Long anio;
}
