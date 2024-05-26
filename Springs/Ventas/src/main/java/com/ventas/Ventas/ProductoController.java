package com.ventas.Ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
@SessionAttributes("producto")
public class ProductoController {
    @Autowired
    private ProductoInterface ProductoServicio;
    @Autowired
    private CategoriaInterface CategoriaServicio;

    @GetMapping(value = "/productoInsertar")

    public String productoInsertar(Model model) {
        Producto producto = new Producto();
        model.addAttribute("producto", producto);
        model.addAttribute("mensaje", "Nuevo Producto");
        return "productoInsertar";
    }

    @ModelAttribute("categoria")
    public List<Categoria> datosCategoria() {
        return CategoriaServicio.listado();
    }

    @PostMapping("/insertarProducto")
    public String insertarProducto(@ModelAttribute(name = "producto") Producto producto, Model model,
            SessionStatus status) {
        ProductoServicio.guardarProducto(producto);
        status.setComplete();
        return "redirect:/productoListar";
    }

    @GetMapping("/productoListar")
    public String productoListar(Model model) {
        List<Producto> producto = ProductoServicio.listadoProductos();
        model.addAttribute("producto", producto);
        model.addAttribute("mensaje", "Listado Productos");
        return "productoListar";
    }

    @GetMapping("/consultarProducto/{id}")
    public String consultar(@PathVariable(name="id") Integer id, Model model){
        Producto producto = ProductoServicio.consultarProducto(id);
        model.addAttribute("producto", producto);
        model.addAttribute("mensaje", "Consultar");
        return "redirect:/productoListar";
    }

    @GetMapping("/eliminarProducto/{id}")
    public String eliminar(@PathVariable(name="id") Integer id, Model model){
        Producto producto = ProductoServicio.consultarProducto(id);
        ProductoServicio.eliminarProducto(id);
        return "redirect:/productoListar";
    }
    @GetMapping("/modificarProducto/{id}")
    public String modificar(@PathVariable(name="id") Integer id, Model model){
        Producto producto = ProductoServicio.consultarProducto(id);
        model.addAttribute("producto", producto);
        model.addAttribute("mensaje", "Consultar");
        return "productoInsertar";
    }


}
