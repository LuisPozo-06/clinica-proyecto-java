package pe.clinica.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.clinica.demo.model.CitaModel;
import pe.clinica.demo.model.FacturacionModel;
import pe.clinica.demo.model.PacienteModel;
import pe.clinica.demo.service.CitaService;
import pe.clinica.demo.service.PacienteService;

@Controller
@RequestMapping("/cita")
public class citaController {

    private  final CitaService citaService;
    @Autowired
    private final PacienteService pacienteService;

    public citaController(CitaService citaService, PacienteService pacienteService) {
        this.citaService = citaService;
        this.pacienteService = pacienteService;

    }
    @GetMapping

    public String index(Model model){
        model.addAttribute("citas",
               citaService.obtenerCitas());
        model.addAttribute("pacientes",
                pacienteService.obtenerPacientes());
        return "cita/cita";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("cita",
                new CitaModel());
        return "category/cita";
    }

    //localhost:8080/category/edit/1
    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        CitaModel citaModel = citaService.obtenerCitaXid(id);

        if (citaModel == null) {
            return "redirect:/cita";
        }

        model.addAttribute("cita", citaModel);
        model.addAttribute("pacientes", pacienteService.obtenerPacientes());

        return "cita/edit";
    }


    @PostMapping("/save")
    public String save(@ModelAttribute("cita")
                      CitaModel citaModel){
        citaService.guardarCita(citaModel);
        Integer idPaciente = citaModel.getPaciente() != null ? citaModel.getPaciente().getIdpaciente() : null;
        if (idPaciente != null) {
            PacienteModel paciente = pacienteService.obtenerPacienteXid(idPaciente);
            citaModel.setPaciente(paciente);
        }

        return "redirect:/cita";
    }
    @PostMapping("/delete/{id}")
    public String deleteCita(@PathVariable("id") Long id) {
        citaService.eliminarCita(Math.toIntExact(id));
        return "redirect:/cita";
    }


}


