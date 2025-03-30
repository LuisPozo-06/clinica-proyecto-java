package pe.clinica.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "medicamento")

public class MedicamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medicamentoId;
    private String medicamentoNombre;
    private String medicamentoDescripcion;
    private String medicamentoTipo;



    public int getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(int medicamentoId) {
        this.medicamentoId = medicamentoId;
    }

    public String getMedicamentoNombre() {
        return medicamentoNombre;
    }

    public void setMedicamentoNombre(String medicamentoNombre) {
        this.medicamentoNombre = medicamentoNombre;
    }

    public String getMedicamentoDescripcion() {
        return medicamentoDescripcion;
    }

    public void setMedicamentoDescripcion(String medicamentoDescripcion) {
        this.medicamentoDescripcion = medicamentoDescripcion;
    }

    public String getMedicamentoTipo() {
        return medicamentoTipo;
    }

    public void setMedicamentoTipo(String medicamentoTipo) {
        this.medicamentoTipo = medicamentoTipo;
    }
}
