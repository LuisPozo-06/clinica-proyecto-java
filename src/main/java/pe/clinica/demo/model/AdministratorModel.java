package pe.clinica.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "administrativo")


public class AdministratorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdministrativo;
    private String nombresApellidos;
    private String cargo;
    private Integer telefono;
    private String correo;

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