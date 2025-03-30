package pe.clinica.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "especialidad")

public class EspecialidadModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialidad;
    private String nombreEspecialidad;
    private String descripcion;


    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
