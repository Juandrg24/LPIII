package com.example.matricula;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Estudiante base de datos , Integer tipo de dato a buscar
public interface EstudianteDAO extends JpaRepository<Estudiante, Integer> {

}
