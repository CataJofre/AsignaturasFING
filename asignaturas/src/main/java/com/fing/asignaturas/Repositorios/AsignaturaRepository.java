package com.fing.asignaturas.Repositorios;

import com.fing.asignaturas.Entidades.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
    @Query("SELECT a FROM Asignatura a WHERE a.codigo_asignatura = :codigo_asignatura")
    Asignatura findByCodigo(Long codigo_asignatura);
    @Query("SELECT a FROM Asignatura a WHERE a.codigo_carrera.codigo_carrera = :codigo_carrera")
    List<Asignatura> findByCodigoCarreraCodigoCarrera(@Param("codigo_carrera") Long codigo_carrera);

}
