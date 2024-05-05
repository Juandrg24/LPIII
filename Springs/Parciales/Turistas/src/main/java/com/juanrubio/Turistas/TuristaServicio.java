package com.juanrubio.Turistas;

import java.util.List;

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

    @Override
    @Transactional
    public List<Turista> listado() {
       return turistaDAO.findAll();
    }

    @Override
    @Transactional
    public Turista consultar(Integer id) {
        return turistaDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void eliminar(Integer id) {
        turistaDAO.deleteById(id);
    }
    
}
