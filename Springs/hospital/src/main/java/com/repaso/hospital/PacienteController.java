package com.repaso.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@SessionAttributes("paciente")

public class PacienteController {
    @Autowired
    private PacienteInterface PacienteServicio;

    @GetMapping(value = "/pacienteInsertar")
    public String pacienteInsertar(Model model){
        Paciente paciente = new Paciente();
        model.addAttribute("paciente", paciente);
        model.addAttribute("mensaje", "Nuevo Registro");

        return "pacienteInsertar";
    }

    @PostMapping("/insertar")
    public String Insertar(@ModelAttribute(name = "paciente") Paciente paciente, Model model,
    SessionStatus status){
        PacienteServicio.guardar(paciente);
        status.setComplete();
        return "redirect:/pacienteInsertar";

    }
    
}
