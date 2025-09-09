import java.util.Arrays;

public class Celular {

    String marca, modelo, color; //<----- Atributo

    Procesador proc; //<----Atributo compuesto
    Pantalla pant;
    Camaras[] cam;

    public Celular(){}

    public Celular(String marca, String modelo, String color, Procesador proc, Pantalla pant, Camaras[] cam) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.proc = proc;
        this.pant = pant;
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

    public Pantalla getPant() {
        return pant;
    }

    public void setPant(Pantalla pant) {
        this.pant = pant;
    }

    public Camaras[] getCam() {
        return cam;
    }

    public void setCam(Camaras[] cam) {
        this.cam = cam;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", proc=" + proc +
                ", pant=" + pant +
                ", cam=" + Arrays.toString(cam) +
                '}';
    }

        /*
        // metodo SOLID: principios para diseñar y desarrolar codigo de calidad (INVESTIGAR)
        // Encapsulamiento: private, protected y public
	            static -final			(INVESTIGAR)
        //Colecciones java : Listas,sets, mapas(INVESTIGAR).
         */

    /*
    Procesador
    Memoria
    Camaras
    Almacenamiento
    Pantalla
     */
}
