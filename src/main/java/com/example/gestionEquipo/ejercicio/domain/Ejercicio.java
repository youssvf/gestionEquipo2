package com.example.gestionEquipo.ejercicio.domain;

import com.example.gestionEquipo.etiqueta.Etiqueta;
import com.example.gestionEquipo.material.Material;
import com.example.gestionEquipo.recurso.Recurso;

import java.util.List;

public class Ejercicio {
    private Integer id, duracion, resistencia, recuperacion, velocidad;
    private String titulo, descripcion;

    private List<Etiqueta> etiquetas;
    private List<Material> materiales;
    private List<Recurso> recursos;


    public Ejercicio(Integer id, Integer duracion, Integer resistencia, Integer recuperacion, Integer velocidad, String titulo, String descripcion, List<Etiqueta> etiquetas, List<Material> materiales, List<Recurso> recursos) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.etiquetas = etiquetas;
        this.materiales = materiales;
        this.recursos = recursos;
        this.resistencia = resistencia;
        this.recuperacion = recuperacion;
        this.velocidad = velocidad;
    }

    public Ejercicio(Integer id, String titulo){
        this.id = id;
        this.titulo = titulo;
    }



    public Integer getId() {
        return id;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public Integer getRecuperacion() {
        return recuperacion;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public List<Material> getMateriales() {
        return materiales;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }
}
