import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear un objeto de la clase.
        //Clase objeto = valor
       /* String mensaje ="dhfushfahf";
        //Crea una nueva instancia del objeto, invocando su estado 'vacío'.
        Proyector pro = new Proyector();
        System.out.println(pro);

        Proyector pro2 = new Proyector("Epson", "EP1", 7999.99, 115.5, 10.0, 7000);
        System.out.println(pro2);

        //Llenar objeto vacío
        pro.setMarca("HP");
        pro.setModelo("HP1");
        pro.setPrecio(4450.50);
        pro.setDistancia(100.00);
        pro.setLumens(1200);
        pro.setTamañoProyeccion(95.00);

        System.out.println(pro.getMarca());
        System.out.println(pro.getDistancia());
        System.out.println(pro.getLumens());
        System.out.println(pro.getPrecio());



        System.out.println("Ingresa la marca");
        String marca =scanner.nextLine();
        System.out.println("Ingresa la modelo");
        String modelo =scanner.nextLine();
        System.out.println("Ingresa la precio");
        double precio =scanner.nextDouble();
        System.out.println("Ingresa la tamaño");
        double tamaño =scanner.nextDouble();
        System.out.println("Ingresa la distancia");
        double distancia =scanner.nextDouble();
        System.out.println("Ingresa la lumens");
        int lumens = scanner.nextInt();

        Proyector pro3 = new Proyector(marca, modelo, precio, tamaño, distancia, lumens);
        System.out.println(pro3);
        */

        //Modelar 'algo' crear la clase y un par de objetos en la clase main usando el constructor vacio y el lleno, ademas de getter y setters.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del juego: ");
        String nombreJuego = scanner.nextLine();
        System.out.println("Ingresa la plataforma: ");
        String plataforma =scanner.nextLine();
        System.out.println("Ingresa la clasificación del juego: ");
        String clasificacionJuego = scanner.nextLine();
        System.out.println("Ingresa el costo del juego: ");
        double costo = scanner.nextDouble();
        System.out.println("Ingresa el numero de usuarios: ");
        int usuarios = scanner.nextInt();

        VideoJuegos vd = new VideoJuegos(nombreJuego, plataforma, clasificacionJuego, costo,usuarios);
        System.out.println(vd);



    }

}
