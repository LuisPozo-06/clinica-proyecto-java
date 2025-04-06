package pe.clinica.demo.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "paciente")

public class    PacienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpaciente;
    private Integer dnipaciente;
    private String nombresapellidos;
    private Date fechanacimiento;
    private Integer telefono;
    private String correo;

    public Integer getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Integer getDnipaciente() {
        return dnipaciente;
    }

    public void setDnipaciente(Integer dnipaciente) {
        this.dnipaciente = dnipaciente;
    }

    public String getNombresapellidos() {
        return nombresapellidos;
    }

    public void setNombresapellidos(String nombresapellidos) {
        this.nombresapellidos = nombresapellidos;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
