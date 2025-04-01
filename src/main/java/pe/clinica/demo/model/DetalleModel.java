package pe.clinica.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle")
public class DetalleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer _ID_detalle;
    @ManyToOne
    @JoinColumn(name = "ID_Receta")
    private RecetaMedicaModel receta;
    @ManyToOne
    @JoinColumn(name = "ID_Medicamento")
    private MedicamentoModel medicamento;
    private Integer _Cantidad;
    private Integer _Unidad;
    private String _Instrucciones;
    private String _Dosis;

    public Integer get_ID_detalle() {
        return _ID_detalle;
    }

    public void set_ID_detalle(Integer _ID_detalle) {
        this._ID_detalle = _ID_detalle;
    }

    public Integer get_Cantidad() {
        return _Cantidad;
    }

    public void set_Cantidad(Integer _Cantidad) {
        this._Cantidad = _Cantidad;
    }

    public Integer get_Unidad() {
        return _Unidad;
    }

    public void set_Unidad(Integer _Unidad) {
        this._Unidad = _Unidad;
    }

    public String get_Instrucciones() {
        return _Instrucciones;
    }

    public void set_Instrucciones(String _Instrucciones) {
        this._Instrucciones = _Instrucciones;
    }

    public String get_Dosis() {
        return _Dosis;
    }

    public void set_Dosis(String _Dosis) {
        this._Dosis = _Dosis;
    }
}
