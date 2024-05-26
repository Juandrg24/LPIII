package com.musica.musica;

import java.util.List;

public interface GeneromusicalInterface {
    public void guardarGeneromusical(Generomusical generomusical);
    public List<Generomusical> listadoGeneromusical();
    public Generomusical consultarGeneromusical(Integer id);
    public void eliminarGeneromusical(Integer id);
}
