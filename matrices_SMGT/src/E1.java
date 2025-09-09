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

        //String = numeros "1234567890"

        //IsDigit -- Identifica si es un digito

        int[][] matrizC = new int[matrizA.length][matrizA[0].length];


        //.matches("\\d+")
        //Integer.parseInt
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                String valor1 = matrizA[i][j];
                String valor2 = matrizB[i][j];

                //Manejar errroes en tiempo de ejecucion

                try{ //Intenta hacer esto
                    matrizC[i][j] = Integer.parseInt(valor1) + Integer.parseInt(valor2);
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                    System.out.printf("Continua... ");
                    matrizC[i][j] = -1;
                }

//                if (valor1.matches("\\d+") && valor2.matches("\\d+")) {
//                    matrizC[i][j] = Integer.parseInt(valor1) + Integer.parseInt(valor2);
//                } else {
//                    matrizC[i][j] = 0;
//                }

            }
        }

        System.out.println("Matriz");
        for (int i = 0; i< matrizC.length; i++){
            System.out.println(Arrays.toString(matrizC[i]));
        }

        System.out.println("Matriz: ");
        for (int k = 0; k < matrizC.length; k++) {
            for (int l = 0; l < matrizC[k].length; l++) {
                System.out.printf(matrizC[k][l] + "\t ");
            }
        }
    }
}


//Versionado de codigo :: Se trada de la idea de organizar controlar y archivar cambios en el codigo del proyecto
//
//Herramienta : GIT, SUBVERSION
//Repositorio: GITHUB, GITLAB, BITBOCKET, AZAMON CODE COMMIT


