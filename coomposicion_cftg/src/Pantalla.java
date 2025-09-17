public class Pantalla {

    String resolucion;
    int lumens;
    double pulgadas;
    String tipo;

    public Pantalla(){}

    public Pantalla(String resolucion, int lumens, double pulgadas, String tipo) {
        this.resolucion = resolucion;
        this.lumens = lumens;
        this.pulgadas = pulgadas;
        this.tipo = tipo;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getLumens() {
        return lumens;
    }

    public void setLumens(int lumens) {
        this.lumens = lumens;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "resolucion='" + resolucion + '\'' +
                ", lumens=" + lumens +
                ", pulgadas=" + pulgadas +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
