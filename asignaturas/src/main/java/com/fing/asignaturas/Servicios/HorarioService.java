package com.fing.asignaturas.Servicios;

import com.fing.asignaturas.Entidades.Asignatura;
import com.fing.asignaturas.Entidades.Horario;
import com.fing.asignaturas.Repositorios.AsignaturaRepository;
import com.fing.asignaturas.Repositorios.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioService {
    @Autowired
    HorarioRepository horarioRepository;
    @Autowired
    AsignaturaRepository asignaturaRepository;

    public List<Horario> getAllHorarios() {
        return horarioRepository.findAll();
    }
    /*
    public List<Horario> buscarHorarioPorCodigoAsignatura(Long codigoAsignatura) {
        return horarioRepository.findByCodigoAsignatura(codigoAsignatura);
    }*/

    public void crearHorario(Long codigo_asignatura, int cantidad, List<String> horarios)
    {
        Asignatura asignatura = asignaturaRepository.findByCodigo(codigo_asignatura);
        for (int i = 0; i < cantidad ; i++) {
            Horario horario = new Horario();
            horario.setCodigo_asignatura(asignatura);
            horario.setHorario(horarios.get(i));
            horarioRepository.save(horario);
        }
    }
}
