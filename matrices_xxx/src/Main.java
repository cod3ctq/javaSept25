import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Matriz de enteros vacia
        int[][] matriz1 = new int[5][5];

        //System.out.println(Arrays.deepToString(matriz1));

        matriz1[0][0] = 5;
        matriz1[4][4] = 8;

        //System.out.println(Arrays.deepToString(matriz1));

        //Llenar con ciclos toda la matriz

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
        String numeros="1234567890";
        int[][] resultados = new int[5][5];
        int n1, n2=0;

        for(int filas=0; filas< matrizA.length; filas++){
            //System.out.println(Arrays.toString(matriz1[filas]));
            for(int columnas = 0; columnas<matrizA[filas].length; columnas++){
                //System.out.println("Valor actual en la celda: "+filas+":"+columnas+" :"+matrizA[filas][columnas]);
                System.out.println("A:"+matrizA[filas][columnas]);
                System.out.println("B:"+matrizB[filas][columnas]);

                //Manejar errores en tiempo de ejecucion
                try{ //Intenta  hacer esto ...
                    n1 = Integer.parseInt (matrizA[filas][columnas]);
                    n2 = Integer.parseInt (matrizB[filas][columnas]);
                    resultados[filas][columnas] = n1+n2;
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                    System.out.println("Continua ...");
                    resultados[filas][columnas] = -1;
                }

            }
        }

        for (int i=0; i<resultados.length; i++){
            System.out.println(Arrays.toString(resultados[i]));
        }

        //------------------------------------------------------------------------------------------------------------------

        //VERSIONADO DE CODIGO: SE TRATA DE LA IDEA DE ORGANIZAR, CONTROLAR Y ARCHIVAR CAMBIOS EN EL CODIGO DEL PROYECTO
        //HERRAMIENTA :GIT, SUBVERSION
        //REPOSITORIO : GITHUB, GITLAB, BITBUCKET, AMAZON CODE COMMIT






























    }
}
