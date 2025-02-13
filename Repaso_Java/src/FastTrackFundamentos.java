import java.util.Scanner;

public class FastTrackFundamentos {
    public static void main(String[] args) {
        /*
        //Variables en java
        int a;
        double b;
        float c;
        String d;
        boolean e;

        a=3;
        b=20.50;
        d="Esto es una cadena";
        e=true; //o false
        String nombre="Jorge Estudillo";

        //Constantes
        final double PI=3.141516; //cuando se ejecuta no se puede cambiar el valor

        Scanner intro=new Scanner(System.in);
        System.out.println(b);
        b=intro.nextDouble();
        System.out.println(b);

        //Condicionales <, >, <=, >=, !=, ==
        //Operadores lógicos && (and), || (or), ! (not)

        int valor=21;
        int calif=82;
        if(!(valor>=20 || calif>85)){
            if(valor==20){
                System.out.println("Es exactamente 20");
            }else{
                System.out.println("Es superior a 20");
            }
        }
        else {
            System.out.println("Es menor o igual");
        }
        System.out.println("FIN DEL PROGRAMA");

        //Condicionales multiples "switch"
        // switch no funciona con 'double'

        int  opcion;
        opcion=4;

        switch (opcion){
            case 1:
                System.out.println("Vale 1"); break;
            case 2:
                System.out.println("Vale 2"); break;
            case 3:
                System.out.println("Vale 3"); break;
            default:
                System.out.println("Valor no permitido"); break;
        }

        //Ciclos

        for(int i=10, j=0; i!=j; i--, j++) //(i+=2), (i=i+2), (i-=2), (i/=2), (i*=2), (i++), (i--)
        {
            if (i==9)
                continue; //saltarse el ciclo y pasar al siguiente
            System.out.println(i);
            if(i==7){
                break; //romper ciclos
            }
        }
        Scanner teclado=new Scanner(System.in);
        int opcion=-1;
        for(;;){
            System.out.println("Escribe un 0 para salir");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Tecleaste 1"); break;
                case 2:
                    System.out.println("Tecleaste 2"); break;
                case 3:
                    System.out.println("Tecleaste 3"); break;
                default:
                    break;
            }
        if (opcion==0)
            break;
        } //termina el for

        //while

        int opcion=20;
        while(opcion>10){
            System.out.println(opcion);
            opcion=opcion-1;
        }

        int centinela=0;
        while(centinela!=0){
            System.out.println("centinela en while");
        }

        //do-while

        centinela=0;
        do{ //to do
            System.out.println("centinela en do while");
        }while(centinela!=0);

        //Arreglos
       // int[] edades={18,20,21,25,19,22};
        String nombres[]={"Leo","Abraham", "Rebeca"};

        int edades[]=new int[10];
        edades[6]=16;
        edades[1]=20;
        System.out.println(edades[6]);
        System.out.println(edades[1]);
        System.out.println(edades[0]);

        String[] paises=new String[5];
        paises[0]="Mexico";
        System.out.println(paises[0]);
        System.out.println(paises[1]);

        /*System.out.println(nombres[nombres.length-1]);

        for(int i=0; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }

        //Matrices (arreglos bidimensionales
        int[][] calificaciones={{1,2,3},
                                {4,5,6},
                                {7,8,9}};

        System.out.println(calificaciones[0][2]);
        System.out.println(calificaciones.length);
        System.out.println(calificaciones[0].length);

        for(int i=0; i<calificaciones.length; i++){
            for(int j=0; j<calificaciones[0].length; j++){
                System.out.println(calificaciones[i][j]);
                System.out.println(calificaciones[j][i]);
            }
        }*/

        double[][] calif_poo=new double[27][6];
        calif_poo[6][0]=99;
        System.out.println(calif_poo[6][0]);


        /*System.out.println(sumar(3,5));
        multiplica(6,10);*/
    } //fin del main
    public static int sumar(int a, int b){return a+b;}

    public static void multiplica(int x, int y){
        int res;
        res=x*y;
        System.out.println(res);
    }
}
