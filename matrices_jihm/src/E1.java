import java.util.Arrays;

public class E1 {
    public static void main(String[] args) {

        String[][] matrizA = {
                {"7", "B", "2", "H", "9"},
                {"C", "0", "E", "5", "1"},
                {"A", "6", "F", "D", "3"},
                {"8", "G", "4", "I", "2"},
                {"J", "7", "K", "0", "L"}
        };

        String[][] matrizB = {
                {"5", "M", "N", "3", "O"},
                {"P", "8", "Q", "1", "R"},
                {"2", "S", "6", "T", "9"},
                {"U", "0", "V", "4", "W"},
                {"X", "7", "Y", "Z", "5"}
        };

        int[][] matrizC = new int[5][5];
        int n1, n2=0;

        String numeros = "123456789";

        for (int filas = 0; filas < matrizA.length; filas++) {
            for (int columnas = 0; columnas<matrizA[filas].length; columnas++) {

                //Maneja errores en tiempo de ejecucion
                try{//intenta hacer esto...
                    n1 = Integer.parseInt(matrizA[filas][columnas]);
                    n2 = Integer.parseInt(matrizB[filas][columnas]);
                    matrizC[filas][columnas] = n1 + n2;
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                    System.out.println("Countinua...");
                    matrizC[filas][columnas] = -1;
                }




                //en dado caso de que el numero sea igual o mayor a 0
            //if (numeros.indexOf(matrizA[filas][columnas]) >= 0  && numeros.indexOf(matrizB[filas][columnas]) >= 0) {//el index te da el valor que estas preguntando

//                n1 = Integer.parseInt(matrizA[filas][columnas]);
//                n2 = Integer.parseInt(matrizB[filas][columnas]);
//                matrizC[filas][columnas] = n1 + n2;
              //  }else {
              //  matrizC[filas][columnas] = 0;
              //  }


            }

        }
        for (int i = 0; i < matrizC.length; i++) {
            System.out.println(Arrays.toString(matrizC[i]));
        }







    }
}
