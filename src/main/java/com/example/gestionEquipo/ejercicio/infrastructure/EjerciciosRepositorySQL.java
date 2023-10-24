package com.example.gestionEquipo.ejercicio.infrastructure;

import com.example.gestionEquipo.DBConnection;
import com.example.gestionEquipo.ejercicio.aplication.EjerciciosUseCases;
import com.example.gestionEquipo.ejercicio.domain.Ejercicio;
import com.example.gestionEquipo.ejercicio.domain.EjerciciosRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EjerciciosRepositorySQL implements EjerciciosRepository {
    @Override
    public List<Ejercicio> getAll() {
        List<Ejercicio> ejercicios = new ArrayList<>();
        try {
            Statement statement = DBConnection.getInstance().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ejercicios;");
            while (rs.next()){
                Ejercicio ejercicio = new Ejercicio(
                        rs.getInt("id"),
                        rs.getString("titulo")
                );

                ejercicios.add(ejercicio);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ejercicios;
    }

    @Override
    public Ejercicio getEjercicio(Integer id) {
        return null;
    }

    @Override
    public Ejercicio save(Ejercicio ejercicio) {
        return null;
    }
}
