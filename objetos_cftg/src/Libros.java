public class Libros {

    String titulo;
    String autor;
    int añoPublicacion;
    int paginas;
    String genero;

    public Libros (){}

    public Libros(String titulo, String autor, int añoPublicacion, int paginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.paginas = paginas;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", paginas=" + paginas +
                ", genero='" + genero + '\'' +
                '}';
    }
}

