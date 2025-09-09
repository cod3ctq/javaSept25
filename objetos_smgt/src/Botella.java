public class Botella {

    String marca;
    double tamaño;
    boolean purificada;
    String material;


    //Constructor vacio
    public Botella(){}

 public Botella(String marca, double tamaño, boolean purificada, String material) {
            this.marca = marca;
            this.tamaño = tamaño;
            this.purificada = purificada;
            this.material = material;
        }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isPurificada() {
        return purificada;
    }

    public void setPurificada(boolean purificada) {
        this.purificada = purificada;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Botella{" +
                "marca='" + marca + '\'' +
                ", tamaño=" + tamaño +
                ", prurificada=" + purificada +
                ", material='" + material + '\'' +
                '}';
    }
}

