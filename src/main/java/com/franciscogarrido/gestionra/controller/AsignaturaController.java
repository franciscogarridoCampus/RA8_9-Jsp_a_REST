package com.franciscogarrido.gestionra.controller;

import com.franciscogarrido.gestionra.model.Asignatura;
import com.franciscogarrido.gestionra.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/asignaturas")
@CrossOrigin(origins = "*")
public class AsignaturaController {

    @Autowired
    private AsignaturaService service;

    @GetMapping
    public List<Asignatura> listar() {
        return service.listar();
    }

    @PostMapping
    public Asignatura guardar(@RequestBody Asignatura a) {
        return service.guardar(a);
    }

    @PutMapping("/{id}")
    public Asignatura actualizar(@PathVariable int id, @RequestBody Asignatura a) {
        a.setId(id); // Aseguramos que actualice el ID correcto
        return service.guardar(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}