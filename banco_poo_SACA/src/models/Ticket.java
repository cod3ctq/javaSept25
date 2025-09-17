package models;

import java.util.Date;

public class Ticket {

    private int folio;
    private Date fechaHora;
    private double monto;
    private String tipoOperacion;
    private String direccion;

    public Ticket(){

    }

    public Ticket(int folio, Date fechaHora, double monto, String tipoOperacion, String direccion) {
        this.folio = folio;
        this.fechaHora = fechaHora;
        this.monto = monto;
        this.tipoOperacion = tipoOperacion;
        this.direccion = direccion;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "folio=" + folio +
                ", fechaHora=" + fechaHora +
                ", monto=" + monto +
                ", tipoOperacion='" + tipoOperacion + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
