package pe.clinica.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.clinica.demo.model.CitaModel;
import pe.clinica.demo.model.DetalleModel;
import pe.clinica.demo.service.DetalleService;

@Controller
@RequestMapping("/detalle")
public class detalleController {
    private final DetalleService detalleService;

    public detalleController(DetalleService detalleService) {
        this.detalleService = detalleService;
    }
    @GetMapping
    public String index(Model model){
        model.addAttribute("detalle",
                detalleService.obtenerDetalle());
        return "detalle/detalle";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("detalle",
                new DetalleModel());
        return "detalle/detalle";
    }

    //localhost:8080/category/edit/1
    @GetMapping("/edit/{id}")
    public String edit(Model model,
                       @PathVariable int id){
        model.addAttribute("detalle",
                detalleService.obtenerDetalleXid(id));
        return "detalle/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("detalle") DetalleModel detalleModel) {
        detalleService.guardarDetalle(detalleModel);
        return "redirect:/detalle";
    }
    @PostMapping("/delete/{id}")
    public String deleteDetalle(@PathVariable("id") Long id) {
        detalleService.eliminarDetalle(Math.toIntExact(id));
        return "redirect:/detalle";
    }

}
