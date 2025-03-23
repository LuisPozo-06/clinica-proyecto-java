package pe.clinica.demo.model;

public class Administrator {
    private Integer idAdministrativo;
    private String nombresApellidos;
    private String cargo;
    private Integer telefono;
    private String correo;

    // Constructor
    public Administrator(Integer idAdministrativo, String nombresApellidos, String cargo, Integer telefono, String correo) {
        this.idAdministrativo = idAdministrativo;
        this.nombresApellidos = nombresApellidos;
        this.cargo = cargo;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters y Setters
    public Integer getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(Integer idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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