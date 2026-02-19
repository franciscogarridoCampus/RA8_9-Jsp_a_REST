package com.franciscogarrido.gestionra.controller;

import com.franciscogarrido.gestionra.model.Resultado;
import com.franciscogarrido.gestionra.service.ResultadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/resultados")
@CrossOrigin(origins = "*")
public class ResultadoController {

    @Autowired
    private ResultadoService service;

    @GetMapping
    public List<Resultado> listar() {
        return service.listar();
    }

    @PostMapping
    public Resultado guardar(@RequestBody Resultado r) {
        return service.guardar(r);
    }

    @PutMapping("/{id}")
    public Resultado actualizar(@PathVariable int id, @RequestBody Resultado r) {
        r.setId(id);
        return service.guardar(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}