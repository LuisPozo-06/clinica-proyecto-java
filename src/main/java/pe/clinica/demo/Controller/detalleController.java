package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class detalleController {
    @GetMapping("/detalle")
    public String detalle(){
        return  "detalle";
    }
}
