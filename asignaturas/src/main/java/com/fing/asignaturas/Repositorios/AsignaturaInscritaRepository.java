package com.fing.asignaturas.Repositorios;

import com.fing.asignaturas.Entidades.AsignaturaInscrita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaInscritaRepository extends JpaRepository<AsignaturaInscrita, Long> {
}
