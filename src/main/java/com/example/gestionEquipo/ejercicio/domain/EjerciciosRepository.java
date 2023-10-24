package com.example.gestionEquipo.ejercicio.domain;

import java.util.List;

public interface EjerciciosRepository {
    public List<Ejercicio> getAll();
    public Ejercicio getEjercicio(Integer id);
    public Ejercicio save(Ejercicio ejercicio);
}
