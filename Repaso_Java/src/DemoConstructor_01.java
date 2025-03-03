//21-02-2025
//Vamos a agregar un constructor a nuestra clase
//CONSTRUCTOR: Un metodo especial que es invocado en el proceso de isntanciacimento de la clase
//Es público, se llama igual que la clase y no tiene tipo de retorno

public class DemoConstructor_01 {
    String atributo1;
    double atributo2;
    String atributo3;

    public DemoConstructor_01() {  //Este es un constructor por default
        System.out.println("Creando el objeto"); //Aunque no lo veías existía
        atributo1="Valor del atributo 1";
    }

    public DemoConstructor_01(String valor){  //(String)
        atributo1=valor;
    }

    public DemoConstructor_01(String valor, String valor2){ //(String, String)
        atributo3=valor;
        atributo1=valor2;
    }

    public DemoConstructor_01(double valor1, String valor2){ //(double, String)
        atributo2=valor1;
        atributo1=valor2;
    }

    public DemoConstructor_01(String valor2, double valor1){ //(String, double)
        atributo2=valor1;
        atributo1=valor2;
    }

    public DemoConstructor_01(double valor1){ //(double)
        atributo2=valor1;

    }
}
