package com.franciscogarrido.gestionra.service;

import com.franciscogarrido.gestionra.model.Resultado;
import com.franciscogarrido.gestionra.repository.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResultadoService {
    @Autowired
    private ResultadoRepository repository;

    public List<Resultado> listar() { return repository.findAll(); }
    public Resultado guardar(Resultado r) { return repository.save(r); }
    public void eliminar(int id) { repository.deleteById(id); }
}