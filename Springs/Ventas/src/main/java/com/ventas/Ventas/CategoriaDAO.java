package com.ventas.Ventas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, Integer>{
    
}
