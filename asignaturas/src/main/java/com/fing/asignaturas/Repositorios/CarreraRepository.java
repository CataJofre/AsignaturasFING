package com.fing.asignaturas.Repositorios;

import com.fing.asignaturas.Entidades.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {
}
