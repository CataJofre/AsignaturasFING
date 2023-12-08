package com.fing.asignaturas.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "carrera")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carrera {
    @Id
    @Column(unique = true, nullable = false)
private Long codigo_carrera;
    private String nombre_carrera;

}
