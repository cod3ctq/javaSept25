public class Camaras {

    String resolucion, tipoLente, valorIso;

    public Camaras(){}

    public Camaras(String resolucion, String tipoLente, String valorIso) {
        this.resolucion = resolucion;
        this.tipoLente = tipoLente;
        this.valorIso = valorIso;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTipoLente() {
        return tipoLente;
    }

    public void setTipoLente(String tipoLente) {
        this.tipoLente = tipoLente;
    }

    public String getValorIso() {
        return valorIso;
    }

    public void setValorIso(String valorIso) {
        this.valorIso = valorIso;
    }

    @Override
    public String toString() {
        return "Camaras{" +
                "resolucion='" + resolucion + '\'' +
                ", tipoLente='" + tipoLente + '\'' +
                ", valorIso='" + valorIso + '\'' +
                '}';
    }
}
