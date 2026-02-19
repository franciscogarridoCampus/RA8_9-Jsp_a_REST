package com.franciscogarrido.gestionra.service;

import com.franciscogarrido.gestionra.model.Asignatura;
import com.franciscogarrido.gestionra.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AsignaturaService {
    @Autowired
    private AsignaturaRepository repository;

    public List<Asignatura> listar() { return repository.findAll(); }
    public Asignatura guardar(Asignatura a) { return repository.save(a); }
    public void eliminar(int id) { repository.deleteById(id); }
}