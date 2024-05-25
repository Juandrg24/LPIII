package com.ventas.Ventas;

import java.util.List;

public interface ProductoInterface {
    
	public void guardarProducto(Producto producto);
    public List<Producto> listadoProductos();
    public Producto consultarProducto(Integer id);
    public void eliminarProducto(Integer id);
    
}
