import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Crear un objeto de la clase

        //Crea una nueva instanciaa del objeto invocando su estado 'vacio'
        Proyector pro = new Proyector();
        System.out.println(pro);

        Proyector pro2 = new Proyector("Epson","EP1",7892.3,115.5,10.0,7000);
        System.out.println(pro2);

        //Llenar al objeto vacio
        pro.setMarca("Hp");
        pro.setPrecio(5678.12);
        pro.setDistancia(12.0);
        pro.setLumens(3000);
        pro.setTamañoProyeccion(95.00);

        //Extraer informacion de un objeto
        System.out.println(pro.getMarca());
        System.out.println(pro.getDistancia());
        System.out.println(pro.getLumens());

        Scanner scan = new Scanner(System.in);

//        System.out.printf("Ingresa la marca: ");
//        String marca = scan.nextLine();
//        System.out.printf("Ingresa el modelo: ");
//        String modelo = scan.nextLine();
//        System.out.printf("Ingresa el precio: ");
//        double precio = scan.nextDouble();
//        System.out.printf("Ingresa el tamaño: ");
//        double tamaño = scan.nextDouble();
//        System.out.printf("Ingresa la distancia: ");
//        double distancia = scan.nextDouble();
//        System.out.printf("Ingresa los lumens: ");
//        int lumens = scan.nextInt();
//
//        Proyector pro3= new Proyector(marca,modelo,precio,tamaño,distancia,lumens);
//        System.out.println(pro3);

//        modelar 'algo' crear la clase y un par de  objetos en la clase main
//        usando el constructor vacio y el lleno, ademas getter y setters

        System.out.printf(pro.getMarca());

//        Botella  bo = new Botella();
//
//        Botella bo2 = new Botella("Bonafon",1000.0,true,"plastico");
//        System.out.println(bo2);
//
//        System.out.printf("Ingresa la marca: ");
//        String marc = scan.nextLine();
//        bo.setMarca(marc);
//        System.out.printf("Ingresa el tamaño: ");
//        double tam = scan.nextDouble();
//        bo.setTamaño(tam);
//        System.out.printf("¿Purificada?: ");
//        boolean pr = scan.nextBoolean();
//        bo.setPurificada(pr);
//        scan.nextLine();
//        System.out.printf("Material: ");
//        String material = scan.nextLine();
//        bo.setMaterial(material);
//
//        Botella bo3 = new Botella(marc,tam,pr,material);
//
//        System.out.printf("Marca: "+bo.getMarca()+"\n Tamaño: "+bo.getTamaño()+"\n¿Purificada?: "+bo.isPurificada()+"\n Material: "+bo.getMaterial());

    }
}
