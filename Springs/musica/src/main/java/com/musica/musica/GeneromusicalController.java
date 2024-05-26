package com.musica.musica;

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
@SessionAttributes("generomusical")
public class GeneromusicalController {

    @Autowired
    private GeneromusicalInterface GeneromusicalServicio;

    @GetMapping(value = "/generomusicalInsertar")
    public String generomusicalInsertar(Model model){
        Generomusical generomusical= new Generomusical();
        model.addAttribute("generomusical", generomusical);
        model.addAttribute("mensaje", "Nuevo Género Musical");

        return"generomusicalInsertar";
    }
    @PostMapping("/insertar")
    public String insertarGeneromusical(@ModelAttribute(name = "generomusical")Generomusical generomusical, Model model, SessionStatus status){
        GeneromusicalServicio.guardarGeneromusical(generomusical);
        status.setComplete();
        return "redirect:/generomusicalListar";
    }
    @GetMapping("/generomusicalListar")
    public String listarGeneromusical(Model model){
        List<Generomusical> generomusical = GeneromusicalServicio.listadoGeneromusical();
        model.addAttribute("generomusical",generomusical);
        model.addAttribute("mensaje","Listado");
        return "/generomusicalListar";
    }

    @GetMapping("/consultarGeneromusical/{id}")
    public String consultarGeneromusical(@PathVariable(name = "id")Integer id,Model model){
        Generomusical generomusical= GeneromusicalServicio.consultarGeneromusical(id);
        model.addAttribute("generomusical",generomusical);
        model.addAttribute("mensaje","consultarGeneromusical");
        return "redirect:/generomusicalListar";
    }
    @GetMapping("/eliminarGeneromusical/{id}")
    public String eliminarGeneromusical(@PathVariable(name = "id")Integer id,Model model){
        Generomusical generomusical= GeneromusicalServicio.consultarGeneromusical(id);
        GeneromusicalServicio.eliminarGeneromusical(id);
        return "redirect:/generomusicalListar";
    }
    @GetMapping("/modificarGeneromusical/{id}")
    public String modificarGeneromusical(@PathVariable(name = "id")Integer id,Model model){
        Generomusical generomusical= GeneromusicalServicio.consultarGeneromusical(id);
        model.addAttribute("generomusical",generomusical);
        model.addAttribute("mensaje","modificarGeneromusical");
        return "generomusicalInsertar";
    }
}
