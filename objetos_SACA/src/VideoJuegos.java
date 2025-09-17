public class VideoJuegos {

    String nombreJuego;
    String plataforma;
    String clasificacionJuego;
    double costo;
    int usuarios;

    //Constructor vacio.
    public VideoJuegos (){

    }
    //Constructor Lleno
    public VideoJuegos(String nombreJuego, String plataforma, String clasificacionJuego, double costo, int usuarios) {
        this.nombreJuego = nombreJuego;
        this.plataforma = plataforma;
        this.clasificacionJuego = clasificacionJuego;
        this.costo = costo;
        this.usuarios = usuarios;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setClasificacionJuego(String clasificacionJuego) {
        this.clasificacionJuego = clasificacionJuego;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }
    //Impresión del estado del objeto
    @Override
    public String toString() {
        return "VideoJuegos{" +
                "nombreJuego='" + nombreJuego + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", clasificacionJuego='" + clasificacionJuego + '\'' +
                ", costo=" + costo +
                ", usuarios=" + usuarios +
                '}';
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public int getUsuarios() {
        return usuarios;
    }

    public double getCosto() {
        return costo;
    }

    public String getClasificacionJuego() {
        return clasificacionJuego;
    }

    public String getPlataforma() {
        return plataforma;
    }
}
