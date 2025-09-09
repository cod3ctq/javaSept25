import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Crear un objeto de la clase
        //Clase objeto = valor

        //Crea una nueva instancia del objeto, invocando su estado 'vacio'
//        Proyector pro = new Proyector();
//        System.out.println(pro);
//
//
//        Proyector pro2 = new Proyector("Epson", "EP1", 7892.3, 115.5, 10.0, 7000);
//        System.out.println(pro2);
//
//        //Llenar al objeto vacio (setter)
//        pro.setMarca("Hp");
//        pro.setPrecio(5678.12);
//        pro.setDistancia(12.00);
//        pro.setLumens(3000);
//        pro.setTamañoProyeccion(95.00);
//
//
//
//        //Extraer informacion de un objeto (getter)
//        System.out.println("La marca es: " + pro.getMarca());
//        System.out.println(pro.getDistancia());
//        System.out.println(pro.getLumens());
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Ingresa la marca");
//        String marca = scan.nextLine();
//        System.out.println("Ingresa el modelo");
//        String modelo = scan.nextLine();
//        System.out.println("Ingresa el precio");
//        double precio = scan.nextDouble();
//        System.out.println("Ingresa el tamaño");
//        double tamaño = scan.nextDouble();
//        System.out.println("Ingresa la distancia");
//        double distancia = scan.nextDouble();
//        System.out.println("Ingresa el lumens");
//        int lumens = scan.nextInt();
//
//
//
//        Proyector pro3 = new Proyector(marca, modelo, precio, tamaño, distancia, lumens);
//        System.out.println(pro3);




        Laptop lap = new Laptop();
        System.out.println(lap);

        Laptop lap2 = new Laptop("DELL", "7094", 16, "intel icore5", 13000.00);
        System.out.println(lap2);

        //llenar el objeto
        lap.setMarca("HP");
        lap.setModelo("H2");
        lap.setPrecio(17000.00);
        lap.setRam(32);
        lap.setProcesador("INTEL CORE I5 9GEN");

        //Extraer los datos
        System.out.println("La marca es: " + lap.getMarca());
        System.out.println("El modelo es: " + lap.getModelo());
        System.out.println("El precio es: " + lap.getPrecio());
        System.out.println("Tiene " + lap.getRam() + "GB de ram");
        System.out.println("Su procesaor es: " + lap.getProcesador());


        Scanner scan2 = new Scanner(System.in);

        System.out.println("Ingresa la marca: ");
        String marca2 = scan2.nextLine();
        System.out.println("Ingresa el modelo: ");
        String modelo2 = scan2.nextLine();
        System.out.println("Ingresa la ram: ");
        int ram = scan2.nextInt();
        scan2.nextLine();
        System.out.println("Ingresa su procesador: ");
        String procesador = scan2.nextLine();
        System.out.println("Ingresa el precio: ");
        double precio2 = scan2.nextDouble();




        Laptop lap3 = new Laptop(marca2, modelo2, ram, procesador, precio2);
        System.out.println(lap3);
    }
}