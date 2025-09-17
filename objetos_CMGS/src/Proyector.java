// Una clase es un modelo que contiene el QUE y COMO de los objetos que vamos a hacer despues
public class Proyector {

    /*
    Herencia
    Encapsulamiento
    Abstraccion -
    Polimorfismo
    */


    //Atributos - QUE
    String marca;
    String modelo;
    double precio;
    double tamañoProyeccion;
    double distacia;
    int lumens;

    //Miembros por default
    public Proyector(){ }//Constructor vacio - 0 argunmentos

    //Constructor lleno
    public Proyector(String modelo, String marca, double tamañoProyeccion, double precio, double distacia, int lumens) {
        this.modelo = modelo;
        this.marca = marca;
        this.tamañoProyeccion = tamañoProyeccion;
        this.precio = precio;
        this.distacia = distacia;
        this.lumens = lumens;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTamañoProyeccion() {
        return tamañoProyeccion;
    }

    public void setTamañoProyeccion(double tamañoProyeccion) {
        this.tamañoProyeccion = tamañoProyeccion;
    }

    public double getDistacia() {
        return distacia;
    }

    public void setDistacia(double distacia) {
        this.distacia = distacia;
    }

    public int getLumens() {
        return lumens;
    }

    public void setLumens(int lumens) {
        this.lumens = lumens;
    }

    @Override
    public String toString() { //Permite imprimir el estado del objeto
        return "Proyector{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", precio=" + getPrecio() +
                ", tamañoProyeccion=" + getTamañoProyeccion() +
                ", distacia=" + getDistacia() +
                ", lumens=" + getLumens() +
                '}';
    }
//Comportamineto _ COMO


}
