package com.franciscogarrido.gestionra.model;

import jakarta.persistence.*;

@Entity
@Table(name = "criterios_evaluacion")
public class Criterio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "ra_id")
    private Resultado resultado;

    public Criterio() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Resultado getResultado() { return resultado; }
    public void setResultado(Resultado resultado) { this.resultado = resultado; }
}