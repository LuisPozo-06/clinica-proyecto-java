package pe.clinica.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "medico")

public class MedicoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedico;
    private int DniMedico;
    @ManyToOne
    @JoinColumn(name="ID_Especialidad")
    private EspecialidadModel especialidad;
    private String nombreApellido;
    private int telefonoMedico;
    private String correoMedico;

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getDniMedico() {
        return DniMedico;
    }

    public void setDniMedico(int dniMedico) {
        DniMedico = dniMedico;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getTelefonoMedico() {
        return telefonoMedico;
    }

    public void setTelefonoMedico(int telefonoMedico) {
        this.telefonoMedico = telefonoMedico;
    }

    public String getCorreoMedico() {
        return correoMedico;
    }

    public void setCorreoMedico(String correoMedico) {
        this.correoMedico = correoMedico;
    }
}
