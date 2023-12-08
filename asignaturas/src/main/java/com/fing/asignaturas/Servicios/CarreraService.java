package com.fing.asignaturas.Servicios;

import com.fing.asignaturas.Entidades.Asignatura;
import com.fing.asignaturas.Entidades.Carrera;
import com.fing.asignaturas.Repositorios.AsignaturaRepository;
import com.fing.asignaturas.Repositorios.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraService {
    @Autowired
    private CarreraRepository carreraRepository;

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    public List<Asignatura> getAsignaturasPorCodigoCarrera(Long codigoCarrera) {
        Carrera carrera = carreraRepository.findById(codigoCarrera).orElse(null);

        if (carrera != null) {
            return asignaturaRepository.findByCodigoCarreraCodigoCarrera(codigoCarrera);
        } else {
            // Manejo de carrera no encontrada
            return null; // o lanza una excepción, según tu lógica
        }
    }

}
