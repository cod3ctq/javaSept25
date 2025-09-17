package principal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClaseUno c1 = new ClaseUno();

        //c1.atributo5= 54848.57;No es posible acceder a un miembro directamente.

        c1.atributo1 = "ajfjhaf"; //public
        c1.atributo2 = "ajfjhaf";
        c1.atributo3 = 50;//protected
        c1.atributo4 = 80;

        //La forma correcta de acceder a los atributos de una clase es siempre hacerlo a tarves de get & setter por que son PUBLICOS.



    }
}