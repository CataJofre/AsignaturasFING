package com.fing.asignaturas.Repositorios;

import com.fing.asignaturas.Entidades.Notas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotasRepository extends JpaRepository<Notas, Long> {
}
