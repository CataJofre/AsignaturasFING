package com.fing.asignaturas.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prerrequisitos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prerrequisitos {
    @Id
    @Column(unique = true, nullable = false)
    private Long id_prerrequisito;
    @ManyToOne
    @JoinColumn(name = "codigo_asignatura")
    private Asignatura codigo_asignatura;
    private Long codigo_prerrequisito;
}
