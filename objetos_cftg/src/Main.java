import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Crear un objeto de la clase

        //Crea una nueva instancia del objeto, invocando su estado vacío
        Proyector pro = new Proyector();
        System.out.println(pro);

        Proyector pro2 = new Proyector("EPSON","EP1",7892.3,105.5,10.0,88 );
        System.out.println(pro2);

        //Llenar al objeto vacio
        pro.setMarca("Hp");
        pro.setPrecio(5678.12);
        pro.setDistancia(12.00);
        pro.setLumens(3000);
        pro.setTamañoProyeccion(95.00);

        //Extraer información de un objeto
        System.out.println(pro.getMarca());
        System.out.println(pro.getPrecio());
        System.out.println(pro.getLumens());

        Scanner scan = new Scanner(System.in);

//        System.out.println("Ingresa la marca: ");
//        String marca = scan.nextLine();
//        System.out.println("Ingresa la modelo: ");
//        String modelo = scan.nextLine();
//        System.out.println("Ingresa la precio: ");
//        double precio = scan.nextDouble();
//        System.out.println("Ingresa la tamaño: ");
//        double tamañoProyeccion = scan.nextDouble();
//        System.out.println("Ingresa la distancia: ");
//        double distancia = scan.nextDouble();
//        System.out.println("Ingresa la lumens: ");
//        double lumens = scan.nextDouble();
//
//        Proyector pro3 = new Proyector(marca,modelo,precio,tamañoProyeccion,distancia,lumens);
//        System.out.println(pro3);

        //Modelar algo aplicando esto y un par de objetos
        // en la clase main usando el constructor vacio y el lleno,
        //ademas de getter y setter

        Libros lib = new Libros();
        Libros lib2 = new Libros("El señor de los anillos","J.R.R.Tolkien", 1954, 1662, "Alta fantasi");
        System.out.println(lib2 );

        System.out.println("Ingresa el título: ");
        String titulo = scan.nextLine();
        System.out.println("Ingresa el autor: ");
        String autor = scan.nextLine();
        System.out.println("Ingresa la año que se publico: ");
        int añoPublicacion = scan.nextInt();
        System.out.println("Cuantas paginas tiene: ");
        int paginas = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingresa la genero es: ");
        String genero = scan.nextLine();

        Libros lib3 = new Libros(titulo,autor,añoPublicacion,paginas,genero);
        System.out.println(lib3);
    }
}
