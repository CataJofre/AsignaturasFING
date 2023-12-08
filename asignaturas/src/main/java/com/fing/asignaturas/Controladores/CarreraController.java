package com.fing.asignaturas.Controladores;

import com.fing.asignaturas.Entidades.Asignatura;
import com.fing.asignaturas.Entidades.Carrera;
import com.fing.asignaturas.Repositorios.CarreraRepository;
import com.fing.asignaturas.Servicios.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/informacion")
public class CarreraController {
    @Autowired
    private CarreraService carreraService;

    @GetMapping("/carrera/{codigoCarrera}/asignaturas")
    public ResponseEntity<List<Asignatura>> getAsignaturasPorCodigoCarrera(@PathVariable Long codigoCarrera) {
        List<Asignatura> asignaturas = carreraService.getAsignaturasPorCodigoCarrera(codigoCarrera);

        if (asignaturas != null && !asignaturas.isEmpty()) {
            return new ResponseEntity<>(asignaturas, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
