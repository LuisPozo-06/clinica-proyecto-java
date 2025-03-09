package pe.clinica.demo.model;

import java.util.Date;

public class receta_medica {
    private int idReceta;
    private int idMedicamento;
    private int idMedico;
    private Date fechaReceta;

    public receta_medica(int idReceta, int idMedicamento, int idMedico, Date fechaReceta) {
        this.idReceta = idReceta;
        this.idMedicamento = idMedicamento;
        this.idMedico = idMedico;
        this.fechaReceta = fechaReceta;
    }

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