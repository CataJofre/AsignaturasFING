package com.fing.asignaturas.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "horario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)
    private Long id_horario;
    @ManyToOne
    @JoinColumn(name = "codigo_asignatura")
    private Asignatura codigo_asignatura;
    private String horario;
}
