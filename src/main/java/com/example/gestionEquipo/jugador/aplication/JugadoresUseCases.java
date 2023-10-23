package com.example.gestionEquipo.jugador.aplication;

import com.example.gestionEquipo.jugador.domain.Jugador;
import com.example.gestionEquipo.jugador.domain.JugadoresRepository;

import java.util.List;

public class JugadoresUseCases {
    private final JugadoresRepository jugadoresRepository;
    public JugadoresUseCases(JugadoresRepository jugadoresRepository){
        this.jugadoresRepository = jugadoresRepository;
    }

    public List<Jugador> getAll(){
        return this.jugadoresRepository.getAll();
    }
    public Jugador getByDNI(String dni){
        return this.jugadoresRepository.getByDNI(dni);
    }
    public Jugador agregarJugador(Jugador jugador){
        return this.jugadoresRepository.agregarJugador(jugador);
    }

    public Jugador actualizarJugador(String dni, Jugador jnuevo){
        Jugador viejo = this.jugadoresRepository.getByDNI(dni);
        Jugador nuevo = new Jugador(jnuevo.getDni(),jnuevo.getNombre(),jnuevo.getApellidos(),jnuevo.getFechaNac(),jnuevo.getResistencia(),jnuevo.getVelocidad(),jnuevo.getRecuperacion());

        return this.jugadoresRepository.actualizarJugador(dni,nuevo);
    }
}
