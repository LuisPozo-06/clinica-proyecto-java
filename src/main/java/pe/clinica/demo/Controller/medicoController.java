package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class medicoController {
    @GetMapping("/medico")
    public String medico() {
        return "medico";
    }
}
