public class Pantalla {

        String resolucion, tipo;
        int lumens;
        double tamaño;

        public Pantalla(){}

    public Pantalla(String resolucion, String tipo, int lumens, double tamaño) {
        this.resolucion = resolucion;
        this.tipo = tipo;
        this.lumens = lumens;
        this.tamaño = tamaño;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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


    @Override
    public String toString() {
        return "Pantalla{" +
                "resolucion='" + resolucion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", lumens=" + lumens +
                ", tamaño=" + tamaño +
                '}';
    }
}
