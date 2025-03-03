import java.util.ArrayList;
import java.util.Scanner;

public class MainPersonaArrays {
    public static void main(String[] args) {

        ArrayList<String> lista= new ArrayList();

        Scanner teclado=new Scanner(System.in);
        String frase="";

        /*lista.add(frase);

        frase="Que reciban muchos apapachos";
        lista.add(frase);
        frase="Hoy será un dia maravilloso...para otros";

        System.out.println(frase);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        if (lista.contains(frase))
            System.out.println("Tristemente así será");
        else
            System.out.println("Eres afortunado");

        System.out.println(lista.size()); */

        System.out.println("Escribe quit para salir");
        while(true){
            System.out.println("Dame una frase: ");
            frase=teclado.nextLine();
            if (frase.equals("quit"))
                break;
            lista.add(frase);
        }

        for(String s:lista){ //iterador
            System.out.println(s);
        }
    }
}
