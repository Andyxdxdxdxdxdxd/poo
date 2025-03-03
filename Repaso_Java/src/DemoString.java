//27-02-2025
public class DemoString {
    public static void main(String[] args){

        String nombre=new String("Shakira"); //Instanciamiento
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.length());

        for(int i=0; i<nombre.length();i++){
            System.out.println(nombre.charAt(i));
        }

        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre);
        nombre=nombre.toUpperCase();
        System.out.println(nombre);

        System.out.println(nombre.equals("Shakira"));
        System.out.println(nombre.equals("SHAKIRA"));

        //Crear una rutina para dada una frase, buscar si existe la palabra "AMOR"
        String frase="Leo-anda-en-busca-del-    aMoR    ";
        frase=frase.toUpperCase();

        String[] resultado=frase.split("-");

        for(String s:resultado){
            s=s.trim();
            System.out.println(s.equals("AMOR"));
        }
    }
}
 //TAREA:Crear una clase que reciba un numero entre 0 y 9999 y tenga un metodo para imprimir la cantidad con letra

//Ejemplo: 1650
//Salida: Mil Seiscientos Cincuenta
