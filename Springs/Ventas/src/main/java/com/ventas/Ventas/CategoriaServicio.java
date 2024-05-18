package com.ventas.Ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CategoriaServicio implements CategoriaInterface{

    @Autowired 
    private CategoriaDAO categoriaDAO;

    @Override
    @Transactional
    public void guardar(Categoria categoria) {
       categoriaDAO.save(categoria);
    }

    @Override
    @Transactional
    public List<Categoria> listado(){
        return categoriaDAO.findAll();
    }

    @Override
    @Transactional
    public Categoria consultar(Integer id) {
        return categoriaDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void eliminar(Integer id) {
        categoriaDAO.deleteById(id);
    }
    
}
