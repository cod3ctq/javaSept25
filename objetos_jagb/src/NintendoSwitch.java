public class NintendoSwitch {

    String marca, modelo, color, version;
    double tamañopantalla, precio;
    int memoria;


    public NintendoSwitch (){}

    public NintendoSwitch(String marca, String modelo, String color, String version, double tamañopantalla, double precio, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.version = version;
        this.tamañopantalla = tamañopantalla;
        this.precio = precio;
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getTamañopantalla() {
        return tamañopantalla;
    }

    public void setTamañopantalla(double tamañopantalla) {
        this.tamañopantalla = tamañopantalla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "NintendoSwitch{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", version='" + version + '\'' +
                ", tamañopantalla=" + tamañopantalla +
                ", precio=" + precio +
                ", memoria=" + memoria +
                '}';
    }
}
