import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Listas
        /*
            Entre interfaces, al here4darse entre si, se cumple solo la primer parte del concepto de la herencia
            Reutilización y/o absorción de los miembros de una clase en otra.

            List es una interface
            ArrayList es una clase (tipo específico, una implementación de la interface list)

            clean()
            size()
            indexOf()
            add()
            lastIndexOf()

         */
        List<String> mylista = new ArrayList<String>();

        System.out.println(mylista);

        System.out.println(mylista.size());

        //Añadir un valor.
        mylista.add("Hola");
        mylista.add("que");
        mylista.add("estas");
        mylista.add("padre");
        mylista.add("54845fgh");
        mylista.add("as");
        mylista.add("more");
        System.out.println("Tamaño: " + mylista.size());

        System.out.println(mylista);
        //Obtener un elemento en particular.
        System.out.println(mylista.get(5));
        //Eliminar un elemento
        mylista.remove(2);//por indice
        mylista.remove("que");//pasándole una copia
        //Diferencias de un array --- (estático) arrayList --- (Dinámico)

        System.out.println(mylista);

        System.out.println(mylista.contains("DESDE".toLowerCase()));
        mylista.add("Hola");
        System.out.println(mylista);
        //En que posicion esta un valor
        System.out.println(mylista.indexOf("Hola"));
        //Donde esta la ultima vez que aparece un elemento.
        System.out.println(mylista.lastIndexOf("Hola"));
        //Cuál es la diferencia entre indexOf y el lastIndexOf
        //lastIndexOf empieza de la última posición y va hacia la primera posición del índice.
        //indexOf empieza en el índice cero.


        //Conteo del número total de veces que se repite el valor en este caso "Hola" 2 veces

        mylista.add("Java");
        mylista.add("PhP");
        mylista.add("Python");
        mylista.add("Java");
        mylista.add("Java");
        mylista.add("Python");
        mylista.add("Python");

        int conteo = Collections.frequency(mylista, "Java"); // con metodo solo llamo a Collections.frequency
        System.out.println(conteo);

        int repetidos = contarRepetidos(mylista, "Python"); // Realizo mi objeto x (e).
        System.out.println(repetidos);


        List<Receta> recetas = new ArrayList<Receta>();

        String[] diagnostico = {"Calentura", "Infeccion garganta", "Tos"};
        String[] meds = {"Paracetamol", "Tempra 500", "Alcohol"};
        Receta r1 = new Receta("Pepe", 28, " Av Centenario 27", diagnostico);
        recetas.add(r1);



    }
    public static int contarRepetidos(List lista,Object e){
        int conteo = 0;
        for (Object o : lista){//foreach
            if (o.equals(e)){
                conteo++;
            }
        }
        return conteo;
    }
}
