package com.repaso.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
public class PacienteServicio implements PacienteInterface {

    @Autowired
    private PacienteDAO pacienteDAO;

    @Override
    @Transactional
    public void guardar(Paciente paciente) {
        pacienteDAO.save(paciente);
    }

    
}
