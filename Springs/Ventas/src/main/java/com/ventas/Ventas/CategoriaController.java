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

@Controller
@SessionAttributes("categoria")
public class CategoriaController {
    @Autowired
    private CategoriaInterface CategoriaServicio;

    @GetMapping(value = "categoriaInsertar")
    public String categoriaInsertar(Model model) {
        Categoria categoria = new Categoria();
        model.addAttribute("categoria", categoria);
        model.addAttribute("mensaje", "Nueva Categoria");

        return "categoriaInsertar";
    }

    @PostMapping("/insertar")
    public String insertar(@ModelAttribute(name = "categoria") Categoria categoria, Model model, SessionStatus status) {
        CategoriaServicio.guardar(categoria);
        status.setComplete();
        return "redirect:/categoriaListar";
    }

    @GetMapping("/categoriaListar")
    public String categoria(Model model) {
        List<Categoria> categoria = CategoriaServicio.listado();
        model.addAttribute("categoria",categoria);
        model.addAttribute("mensaje","Listado");
        return "/categoriaListar";
    }

    @GetMapping("/consultar/{id}")
    public String consultar(@PathVariable(name="id")Integer id, Model model){
        Categoria categoria = CategoriaServicio.consultar(id);
        model.addAttribute("categoria", categoria);
        model.addAttribute("mensaje", "consultar");
        return "redirect:/categoriaListar";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(name="id")Integer id, Model model){
        Categoria categoria = CategoriaServicio.consultar(id);
        CategoriaServicio.eliminar(id);
        return "redirect:/categoriaListar";
    }
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable(name="id")Integer id, Model model){
        Categoria categoria = CategoriaServicio.consultar(id);
        model.addAttribute("categoria", categoria);
        model.addAttribute("mensaje", "modificar");
        return "categoriaInsertar";
    }






}
