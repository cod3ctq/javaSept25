package com;

import com.sun.tools.javac.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {
    public static void main(String[] args) {
        //File, FileReader y BufferedReader para acceder a un archivo y leer su contenido
        //Vamos a declarar un string donde almacenar la informacion que vamos a leer
        String linea;
        /* try and catch - Es una estructura que se utiliza para manejar execpsiones.
        Nos permite intentar ejecutar un bloque de codigo que se a suceptible de que lance una excepcion,
        pero en su lugar atrapa el mensaje de esa excepcion y nos permite ejecutar otro bloque.
        */
        try {
            File archivo = new File("E:\\Escritorio\\fichero.txt");
            //Vamos a abrir el archivo en modo lectura gracias a la calse FileReader.
            FileReader fr = new FileReader(archivo);
            //Necesitamos leer la información el archivo y lo hacemos con la calse BufferedReader.
            BufferedReader buffer = new BufferedReader(fr);
            //Procedemos a leer la información del archivo y guardarla en nuestro string
            //linea = buffer.readLine();
            //System.out.println(linea);
            //Visualizamos la info obtenida en consola.

            //Si queremos imprimir lo que aparece en el archivo txt hacemos un ciclo.
            while ((linea = buffer.readLine())!=null){
                System.out.println(linea);
            }

        } catch (Exception e) { // Si algo falla, se atrapa aqui
             // y se ejecuta este otro bloque.
            //System.out.println("No se encontro el archivo.");

            //Si quiero mandar a imprimir intencionalmente nuevamente la excepcion lo podemos hacer asi.
            e.printStackTrace();


        }
    }
}




