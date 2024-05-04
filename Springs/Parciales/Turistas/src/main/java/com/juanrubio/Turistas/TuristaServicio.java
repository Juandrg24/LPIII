package com.juanrubio.Turistas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class TuristaServicio implements TuristaInterface{

    @Autowired
    private TuristaDAO turistaDAO;
    @Override
    @Transactional
    public void guardar(Turista turista) {
       turistaDAO.save(turista);
    }
    
}
