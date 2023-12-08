package com.fing.asignaturas.Servicios;

import com.fing.asignaturas.Entidades.Asignatura;
import com.fing.asignaturas.Repositorios.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignaturaService {
    @Autowired
    AsignaturaRepository asignaturaRepository;

    public Asignatura getAsignaturaByCodigo(Long codigo_asignatura) {
        return asignaturaRepository.findByCodigo(codigo_asignatura);
    }



}
