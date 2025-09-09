import java.util.Arrays;

public class Celular {

    String marca;
    String modelo;
    String color;

    Procesador proc;  //Atributo compuesto
    Pantalla display;
    Camara[] cam;

    public Celular (){

    }

    public Celular(String marca, String modelo, String color, Procesador proc, Pantalla display, Camara[] cam) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.proc = proc;
        this.display = display;
        this.cam = cam;
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

    public Procesador getProc() {
        return proc;
    }

    public void setProc(Procesador proc) {
        this.proc = proc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pantalla getDisplay() {
        return display;
    }

    public void setDisplay(Pantalla display) {
        this.display = display;
    }

    public Camara[] getCam() {
        return cam;
    }

    public void setCam(Camara[] cam) {
        this.cam = cam;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", proc=" + proc +
                ", display=" + display +
                ", cam=" + Arrays.toString(cam) +
                '}';
    }


    //Encapsulamiento: private . protected - public
    //static - final
    //Colecciones Java : Listas, Sets, Mapas
}
