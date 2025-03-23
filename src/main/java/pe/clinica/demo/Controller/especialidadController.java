package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class especialidadController {
    @GetMapping("/especialidad")
    public String especialidad(){
        return  "especialidad";
    }
}


