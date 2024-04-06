package com.example.matricula;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteController {
    
    @GetMapping(value = "/estudianteIngresar")
    public String estudianteInsertar(){
        return"estudianteInsertar";
    }
}
