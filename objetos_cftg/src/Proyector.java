//Modelo que contiene el QUE y COMO de los objetos
public class Proyector {

    /*
    Herencia
    Encapsulamientos
    Abstracción
    Polimorfismo
     */

        //Atributos - QUE
        String marca;
        String modelo;
        double precio;
        double tamañoProyeccion;
        double distancia;
        double lumens;

        //Miembros por default
        //Mecanismo para establecer valores iniciales a los objetos
        public Proyector(){  } //Consultor vacio - 0 argumentos

    // Constructor lleno
    public Proyector(String marca,String modelo,double precio , double tamañoProyeccion, double distancia, double lumens) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.tamañoProyeccion = tamañoProyeccion;
        this.distancia = distancia;
        this.lumens = lumens;
    }
    //Getters y Setters

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

    public double getLumens() {
        return lumens;
    }

    public void setLumens(double lumens) {
        this.lumens = lumens;
    }

    //Comportamiento - COMO


    @Override
    public String toString() {  //Permite imprimir el estado del objeto
        return "Proyector{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", tamañoProyeccion=" + tamañoProyeccion +
                ", distancia=" + distancia +
                ", lumens=" + lumens +
                '}';
    }
}

