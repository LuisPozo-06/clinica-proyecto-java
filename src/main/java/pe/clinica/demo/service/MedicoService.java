package pe.clinica.demo.service;

import org.springframework.stereotype.Service;
import pe.clinica.demo.model.MedicoModel;
import pe.clinica.demo.repository.MedicoRepository;

import java.util.List;


@Service
public class MedicoService {
    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public List<MedicoModel> obtenerMedicos() {
        return medicoRepository.findAll();
    }

    public MedicoModel obtenerMedicoXid(int id) {
        return medicoRepository.findById(id).orElse(null);
    }

    public void guardarMedico(MedicoModel medicoModel) {
        // Validación básica del DNI
        if(medicoModel.getDnimedico() == null || medicoModel.getDnimedico().toString().length() != 8) {
            throw new IllegalArgumentException("El DNI debe tener 8 dígitos");
        }
        medicoRepository.save(medicoModel);
    }

    public void eliminarMedico(int id) {
        if (!medicoRepository.existsById(id)) {
            throw new RuntimeException("Médico no encontrado con ID: " + id);
        }
        medicoRepository.deleteById(id);
    }
}