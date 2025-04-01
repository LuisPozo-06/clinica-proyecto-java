package pe.clinica.demo.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "receta_medica")

public class RecetaMedicaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReceta;
    @ManyToOne
    @JoinColumn(name="ID_Medicamento")
    private MedicamentoModel medicamento;
    @ManyToOne
    @JoinColumn(name = "ID_Medico")
    private MedicoModel medico;
    private Date fechaReceta;;

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public Date getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(Date fechaReceta) {
        this.fechaReceta = fechaReceta;
    }
}