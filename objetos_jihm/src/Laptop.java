public class Laptop {

    //Atributos
    String marca;
    String modelo;
    int ram;
    String procesador;
    double precio;

    public Laptop() {     }


    public Laptop(String marca, String modelo, int ram, String procesador, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.procesador = procesador;
        this.precio = precio;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ram=" + ram +
                ", procesador='" + procesador + '\'' +
                ", precio=" + precio +
                '}';
    }
}
