package com.juanrubio.Notas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class NotaServicio implements NotaInterface {

    @Autowired
    private NotaDAO notaDAO;

    @Override
    @Transactional
    public void guardar(Nota nota) {
        notaDAO.save(nota);
    }

    @Override
    @Transactional
    public List<Nota> ListadoNotas() {
        return notaDAO.findAll();
    }
    

}
