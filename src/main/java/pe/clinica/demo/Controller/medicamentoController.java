package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class medicamentoController {
    @GetMapping("/medicamento")
    public String medicamento() {
        return "medicamento";
    }
}
