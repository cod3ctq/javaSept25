public class Iphone {

    //Miembrtos de clase: Desde la calse se les asigna el valor, el cual es intrinseco del concepto modelado.
    public static final String SISTEMA_OPERATIVO = "iOs"; //Miembro de clase, ademas es inmutable.
    public static String fabricante = "Apple";
    public static String logo = "Manzana";

    //Atributos de instancia: Valores que pueden ser distintos en cada objeto hecho de la clase.

    public String color;
    public int almacenamiento;
    public double version;

    public Iphone(){}

    public Iphone(String color, int almacenamiento, double version) {
        this.color = color;
        this.almacenamiento = almacenamiento;
        this.version = version;
    }


    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Iphone.fabricante = fabricante;
    }

    public static String getLogo() {
        return logo;
    }

    public static void setLogo(String logo) {
        Iphone.logo = logo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "color='" + color + '\'' +
                ", almacenamiento=" + almacenamiento +
                ", version=" + version +
                '}';
    }
}
