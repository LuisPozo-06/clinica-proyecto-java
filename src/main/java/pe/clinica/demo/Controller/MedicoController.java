package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.clinica.demo.model.MedicoModel;
import pe.clinica.demo.service.EspecialidadService;
import pe.clinica.demo.service.MedicoService;

import pe.clinica.demo.model.EspecialidadModel;

@Controller
@RequestMapping("/medico")
public class MedicoController {

    private final MedicoService medicoService;
    private final EspecialidadService especialidadService;

    public MedicoController(MedicoService medicoService,
                            EspecialidadService especialidadService) {
        this.medicoService = medicoService;
        this.especialidadService = especialidadService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("medico", new MedicoModel());
        model.addAttribute("medicos", medicoService.obtenerMedicos());
        model.addAttribute("especialidades", especialidadService.obtenerEspecialidades());
        return "medico/medico";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("medico", new MedicoModel());
        model.addAttribute("especialidades", especialidadService.obtenerEspecialidades());
        return "medico/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        MedicoModel medico = medicoService.obtenerMedicoXid(id);
        if (medico == null) {
            return "redirect:/medico";
        }
        model.addAttribute("medico", medico);
        model.addAttribute("especialidades", especialidadService.obtenerEspecialidades());
        return "medico/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("medico") MedicoModel medicoModel) {
        // Asignar la especialidad completa desde el ID
        if (medicoModel.getEspecialidad() != null && medicoModel.getEspecialidad().getIdespecialidad() != null) {
            EspecialidadModel especialidad = especialidadService.obtenerEspecialidadXid(
                    medicoModel.getEspecialidad().getIdespecialidad()
            );
            medicoModel.setEspecialidad(especialidad);
        }
        medicoService.guardarMedico(medicoModel);
        return "redirect:/medico";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        medicoService.eliminarMedico(Math.toIntExact(id));
        return "redirect:/medico";
    }
}