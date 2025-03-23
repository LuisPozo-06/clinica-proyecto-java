package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class citaController {
    @GetMapping("/cita")
    public String cita(){
        return  "cita";
    }
}

