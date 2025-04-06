package pe.clinica.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.clinica.demo.model.PacienteModel;
import pe.clinica.demo.service.PacienteService;


@Controller
@RequestMapping("/paciente")
public class PacienteController {

    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("pacientes", pacienteService.obtenerPacientes());
        return "paciente/paciente";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("paciente", new PacienteModel());
        return "paciente/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("paciente", pacienteService.obtenerPacienteXid(id));
        return "paciente/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("paciente") PacienteModel pacienteModel) {
        pacienteService.guardarPaciente(pacienteModel);
        return "redirect:/paciente";
    }

    @PostMapping("/delete/{id}")
    public String deletePaciente(@PathVariable("id") Long id) {
        pacienteService.eliminarPaciente(Math.toIntExact(id));
        return "redirect:/paciente";
    }
}