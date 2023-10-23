package com.example.gestionEquipo;

import com.example.gestionEquipo.jugador.aplication.JugadoresUseCases;
import com.example.gestionEquipo.jugador.domain.Jugador;
import com.example.gestionEquipo.jugador.infrastructure.JugadoresRepositorySQL;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

public class JugadoresUseCasesSQLTests {
    JugadoresUseCases jugadoresUseCases;

    public JugadoresUseCasesSQLTests(){
        this.jugadoresUseCases = new JugadoresUseCases(new JugadoresRepositorySQL());
    }

    @Test
    void getAll(){
        List<Jugador> jugadores = this.jugadoresUseCases.getAll();
        assertEquals(4,jugadores.size());
    }

    @Test
    void getByDNI(){
        String dni = "123456789";
        Jugador jugador = this.jugadoresUseCases.getByDNI(dni);
        assertEquals(jugador.getDni(),dni);
    }
}
