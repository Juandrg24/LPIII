package com.juanrubio.Notas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("nota")
public class NotaController {
    @Autowired
    private NotaInterface NotaServicio;

    @GetMapping(value = "/notasInsertar")
    public String notasInsertar(Model model) {

        Nota nota = new Nota();
        model.addAttribute("nota", nota);
        model.addAttribute("mensaje", "Nuevo Registro");
        return "notasInsertar";
    }

    @PostMapping("/insertar")
    public String Insertar(@ModelAttribute(name = "nota") Nota nota, Model model, SessionStatus status) {
        NotaServicio.guardar(nota);
        status.setComplete();
        return "redirect:/notasListar";
    }

    @GetMapping("/notasListar")
    public String notas(Model model){
        List<Nota> nota= NotaServicio.ListadoNotas();
        model.addAttribute("nota", nota);
        model.addAttribute("mensaje", "Listado Notas");
        return "/notasListar";
    }


}
