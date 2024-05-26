package com.musica.musica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class GeneromusicalServicio implements GeneromusicalInterface{

    @Autowired
    private GeneromusicalDAO generomusicalDAO;

    @Override
    @Transactional
    public void guardarGeneromusical(Generomusical generomusical) {
       generomusicalDAO.save(generomusical);
    }

    @Override
    @Transactional
    public List<Generomusical> listadoGeneromusical() {
        return generomusicalDAO.findAll();
    }

    @Override
    @Transactional
    public Generomusical consultarGeneromusical(Integer id) {
        return generomusicalDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void eliminarGeneromusical(Integer id) {
        generomusicalDAO.deleteById(id);
    }
    
}
