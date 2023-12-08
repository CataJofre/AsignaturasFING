package com.fing.asignaturas.Repositorios;

import com.fing.asignaturas.Entidades.Prerrequisitos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrerrequisitosRepository extends JpaRepository<Prerrequisitos, Long> {
}
