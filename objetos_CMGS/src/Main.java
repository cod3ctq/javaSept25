import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crear un objeto de la clase
        //Clase  objeto =  valor
//        String mensaje="coshoashosic";
//
//        //Crea una nueva instancia del objeto, invocando su estado 'vacio'
//        Proyector pro = new Proyector();
//        System.out.println(pro);
//
//        Proyector pro2 = new Proyector("EP1", "Epson", 7892.3, 115.5, 10.0, 7000);
//        System.out.println(pro2);
//
//        //Lenar al objeto vacio
//        pro.setMarca("Hp");
//        pro.setPrecio(5678.12);
//        pro.setModelo("M12");
//        pro.setLumens(3000);
//        pro.setTamañoProyeccion(95.00);
//        pro.setDistacia(12.00);
//
//        //Extraer informacion de un objeto
//        System.out.println(pro.getMarca());
//        System.out.println(pro.getModelo());
//        System.out.println(pro.getLumens());
//        System.out.println(pro.getDistacia());
//        System.out.println(pro.getPrecio());
//        System.out.println(pro.getTamañoProyeccion());
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Ingresa la marca");
//        String marca = scan.nextLine();
//        System.out.println("Ingresa el modelo");
//        String modelo = scan.nextLine();
//        System.out.println("Ingresa el precio");
//        double precio = scan.nextDouble();
//        System.out.println("Ingresa la distacia");
//        double distancia = scan.nextDouble();
//        System.out.println("Ingresa el tamaño");
//        double tamaño = scan.nextDouble();
//        System.out.println("Ingresa los lumens");
//        int lumnes = scan.nextInt();
//
//        Proyector pro3 = new Proyector(modelo, marca, tamaño, precio, distancia, lumnes);
//        System.out.println(pro3);

        //Modelar 'algo', crear la clase y un par de objetos en la clase main
        //usando el contructor vacio y el lleno ademas de getters setters


        Casa cas1 = new Casa();
        System.out.println(cas1);

        Casa casa2 = new Casa(150.50, 4, "Azul", 1200000.00, "Puebla", 2);
        System.out.println(casa2);

        cas1.setColor("Rojo");
        cas1.setnBaños(4);
        cas1.setnCuartos(5);
        cas1.setPrecio(897000.34);
        cas1.setTamaño(98);
        cas1.setUbicacion("Queretaro");

        System.out.println(cas1.getColor());
        System.out.println(cas1.getnBaños());
        System.out.println(cas1.getnCuartos());
        System.out.println(cas1.getPrecio());
        System.out.println(cas1.getTamaño());
        System.out.println(cas1.getUbicacion());

        Scanner sca = new Scanner(System.in);

        System.out.println("Ingresa el tamaño de la casa");
        double medida = sca.nextDouble();
        System.out.println("Ingresa el número de cuartos");
        int cuartos = sca.nextInt();
        System.out.println("Ingresa el color de la casa");
        sca.nextLine(); // Primero se llean los string y despues los numeros o limpiar el buffer con el sca.nextLine
        String color = sca.nextLine();
        System.out.println("Ingresa el precio de la casa");
        double precio = sca.nextDouble();
        System.out.println("Ingresa la ubicación de la casa");
        sca.nextLine();
        String ubicacion = sca.nextLine();
        System.out.println("Ingresa el númerode baños");
        int ban = sca.nextInt();

        Casa casa3 = new Casa(medida, cuartos, color, precio, ubicacion, ban);
        System.out.println(casa3);
    }
}