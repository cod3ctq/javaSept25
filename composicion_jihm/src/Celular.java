import java.util.Arrays;

public class Celular {

    String marca;
    String modelo;
    String color;


    Procesador proc; //Atributo compuesto
    Camaras [] cam;
    Pantalla display;

    public Celular(){    }

    public Celular(String marca, String modelo, String color, Procesador proc, Camaras[] cam, Pantalla display) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.proc = proc;
        this.cam = cam;
        this.display = display;
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

    public Procesador getProc() {
        return proc;
    }

    public void setProc(Procesador proc) {
        this.proc = proc;
    }

    public Camaras[] getCam() {
        return cam;
    }

    public void setCam(Camaras[] cam) {
        this.cam = cam;
    }

    public Pantalla getDisplay() {
        return display;
    }

    public void setDisplay(Pantalla display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", proc=" + proc +
                ", cam=" + Arrays.toString(cam) +
                ", display=" + display +
                '}';
    }

    //Encapsulamiento: private - protected - public
    //static - final
    //Colecciones Java : Listas, Sets, Mapas

}
