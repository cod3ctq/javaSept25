package models;

public class Recibo {


    private String domicilio;
    private String periodo;
    private String numServicio;
    private String cliente;
    private double monto;
    private boolean pagado;


    public Recibo(String domicilio, String periodo, String numServicio, String cliente, double monto, boolean pagado) {
        this.domicilio = domicilio;
        this.periodo = periodo;
        this.numServicio = numServicio;
        this.cliente = cliente;
        this.monto = monto;
        this.pagado = pagado;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getNumServicio() {
        return numServicio;
    }

    public void setNumServicio(String numServicio) {
        this.numServicio = numServicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Recibo{" +
                "domicilio='" + domicilio + '\'' +
                ", periodo='" + periodo + '\'' +
                ", numServicio='" + numServicio + '\'' +
                ", cliente='" + cliente + '\'' +
                ", monto=" + monto +
                ", pagado=" + pagado +
                '}';
    }
}
