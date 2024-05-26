package com.ventas.Ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ProductoServicio implements ProductoInterface {

    @Autowired 
    private ProductoDAO productoDAO;
    @Autowired
    private CategoriaDAO categoriaDAO;

    @Override
    @Transactional
    public void guardarProducto(Producto producto) {
       productoDAO.save(producto);
    }

    @Override
    @Transactional
    public List<Producto> listadoProductos() {
       return productoDAO.findAll();
    }

    @Override
    @Transactional
    public Producto consultarProducto(Integer id) {
        return productoDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void eliminarProducto(Integer id) {
        productoDAO.deleteById(id);
    }    
    
}
