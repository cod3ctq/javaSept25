public class Pantalla {

    String resolucion;
    int luminosidad;
    double tamaño;
    String tipo;

    public Pantalla(){

    }

    public Pantalla(String resolucion, int luminosidad, double tamaño, String tipo) {
        this.resolucion = resolucion;
        this.luminosidad = luminosidad;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getLuminosidad() {
        return luminosidad;
    }

    public void setLuminosidad(int luminosidad) {
        this.luminosidad = luminosidad;
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
                "resolucion='" + resolucion + '\'' +
                ", luminosidad=" + luminosidad +
                ", tamaño=" + tamaño +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
