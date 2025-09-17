public class Main {
    public static void main(String[] args) {

        /*
            Static - final
         */
        Iphone ip1= new Iphone("Negro", 1024, 16.3);
        Iphone ip2= new Iphone("Blanco", 1024, 17.3);
        Iphone ip3= new Iphone("Azul", 1024, 18);

        //Los miembros estáticos (static) ya sea atributos o metodos pueden ser accedidos a traves de llamar únicamente a la clase.
        System.out.println(Iphone.fabricante);//Acceso al atributo estatico.
        System.out.println(Iphone.getFabricante());//Acceso a metodo estatico.

        //int x = Integer.parseInt("300");
        Iphone.fabricante = "Xiaomi";

        Iphone ip4 = new Iphone();
        Iphone ip5 = new Iphone();
        Iphone ip6 = new Iphone();
        //Todas las instancias hechas después del cambio, se ven afectados por esta acción.
        //Incluidas las que se hicieron antes.
        System.out.println(ip4.getFabricante());
        System.out.println(ip5.getFabricante());
        System.out.println(ip6.getFabricante());
        System.out.println(ip1.getFabricante());
        //No es posible reasignar una contante (atributo final).
        //Iphone.SISTEMA_OPERATIVO= "32674298sbfauigh";

        /*
            El modificador final tiene 3 niveles de accion:
            1.- Nivel de atributo: Crea CONSTANTES.
            2.-Nivel de Metodo: Impide la sobreescritura.
            3.- Nivel de clase: Bloquea la herencia.
         */


        //Sealed, permits


    }
}
