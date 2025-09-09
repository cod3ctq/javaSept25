import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/* proyector
        //Crear un objeto de la clase

        //Crea una nueva instancia del objeto, invocando su estado ´vacio´
        Proyector pro = new Proyector();

        //Crea una nueva instancia del objeto, invocando su estado ´lleno´
        Proyector pro2 = new Proyector("Epson", "Ep1", 7892.3, 115.5,10.0,7000);

        System.out.println(pro);
        System.out.println(pro2);

        // LLenae el objeto vacio
        pro.setMarca("Hp");
        pro.setPrecio(5678.12);
        pro.setLumens(3000);
        pro.setDistancia(12.00);
        pro.setTamañoProyeccion(95.00);
        pro.setModelo("Hp1");
        System.out.println(pro);

        //Extraer informacion de un onjeto

        System.out.println("Marca: "+pro.getMarca());
        System.out.println("Distancia: "+pro.getDistancia());
        System.out.println("Lumenes: "+pro.getLumens());


        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa la marca");
        String marca = scan.nextLine();
        System.out.println("ingresa el modelo");
        String modelo = scan.nextLine();
        System.out.println("ingresa el precio");
        double precio = scan.nextDouble();
        System.out.println("ingresa el tamaño");
        double tamaño = scan.nextDouble();
        System.out.println("ingresa la distancia");
        double distancia = scan.nextDouble();
        System.out.println("ingresa los lumenes");
        int lumenes = scan.nextInt();

        Proyector pro3 = new Proyector(marca,modelo,precio,tamaño,distancia,lumenes);
        System.out.println(pro3);
*/
        //modelar 'algo, crear la clase y un par de objetos en la clase main
        //usando el constructor vacio y el lleno ademas de getter y setters
        Scanner scan = new Scanner(System.in);

        System.out.println("------Consolas de Videojuegos------");
        NintendoSwitch ns = new NintendoSwitch();
        System.out.println(ns);

        ns.setMarca("nintendo");
        ns.setModelo("switch1");
        ns.setColor("negro");
        ns.setMemoria(32);
        ns.setTamañopantalla(7.6);
        ns.setPrecio(698.66);
        ns.setVersion("lite");

        System.out.println("Marca: "+ns.getMarca());
        System.out.println("Modelo: "+ns.getModelo());
        System.out.println("Color: "+ns.getColor());
        System.out.println("Version: "+ns.getVersion());
        System.out.println("Precio: "+ns.getPrecio());
        System.out.println("Tamaño de Pantalla: "+ns.getTamañopantalla());
        System.out.println("Memoria: "+ns.getMemoria()+"gb");

        NintendoSwitch ns2 = new NintendoSwitch("nintnedo switch","Switch1", "azul","full", 7.5,6599.33,32);

      /*  System.out.print("Ingresa el Nombre de la consola: ");
        String nombre = scan.nextLine();
        System.out.print("Ingresa el Modelo: ");
        String modelo = scan.nextLine();
        System.out.print("Ingresa el Color: ");
        String color = scan.nextLine();
        System.out.print("Ingresa la Version: ");
        String version = scan.nextLine();
        System.out.print("Ingresa el Tamaño de la pantalla: ");
        double pantalla = scan.nextDouble();
        System.out.print("Ingresa el Precio: ");
        double precio = scan.nextDouble();
        System.out.print("Ingresa la capacidad de memoria: ");
        int memoria = scan.nextInt();



        NintendoSwitch ns3 = new NintendoSwitch(nombre,modelo,color,version,pantalla,precio,memoria);
        System.out.println(ns3);*/
    }
}