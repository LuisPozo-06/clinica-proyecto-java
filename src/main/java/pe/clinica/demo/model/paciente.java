package pe.clinica.demo.model;

import java.util.Date;

public class paciente {
    private int idPaciente;
    private int DniPaciente;
    private String NombrePaciente;
    private Date FechaPaciente;
    private int telefonoPaciente;
    private String correoPaciente;

    public paciente(int idPaciente, int dniPaciente, String nombrePaciente, Date fechaPaciente, int telefonoPaciente, String correoPaciente) {
        this.idPaciente = idPaciente;
        DniPaciente = dniPaciente;
        NombrePaciente = nombrePaciente;
        FechaPaciente = fechaPaciente;
        this.telefonoPaciente = telefonoPaciente;
        this.correoPaciente = correoPaciente;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getDniPaciente() {
        return DniPaciente;
    }

    public void setDniPaciente(int dniPaciente) {
        DniPaciente = dniPaciente;
    }

    public String getNombrePaciente() {
        return NombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        NombrePaciente = nombrePaciente;
    }

    public Date getFechaPaciente() {
        return FechaPaciente;
    }

    public void setFechaPaciente(Date fechaPaciente) {
        FechaPaciente = fechaPaciente;
    }

    public int getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public void setTelefonoPaciente(int telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }

    public String getCorreoPaciente() {
        return correoPaciente;
    }

    public void setCorreoPaciente(String correoPaciente) {
        this.correoPaciente = correoPaciente;
    }
}
