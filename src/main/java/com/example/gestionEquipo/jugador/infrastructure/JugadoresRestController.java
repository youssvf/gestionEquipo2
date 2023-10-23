package com.example.gestionEquipo.jugador.infrastructure;

import com.example.gestionEquipo.jugador.aplication.JugadoresUseCases;
import com.example.gestionEquipo.jugador.domain.Jugador;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class JugadoresRestController {
    private JugadoresUseCases jugadoresUseCases;

    public JugadoresRestController(){
        this.jugadoresUseCases = new JugadoresUseCases(new JugadoresRepositorySQL());
    }

    @GetMapping("/api/jugadores")
    public List<Jugador> getAll(){
        List<Jugador> jugadores = this.jugadoresUseCases.getAll();
        return jugadores;
    }

    @GetMapping("/api/jugadores/{dni}")
    public Jugador getByDNI(@PathVariable String dni){
        Jugador jugador = this.jugadoresUseCases.getByDNI(dni);
        return jugador;
    }

    @PostMapping(path ="/api/jugadores", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Jugador agregarJugador(@RequestBody Jugador jugador){
        this.jugadoresUseCases.agregarJugador(jugador);
        return jugador;
    }
}
