package com.repaso.hospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteDAO extends JpaRepository<Paciente,Integer>{

    
}
