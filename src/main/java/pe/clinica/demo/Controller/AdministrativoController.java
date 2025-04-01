package pe.clinica.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.clinica.demo.model.AdministrativoModel;
import pe.clinica.demo.repository.AdministrativoRepository;

import java.util.List;

@Controller
public class AdministrativoController {
    @GetMapping("/administrativo")
    public String administrativo() {
        return "administrativo";
    }
}
