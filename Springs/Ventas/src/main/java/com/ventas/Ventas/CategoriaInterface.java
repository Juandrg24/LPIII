package com.ventas.Ventas;

import java.util.List;

public interface CategoriaInterface {
    public void guardar(Categoria categoria);
    public List<Categoria> listado();
    public Categoria consultar(Integer id);
    public void eliminar(Integer id);
}
