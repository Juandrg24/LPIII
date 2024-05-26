package com.musica.musica;

import java.util.List;

public interface CantanteInterface {
    public void guardarCantante(Cantante cantante);
    public List<Cantante> listadoCantantes();
    public Cantante consultarCantante(Integer id);
    public void eliminarCantante(Integer id);
    
} 
