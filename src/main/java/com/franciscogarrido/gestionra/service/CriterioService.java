package com.franciscogarrido.gestionra.service;

import com.franciscogarrido.gestionra.model.Criterio;
import com.franciscogarrido.gestionra.repository.CriterioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CriterioService {
    @Autowired
    private CriterioRepository repository;

    public List<Criterio> listar() { return repository.findAll(); }
    public Criterio guardar(Criterio c) { return repository.save(c); }
    public void eliminar(int id) { repository.deleteById(id); }
}