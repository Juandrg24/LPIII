package com.musica.musica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CantanteServicio implements CantanteInterface{
    @Autowired
    private CantanteDAO cantanteDAO;
    @Autowired
    private GeneromusicalDAO generomusicalDAO;

    @Override
    @Transactional
    public void guardarCantante(Cantante cantante) {
        cantanteDAO.save(cantante);
    }

    @Override
    @Transactional
    public List<Cantante> listadoCantantes() {
        return cantanteDAO.findAll();
    }

    @Override
    @Transactional
    public Cantante consultarCantante(Integer id) {
       return cantanteDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void eliminarCantante(Integer id) {
       cantanteDAO.deleteById(id);
    }
    
    
}
