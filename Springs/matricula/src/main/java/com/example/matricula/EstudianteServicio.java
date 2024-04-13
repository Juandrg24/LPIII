package com.example.matricula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
// implements : llama los metodos de la clase a llamar
public class EstudianteServicio implements EstudianteInterface {

    // Se encarga de toda la manipulacion de los setters
    @Autowired
    private EstudianteDAO estudianteDAO;

    @Override

    // Se encarga de las transacciones de informacion(guardar, eliminar, modificar)
    @Transactional
    public void guardar(Estudiante estudiante) {

        // Metodo save inserta datos
        estudianteDAO.save(estudiante);

    }

}
