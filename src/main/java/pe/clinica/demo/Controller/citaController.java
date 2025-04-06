package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.clinica.demo.model.CitaModel;
import pe.clinica.demo.service.CitaService;

@Controller
@RequestMapping("/cita")
public class citaController {
    private  final CitaService citaService;

    public citaController(CitaService citaService) {
        this.citaService = citaService;
    }
    @GetMapping

    public String index(Model model){
        model.addAttribute("citas",
               citaService.obtenerCitas());
        return "cita/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("cita",
                new CitaModel());
        return "category/cita";
    }

    //localhost:8080/category/edit/1
    @GetMapping("/edit/{id}")
    public String edit(Model model,
                       @PathVariable int id){
        model.addAttribute("cita",
                citaService.obtenerCitaXid(id));
        return "cita/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("cita")
                      CitaModel citaModel){
        citaService.guardarCita(citaModel);
        return "redirect:/cita";
    }



}


