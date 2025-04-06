package pe.clinica.demo.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table (name = "cita")

public class CitaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcita;
    private String estado;
    private Date hora;
    private Date fechacita;
    @ManyToOne
    @JoinColumn(name = "idpaciente")
    private PacienteModel paciente;
    @ManyToOne
    @JoinColumn(name = "idmedico")
    private MedicoModel medico;

    public Integer getIdcita() {
        return idcita;
    }

    public void setIdcita(Integer idcita) {
        this.idcita = idcita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFechacita() {
        return fechacita;
    }

    public void setFechacita(Date fechacita) {
        this.fechacita = fechacita;
    }

    public PacienteModel getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteModel paciente) {
        this.paciente = paciente;
    }

    public MedicoModel getMedico() {
        return medico;
    }

    public void setMedico(MedicoModel medico) {
        this.medico = medico;
    }
}
