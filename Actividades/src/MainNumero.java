import java.util.Scanner;

public class MainNumero {
    public static void main(String[] args){

        Scanner teclado=new Scanner(System.in);

        Numero obj1=new Numero(teclado.nextInt());
        System.out.println(obj1.convertirNumero());
    }
}
