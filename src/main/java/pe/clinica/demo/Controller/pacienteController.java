package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pacienteController {
    @GetMapping("/paciente")
    public String paciente() {
        return "paciente";
    }
}
