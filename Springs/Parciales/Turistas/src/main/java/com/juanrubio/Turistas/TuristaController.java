package com.juanrubio.Turistas;

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
@SessionAttributes("turista")
public class TuristaController {
    @Autowired
    private TuristaInterface TuristaServicio;

    @GetMapping(value = "/turistaInsertar")
    public String turistaInsertar(Model model) {
        Turista turista = new Turista();
        model.addAttribute("turista", turista);
        model.addAttribute("mensaje", "Nuevo Registro");
        return "turistaInsertar";
    }

    @PostMapping("/insertar")
    public String insertar(@ModelAttribute(name = "turista") Turista turista, Model model, SessionStatus status) {
        // Antes de Guardar se llama el metodo encargado de calcular el valor a pagar
        // ValTotal()
        turista.valTotal();
        TuristaServicio.guardar(turista);
        status.setComplete();
        return "redirect:/turistaListar";
    }

    @GetMapping("/turistaListar")
    public String turista(Model model) {
        List<Turista> turista = TuristaServicio.listado();
        model.addAttribute("turista", turista);
        model.addAttribute("mensaje", "Listado");
        return "/turistaListar";

    }

    @GetMapping("/consultar/{id}")
    public String consultar(@PathVariable(name = "id") Integer id, Model model) {
        Turista turista = TuristaServicio.consultar(id);
        model.addAttribute("turista", turista);
        model.addAttribute("mensaje", "consulta");
        return "redirect:/turistaListar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(name = "id") Integer id, Model model) {
        Turista turista = TuristaServicio.consultar(id);
        TuristaServicio.eliminar(id);
        return "redirect:/turistaListar";

    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable(name="id") Integer id,Model model){
        Turista turista = TuristaServicio.consultar(id);
        model.addAttribute("turista", turista);
        model.addAttribute("mensaje", "modificar");
        return "turistaInsertar";
    }

}
