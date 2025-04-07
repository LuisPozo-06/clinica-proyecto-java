package pe.clinica.demo.service;

import org.springframework.stereotype.Service;
import pe.clinica.demo.model.DetalleModel;
import pe.clinica.demo.model.EspecialidadModel;
import pe.clinica.demo.repository.EspecialidadRepository;

import java.util.List;

@Service
public class EspecialidadService {
    private  final EspecialidadRepository especialidadRepository;

    public EspecialidadService(EspecialidadRepository especialidadRepository) {
        this.especialidadRepository = especialidadRepository;
    }

    public List<EspecialidadModel> obtenerDetalle(){
        return especialidadRepository.findAll();}

    public EspecialidadModel obtenerEspecialidadXid(int id){
        return  especialidadRepository.findById(id).orElse(null);
    }
    public  void guardarEspecialidad( EspecialidadModel especialidadModel){

        especialidadRepository.save(especialidadModel);
    }
    public List<EspecialidadModel> obtenerEspecialidades() {
        return especialidadRepository.findAll();
    }
}
