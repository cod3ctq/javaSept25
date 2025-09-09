//Es un modelo que contiene el QUE y COMO de los objetos
public class Proyector {

    /*
    Herencia
    Encapsulamiento se aplico con setter y getters
    Abstraccion - son los atributos (lo mas importante) desmenusar lo que necesitas
    Polimorfismo - variante es que hay atributos vacios, llenos y medio llenos
     */



    //Atributos - QUE
    String marca;
    String modelo;
    double precio;
    double tamañoProyeccion;
    double distancia;
    int lumens;



    //Miembros por default
    //Mecanismo para establecer valores iniciales a los objetos

    public  Proyector() {  } //Constructor vacio - 0 argumentos

    //Constructor lleno
    public Proyector(String marca, String modelo, double precio, double tamañoProyeccion, double distancia, int lumens) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tamañoProyeccion = tamañoProyeccion;
        this.distancia = distancia;
        this.lumens = lumens;
    }
    //Los metodos void no devuelven nada
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

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getLumens() {
        return lumens;
    }

    public void setLumens(int lumens) {
        this.lumens = lumens;
    }


    @Override
    public String toString() {//Permite imprimir el estado del objeto
        return "Proyector{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", tamañoProyeccion=" + tamañoProyeccion +
                ", distancia=" + distancia +
                ", lumens=" + lumens +
                '}';
    }

    //Comportamiento - COMO



}
