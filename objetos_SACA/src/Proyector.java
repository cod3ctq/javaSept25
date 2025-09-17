public class Proyector {
    /*
      Herencia
      Encapsulamiento
      Abstracción -
      Polimorfismo
       */
    //Atributos - QUE
    String marca;
    String modelo;
    double precio;
    double tamañoProyeccion;
    double distancia;
    int lumens;

    //Miembros por default
    //Mecanismo para establecer valores iniciales a los objetos.
    public Proyector() {  //Constructor vacio - 0 argumentos

    }

    public Proyector(String marca, String modelo, double precio, double tamañoProyeccion, double distancia, int lumens) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tamañoProyeccion = tamañoProyeccion;
        this.distancia = distancia;
        this.lumens = lumens;
    }

    public void setLumens(int lumens) {
        this.lumens = lumens;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTamañoProyeccion(double tamañoProyeccion) {
        this.tamañoProyeccion = tamañoProyeccion;
    }

    //Permite imprimir el estado del objeto
    @Override
    public String toString() {
        return "Proyector{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", tamañoProyeccion=" + tamañoProyeccion +
                ", distancia=" + distancia +
                ", lumens=" + lumens +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public double getTamañoProyeccion() {
        return tamañoProyeccion;
    }

    public double getDistancia() {
        return distancia;
    }

    public int getLumens() {
        return lumens;
    }


    //Comportamiento - COMO

    //Es un modelo que contiene el que y como de los objetos

}
