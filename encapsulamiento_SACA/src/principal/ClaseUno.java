package principal;

public class ClaseUno {
    /* Encapsulamiento
    Ocultar, proteger, restringir el acceso y/o visibilidad de los detalles y de los miembros de una clase a
    traves de 3 niveles, aplicandose 3 modificadores de acceso.
     */
    public String atributo1;
    public String atributo2;
    protected int atributo3;
    protected int atributo4;
    private double atributo6;
    private double atributo5;

    public ClaseUno(){

    }

    public ClaseUno(String atributo1, String atributo2, int atributo3, int atributo4, double atributo6, double atributo5) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
        this.atributo4 = atributo4;
        this.atributo6 = atributo6;
        this.atributo5 = atributo5;
    }

    @Override
    public String toString() {
        return "ClaseUno{" +
                "atributo1='" + atributo1 + '\'' +
                ", atributo2='" + atributo2 + '\'' +
                ", atributo3=" + atributo3 +
                ", atributo4=" + atributo4 +
                ", atributo6=" + atributo6 +
                ", atributo5=" + atributo5 +
                '}';
    }

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    public int getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(int atributo3) {
        this.atributo3 = atributo3;
    }

    public int getAtributo4() {
        return atributo4;
    }

    public void setAtributo4(int atributo4) {
        this.atributo4 = atributo4;
    }

    public double getAtributo6() {
        return atributo6;
    }

    public void setAtributo6(double atributo6) {
        this.atributo6 = atributo6;
    }

    public double getAtributo5() {
        return atributo5;
    }

    public void setAtributo5(double atributo5) {
        this.atributo5 = atributo5;
    }
}
