package pe.clinica.demo.service;


import org.springframework.stereotype.Service;
import pe.clinica.demo.model.AdministrativoModel;
import pe.clinica.demo.model.CitaModel;
import pe.clinica.demo.model.DetalleModel;
import pe.clinica.demo.repository.DetalleRepository;

import java.util.List;

@Service
public class DetalleService {
    private final DetalleRepository detalleRepository;
    public DetalleService(DetalleRepository detalleRepository) {
        this.detalleRepository = detalleRepository;
    }

    public List <DetalleModel>obtenerDetalle(){
        return detalleRepository.findAll();}

    public DetalleModel obtenerDetalleXid(int id){
        return  detalleRepository.findById(id).orElse(null);
    }
    public  void guardarDetalle(DetalleModel detalleModel){
        detalleRepository.save(detalleModel);
    }

    public void eliminarDetalle(int id) {
        detalleRepository.deleteById((int) id);

    }

}


