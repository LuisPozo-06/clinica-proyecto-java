package pe.clinica.demo.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "receta_medica")

public class RecetaMedicaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReceta;
    private int idMedicamento;
    private int idMedico;
    private Date fechaReceta;

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public Date getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(Date fechaReceta) {
        this.fechaReceta = fechaReceta;
    }
}