package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.clinica.demo.model.MedicoModel;
import pe.clinica.demo.service.MedicoService;
import pe.clinica.demo.service.EspecialidadService;

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
    public String listarMedicos(Model model) {
        model.addAttribute("medico", new MedicoModel());
        model.addAttribute("medicos", medicoService.obtenerMedicos());
        model.addAttribute("especialidades", especialidadService.obtenerEspecialidades());
        return "medico/list";
    }

    @GetMapping("/edit/{id}")
    public String editarMedico(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
        MedicoModel medico = medicoService.obtenerMedicoXid(id);
        if (medico == null) {
            redirectAttributes.addFlashAttribute("error", "Médico no encontrado");
            return "redirect:/medico";
        }
        model.addAttribute("medico", medico);
        model.addAttribute("especialidades", especialidadService.obtenerEspecialidades());
        return "medico/list";
    }

    @PostMapping("/save")
    public String guardarMedico(@ModelAttribute("medico") MedicoModel medicoModel,
                                RedirectAttributes redirectAttributes) {
        try {
            // Validación y lógica de guardado
            medicoService.guardarMedico(medicoModel);
            redirectAttributes.addFlashAttribute("success",
                    medicoModel.getIdmedico() == null ? "Médico creado exitosamente" : "Médico actualizado exitosamente");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error: " + e.getMessage());
        }
        return "redirect:/medico";
    }

    @PostMapping("/delete/{id}")
    public String eliminarMedico(@PathVariable int id, RedirectAttributes redirectAttributes) {
        try {
            medicoService.eliminarMedico(id);
            redirectAttributes.addFlashAttribute("success", "Médico eliminado correctamente");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al eliminar: " + e.getMessage());
        }
        return "redirect:/medico";
    }
}