package pe.clinica.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.clinica.demo.model.MedicoModel;

public interface MedicoRepository extends JpaRepository <MedicoModel,Integer> {
}
