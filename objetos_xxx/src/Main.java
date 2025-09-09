import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crear un objeto de la clase
        //Clase objeto = valor
        String mensaje="gfddfdfdfdfgdf";

        //Crea una nueva instancia del objeto, invocando su estado 'vacio'
        Proyector pro = new Proyector();
        System.out.println(pro);

        Proyector pro2 = new Proyector("Epson", "EP1", 7892.3,115.5, 10.0, 7000);
        System.out.println(pro2);

        //Llenar al objeto vacio
        pro.setMarca("Hp");
        pro.setPrecio(5678.12);
        pro.setDistancia(12.00);
        pro.setLumens(3000);
        pro.setTamañoProyeccion(95.00);

        //Extraer informacion de un objeto
        System.out.println("La marca es: "+pro.getMarca());
        System.out.println(pro.getDistancia());
        System.out.println(pro.getLumens());

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Ingresa la marca");
//        String marca = scan.nextLine();
//        System.out.println("Ingresa el modelo");
//        String modelo = scan.nextLine();
//        System.out.println("Ingresa el precio");
//        double precio = scan.nextDouble();
//        System.out.println("Ingresa el tamaño");
//        double tamaño= scan.nextDouble();
//        System.out.println("Ingresa la distancia");
//        double distancia = scan.nextDouble();
//        System.out.println("Ingresa los lumens");
//        int lumens =scan.nextInt();
//        Proyector pro3 = new Proyector(marca,modelo, precio, tamaño, distancia, lumens);
//        System.out.println(pro3);

        //Modelar 'algo', crear la clase y un par de objetos en la clase main
        //usando el constructor vacio y el lleno, ademas de getter y setters

        System.out.println("Hp");









    }
}