package com.repaso.hospital;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HospitalController {
    @GetMapping(value = "/pacienteInsertar")
    public String pacienteInsertar(Model model){
        return "pacienteInsertar";
    }
    
}
