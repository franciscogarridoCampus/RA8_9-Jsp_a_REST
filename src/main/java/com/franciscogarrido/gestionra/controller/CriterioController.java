package com.franciscogarrido.gestionra.controller;

import com.franciscogarrido.gestionra.model.Criterio;
import com.franciscogarrido.gestionra.service.CriterioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/criterios")
@CrossOrigin(origins = "*")
public class CriterioController {

    @Autowired
    private CriterioService service;

    @GetMapping
    public List<Criterio> listar() {
        return service.listar();
    }

    @PostMapping
    public Criterio guardar(@RequestBody Criterio c) {
        return service.guardar(c);
    }

    @PutMapping("/{id}")
    public Criterio actualizar(@PathVariable int id, @RequestBody Criterio c) {
        c.setId(id);
        return service.guardar(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}