package pe.clinica.demo.model;

public class medico {

    private int idMedico;
    private int DniMedico;
    private int idEspecialidad;
    private String nombreApellido;
    private int telefonoMedico;
    private String correoMedico;

    public medico(int idMedico, int dniMedico, int idEspecialidad, String nombreApellido, int telefonoMedico, String correoMedico) {
        this.idMedico = idMedico;
        DniMedico = dniMedico;
        this.idEspecialidad = idEspecialidad;
        this.nombreApellido = nombreApellido;
        this.telefonoMedico = telefonoMedico;
        this.correoMedico = correoMedico;
    }

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

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
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
