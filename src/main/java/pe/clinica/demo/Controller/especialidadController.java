package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.clinica.demo.model.DetalleModel;
import pe.clinica.demo.model.EspecialidadModel;
import pe.clinica.demo.service.DetalleService;
import pe.clinica.demo.service.EspecialidadService;

@Controller
@RequestMapping("/especialidad")
public class especialidadController {
    private final EspecialidadService especialidadService;


    public especialidadController(EspecialidadService especialidadService) {
        this.especialidadService = especialidadService;
    }
    @GetMapping
    public String index(Model model){
        model.addAttribute("especialidad",
                especialidadService.obtenerDetalle());
        return "especialidad/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("especialidad",
                new EspecialidadModel());
        return "category/especialidad";
    }

    //localhost:8080/category/edit/1
    @GetMapping("/edit/{id}")
    public String edit(Model model,
                       @PathVariable int id){
        model.addAttribute("especialidad",
                especialidadService.obtenerEspecialidadXid(id));
        return "especialidad/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("especialidad")
                       EspecialidadModel especialidadModel){
        especialidadService.guardarEspecialidad(especialidadModel);
        return "redirect:/especialidad";
    }
}


