package com.juanrubio.Turistas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TuristaController {
    @GetMapping(value = "/turistaInsertar")
    public String turistaInsertar(Model model){
        Turista turista= new Turista();
        model.addAttribute("turista", turista);
        model.addAttribute("mensaje", "Nuevo Registro");
        return "turistaInsertar";
    }


}
