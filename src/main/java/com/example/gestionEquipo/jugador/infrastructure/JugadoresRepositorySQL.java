package com.example.gestionEquipo.jugador.infrastructure;

import com.example.gestionEquipo.DBConnection;
import com.example.gestionEquipo.jugador.domain.Jugador;
import com.example.gestionEquipo.jugador.domain.JugadoresRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class JugadoresRepositorySQL implements JugadoresRepository {
    public JugadoresRepositorySQL(){}

    public List<Jugador> getAll(){
        List<Jugador> jugadores = new ArrayList<>();

        try {
            Statement stmnt = DBConnection.getInstance().createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * FROM jugadores");
            while(rs.next()){
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                Date fechaNac = rs.getDate("fechaNac");
                Integer resistencia = rs.getInt("resistencia");
                Integer velocidad = rs.getInt("velocidad");
                Integer recuperacion = rs.getInt("recuperacion");

                jugadores.add(new Jugador(dni,nombre,apellidos,fechaNac,resistencia,velocidad,recuperacion));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        return jugadores;
    }

    @Override
    public Jugador getByDNI(String dni) {
        Jugador jugador = null;
        Statement stmnt = null;
        try {
            stmnt = DBConnection.getInstance().createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * FROM jugadores WHERE dni = '" + dni + "';");
            while (rs.next()){
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                Date fechaNac = rs.getDate("fechaNac");
                Integer resistencia = rs.getInt("resistencia");
                Integer velocidad = rs.getInt("velocidad");
                Integer recuperacion = rs.getInt("recuperacion");

                jugador = new Jugador(dni,nombre,apellidos,fechaNac,resistencia,velocidad,recuperacion);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        return jugador;
    }

    @Override
    public Jugador agregarJugador(Jugador jugador) {
        try {
            PreparedStatement stmnt = DBConnection.getInstance().prepareStatement("INSERT INTO jugadores(dni, nombre, apellidos, fechaNac, resistencia, recuperacion, velocidad) VALUES (?,?,?,?,?,?,?)");
            java.util.Date utilDate = jugador.getFechaNac();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            stmnt.setString(1, jugador.getDni());
            stmnt.setString(2, jugador.getNombre());
            stmnt.setString(3, jugador.getApellidos());
            stmnt.setDate(4, sqlDate);
            stmnt.setInt(6, jugador.getResistencia());
            stmnt.setInt(7, jugador.getRecuperacion());
            stmnt.setInt(5, jugador.getVelocidad());

            stmnt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return jugador;
    }

    @Override
    public Jugador actualizarJugador(String dni, Jugador jnuevo) {
        return null;
    }
}
