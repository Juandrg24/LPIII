package com.musica.musica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GeneromusicalDAO extends JpaRepository<Generomusical,Integer>{
    
}
