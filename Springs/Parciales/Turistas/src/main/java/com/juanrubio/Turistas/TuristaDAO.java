package com.juanrubio.Turistas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuristaDAO extends JpaRepository<Turista,Integer> {
    
}
