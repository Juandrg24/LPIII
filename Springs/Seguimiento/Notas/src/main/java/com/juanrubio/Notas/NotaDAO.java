package com.juanrubio.Notas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaDAO extends JpaRepository<Nota, Integer> {

}
