package pe.clinica.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "historia_medica")

public class Historia_medicaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHistoria;
    @ManyToOne
    @JoinColumn(name = "ID_Paciente")
    private PacienteModel paciente;
    private String diagnostico;
    private String fecha;
    private String tratamiento;

    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
