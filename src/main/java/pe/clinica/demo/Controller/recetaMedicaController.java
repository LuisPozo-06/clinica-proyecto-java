package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class recetaMedicaController {
    @GetMapping("/recetaMedica")
    public String recetaMedica() {
        return "recetaMedica";
    }
}
