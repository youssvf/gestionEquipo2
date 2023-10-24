package com.example.gestionEquipo.ejercicio.aplication;

import com.example.gestionEquipo.ejercicio.domain.Ejercicio;
import com.example.gestionEquipo.ejercicio.domain.EjerciciosRepository;

import java.util.List;

public class EjerciciosUseCases {
    private final EjerciciosRepository ejerciciosRepository;

    public EjerciciosUseCases(EjerciciosRepository ejerciciosRepository){
        this.ejerciciosRepository = ejerciciosRepository;
    }

    public List<Ejercicio> getAll(){
        return this.ejerciciosRepository.getAll();
    }

    public Ejercicio getEjercicio(Integer id){
        return this.ejerciciosRepository.getEjercicio(id);
    }

    public Ejercicio save(Ejercicio ejercicio){
        return this.ejerciciosRepository.save(ejercicio);
    }
}
