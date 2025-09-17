public class Casa {

    double tamaño;
    int nCuartos;
    String color;
    double precio;
    String ubicacion;
    int nBaños;

    public Casa(){}

    public Casa(double tamaño, int nCuartos, String color, double precio, String ubicacion, int nBaños) {
        this.tamaño = tamaño;
        this.nCuartos = nCuartos;
        this.color = color;
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.nBaños = nBaños;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getnCuartos() {
        return nCuartos;
    }

    public void setnCuartos(int nCuartos) {
        this.nCuartos = nCuartos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getnBaños() {
        return nBaños;
    }

    public void setnBaños(int nBaños) {
        this.nBaños = nBaños;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "tamaño=" + tamaño +
                ", nCuartos=" + nCuartos +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", ubicacion='" + ubicacion + '\'' +
                ", nBaños=" + nBaños +
                '}';
    }
}
