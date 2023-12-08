package com.fing.asignaturas.Controladores;

import com.fing.asignaturas.Entidades.Asignatura;
import com.fing.asignaturas.Servicios.AsignaturaService;
import com.fing.asignaturas.Servicios.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/informacion")
public class HorarioController {
    @Autowired
    HorarioService horarioService;
    @Autowired
    AsignaturaService asignaturaService;
/**/
    @PostMapping("/crear")
     public ResponseEntity<String> crearHorario(@RequestBody Map<String, Object> requestBody) {
        Long codigoAsignatura = Long.valueOf(requestBody.get("asignatura").toString());
        int cantidad = Integer.parseInt(requestBody.get("cantidad").toString());
        List<String> horarios = (List<String>) requestBody.get("horarios");
        Long asignatura = (long) Integer.parseInt(requestBody.get("asignatura").toString());
        // Llamada al servicio para crear los horarios
        horarioService.crearHorario(asignatura, cantidad, horarios);

        return ResponseEntity.ok("Horarios creados exitosamente");
    }

    }


