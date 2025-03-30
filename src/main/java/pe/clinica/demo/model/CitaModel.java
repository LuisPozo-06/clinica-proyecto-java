package pe.clinica.demo.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table (name = "cita")

public class CitaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer _id_cita;
    private String _estado;
    private Date _hora;
    private Date _fecha_cita;
    private Integer _id_paciente;
    private Integer _id_medico;


    public Integer get_id_cita() {
        return _id_cita;
    }

    public void set_id_cita(Integer _id_cita) {
        this._id_cita = _id_cita;
    }

    public String get_estado() {
        return _estado;
    }

    public void set_estado(String _estado) {
        this._estado = _estado;
    }

    public Date get_hora() {
        return _hora;
    }

    public void set_hora(Date _hora) {
        this._hora = _hora;
    }

    public Date get_fecha_cita() {
        return _fecha_cita;
    }

    public void set_fecha_cita(Date _fecha_cita) {
        this._fecha_cita = _fecha_cita;
    }

    public Integer get_id_paciente() {
        return _id_paciente;
    }

    public void set_id_paciente(Integer _id_paciente) {
        this._id_paciente = _id_paciente;
    }

    public Integer get_id_medico() {
        return _id_medico;
    }

    public void set_id_medico(Integer _id_medico) {
        this._id_medico = _id_medico;
    }
}
