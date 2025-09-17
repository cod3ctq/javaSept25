import java.util.HashMap;
import java.util.Map;

public class PracticaMapas {
    public static void main(String[] args) {
        //Mapas
        /*
        Map vs HashMap
            Map es suna interface
            HashMap es una clase que implement dicha interface.
         */
        Map<String, String> datos = new HashMap<String, String>();

        datos.put("1231464","Pepe calle1 estudiante");
        datos.put("21165312","Carlos calle2 comerciante");
        datos.put("13647235","Lorena calle3 abogado");
        datos.put("423786321","Katia calle4 doctor");
        datos.put("1231454464","Luis calle5 policia");

        //Imprimir el tamaño del mapa
        System.out.println(datos.size()); //5
        //Obtener un elemento en particular
        System.out.println(datos.get("1231464")); //Pepe calle1 estudiante
        //Eliminar un elemento por la llave
        datos.remove("13647235");

        datos.remove("1231464", "Pepe calle1 estudiante");

        //Impprime el contenido del mapa
        System.out.println(datos);
        //foreach
        for (String temp: datos.keySet()){ // devuelve solo la columna de las llaves
            System.out.println(datos.get(temp));
        }

        for (String value: datos.values()){ // values() devuelve solo la colomna de los valores
            System.out.println(value);
        }

        //Averiguar si existe una determinada llave dentro del mapa.
        System.out.println(datos.containsKey("1231464"));

        //Remplaza el valor viejo por nuevo
        datos.replace("21165312", "Carlos calle2 comerciante","hola");



    }




}
