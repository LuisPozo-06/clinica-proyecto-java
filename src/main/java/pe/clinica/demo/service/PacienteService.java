package pe.clinica.demo.service;


import org.springframework.stereotype.Service;
import pe.clinica.demo.model.PacienteModel;
import pe.clinica.demo.repository.PacienteRepository;

import java.util.List;


@Service
public class PacienteService {
    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<PacienteModel> obtenerPacientes() {
        return pacienteRepository.findAll();
    }

    public PacienteModel obtenerPacienteXid(int id) {
        return pacienteRepository.findById((Integer) id).orElse(null);
    }

    public void guardarPaciente(PacienteModel pacienteModel) {
        pacienteRepository.save(pacienteModel);
    }

    public void eliminarPaciente(int id) {
        pacienteRepository.deleteById((Integer) id);
    }



}