package pe.clinica.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "facturacion")

public class FacturacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idfacturacion;
    @ManyToOne
    @JoinColumn(name = "idpaciente")
    private PacienteModel paciente;
    @ManyToOne
    @JoinColumn(name = "idadministrativo")
    private AdministrativoModel administrativo;
    private String fechafacturacion;
    private double monto;
    private String estadopago;

}
