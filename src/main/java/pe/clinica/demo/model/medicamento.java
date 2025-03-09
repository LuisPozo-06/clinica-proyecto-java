package pe.clinica.demo.model;

public class medicamento {
    private int medicamentoId;
    private String medicamentoNombre;
    private String medicamentoDescripcion;
    private String medicamentoTipo;

    public medicamento(int medicamentoId, String medicamentoNombre, String medicamentoDescripcion, String medicamentoTipo) {
        this.medicamentoId = medicamentoId;
        this.medicamentoNombre = medicamentoNombre;
        this.medicamentoDescripcion = medicamentoDescripcion;
        this.medicamentoTipo = medicamentoTipo;
    }

    public int getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(int medicamentoId) {
        this.medicamentoId = medicamentoId;
    }

    public String getMedicamentoNombre() {
        return medicamentoNombre;
    }

    public void setMedicamentoNombre(String medicamentoNombre) {
        this.medicamentoNombre = medicamentoNombre;
    }

    public String getMedicamentoDescripcion() {
        return medicamentoDescripcion;
    }

    public void setMedicamentoDescripcion(String medicamentoDescripcion) {
        this.medicamentoDescripcion = medicamentoDescripcion;
    }

    public String getMedicamentoTipo() {
        return medicamentoTipo;
    }

    public void setMedicamentoTipo(String medicamentoTipo) {
        this.medicamentoTipo = medicamentoTipo;
    }
}
