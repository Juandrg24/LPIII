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
@SessionAttributes("cantante")
public class CantanteController {

    @Autowired
    private CantanteInterface CantanteServicio;
    @Autowired
    private GeneromusicalInterface GeneromusicalServicio;

    @GetMapping(value = "/cantanteInsertar")
    public String cantanteInsertar(Model model) {
        Cantante cantante = new Cantante();
        model.addAttribute("cantante", cantante);
        model.addAttribute("mensaje", "Nuevo Cantante");

        return "cantanteInsertar";
    }

    @ModelAttribute("generomusical")
    public List<Generomusical> datosCategoria() {
        return GeneromusicalServicio.listadoGeneromusical();
    }

    @PostMapping("/insertarCantante")
    public String insertarCantante(@ModelAttribute(name = "cantante") Cantante cantante, Model model,
            SessionStatus status) {
        CantanteServicio.guardarCantante(cantante);
        status.setComplete();
        return "redirect:/cantanteListar";
    }

    @GetMapping("/cantanteListar")
    public String cantanteListar(Model model) {
        List<Cantante> cantante = CantanteServicio.listadoCantantes();
        model.addAttribute("cantante", cantante);
        model.addAttribute("mensaje", "Listado Cantantes");

        return "cantanteListar";
    }

    @GetMapping("/consultarCantante/{id}")
    public String consultarCantante(@PathVariable(name = "id") Integer id, Model model) {
        Cantante cantante = CantanteServicio.consultarCantante(id);
        model.addAttribute("cantante", cantante);
        model.addAttribute("mensaje", "consultarCantante");
        return "redirect:/cantanteListar";

    }

    @GetMapping("/eliminarCantante/{id}")
    public String eliminarCantante(@PathVariable(name = "id") Integer id, Model model) {
        Cantante cantante = CantanteServicio.consultarCantante(id);
        CantanteServicio.eliminarCantante(id);
        return "redirect:/cantanteListar";

    }

    @GetMapping("/modificarCantante/{id}")
    public String modificarCantante(@PathVariable(name = "id") Integer id, Model model) {
        Cantante cantante = CantanteServicio.consultarCantante(id);
        model.addAttribute("cantante", cantante);
        model.addAttribute("mensaje", "consultarCantante");
        return "cantanteInsertar";

    }

}
