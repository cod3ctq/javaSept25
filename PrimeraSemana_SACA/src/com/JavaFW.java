package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {
    public static void main(String[] args) {
        //Escritura de archivos utilizando las clases File y FileWriter
        //Necesitamos la informacion que queremos escribir en nuestro archivo.
        String info = "\nFin de la semana uno";
        try {
            File archivo = new File("E:\\Escritorio\\fichero.txt");
            //Necesitamos a la clase FileWriter para poder pasarle el valor del archivo que va a escribir.
            FileWriter line = new FileWriter(archivo, true); // con el valor true se conserva el contenido del archivo y solo se anexa la info que enviamos
            //Escribimos nuestro String en nuestro archivo
            line.write(info);
            //Para guardar la info
            line.close();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
