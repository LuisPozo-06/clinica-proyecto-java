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

    @Autowired
    private AdministrativoRepository administrativoRepository;

    @GetMapping("/administrativo")
    public String administrativo(Model model) {
        List<AdministrativoModel> administrativos = administrativoRepository.findAll();
        model.addAttribute("administrativos", administrativos);
        return "administrativo"; // Nombre del archivo HTML en templates
    }
}
