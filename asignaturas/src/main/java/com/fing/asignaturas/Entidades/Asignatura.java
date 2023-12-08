package com.fing.asignaturas.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "asignatura")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asignatura {

    @Id
    @Column(unique = true, nullable = false)
    private Long codigo_asignatura;
    @ManyToOne
    @JoinColumn(name = "codigo_carrera")
    private Carrera codigo_carrera;
    private String nombre_asignatura;
    private String codigo_plan;
    private int nivel;
    private int cupo;
    private int cantidad_estudiantes;
}
