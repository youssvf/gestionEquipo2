package com.example.gestionEquipo.jugador.domain;

import java.util.Date;

public class Jugador {
    private String dni, nombre, apellidos;
    private Date fechaNac;
    private Integer resistencia, velocidad, recuperacion;

    public Jugador(String dni, String nombre, String apellidos, Date fechaNac, Integer resistencia, Integer velocidad, Integer recuperacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
        this.recuperacion = recuperacion;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public Integer getRecuperacion() {
        return recuperacion;
    }
}
