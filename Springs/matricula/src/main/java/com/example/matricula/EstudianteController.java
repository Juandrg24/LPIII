package com.example.matricula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("estudiante") // Darle seguridad con que vamos a iniciar
public class EstudianteController {

    @Autowired
    private EstudianteInterface EstudianteServicio;

    @GetMapping(value = "/estudianteInsertar")
    public String estudianteInsertar(Model model) {
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        model.addAttribute("mensaje", "Nuevo Registro");

        return "estudianteInsertar";
    }

    // Pasos de informacion
    @PostMapping("/insertar")
    public String Insertar(@ModelAttribute(name = "estudiante") Estudiante estudiante, Model model,
            SessionStatus status) {

        EstudianteServicio.guardar(estudiante);
        status.setComplete();
        return "/estudianteInsertar";

    }
}
