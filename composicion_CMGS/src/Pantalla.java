public class Pantalla {

    String resolucion;
    int lumens;
    double tamaño;
    String tipo;

    public Pantalla (){}

    public Pantalla(String resolucion, int lumens, double tamaño, String tipo) {
        this.resolucion = resolucion;
        this.lumens = lumens;
        this.tamaño = tamaño;
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

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
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
                "resolucion='" + getResolucion() + '\'' +
                ", lumens=" + getLumens() +
                ", tamaño=" + getTamaño() +
                ", tipo='" + getTipo() + '\'' +
                '}';
    }
}
