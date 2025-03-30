package pe.clinica.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.clinica.demo.model.CitaModel;

public interface CitaRepository extends JpaRepository <CitaModel,Integer >{
}
