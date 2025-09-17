import java.util.Arrays;

public class Receta {

    String nombre;
    String domicilio;
    int edad;
    String[] diagnostico;
    String[] medicamentos;
    public Receta(String pepe, int i, String s, String[] diagnostico){}

    public Receta(String nombre, String domicilio, int edad, String[] diagnostico, String[] medicamentos) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.edad = edad;
        this.diagnostico = diagnostico;
        this.medicamentos = medicamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String[] diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String[] getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String[] medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", edad=" + edad +
                ", diagnostico=" + Arrays.toString(diagnostico) +
                ", medicamentos=" + Arrays.toString(medicamentos) +
                '}';
    }
}
