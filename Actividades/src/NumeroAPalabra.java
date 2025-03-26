//TAREA:Crear una clase que reciba un numero entre 0 y 9999 y tenga un metodo para imprimir la cantidad
// con letra
//Ejemplo: 1650
//Salida: Mil Seiscientos Cincuenta
//28/02/25
import java.util.Scanner;
public class NumeroAPalabra{
    public static void main(String[] args){

        Scanner teclado=new Scanner(System.in);

        Numero obj1=new Numero(teclado.nextInt());
        System.out.println(obj1.convertirNumero());
    }

}

class Numero {
    int num;
    String palabra;

    public Numero(int v1){
        num=v1;
    }

    String convertirNumero() {
        String u[]={"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis","Siete","Ocho","Nueve"};
        String d[]={"Veinti","Diez","Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
        String c[]={"Ciento","Cien","Doscientos","Trescientos","Cuatrocientos","Quinientos","Seiscientos","Setecientos","Ochocientos","Novecientos"};
        String extra[]={"Mil","Once","Doce","Trece","Catorce","Quince","Dieciséis","Diecisiete","Dieciocho","Diecinueve"};
        int residuo;

        if (num < 10) {
            palabra=u[num];
        }
        else if (num>10 && num<20){
            palabra=extra[num-10];
        }
        else if(num>20 && num<30){
            String s=new String(u[num-20]);
            palabra=d[0]+s.toLowerCase();
        }
        else if(num<100){
            if(num%10==0){
                palabra=d[num/10];
            }
            else{
                palabra=d[num/10]+" y "+u[num%10];
            }
        }
        else if(num>=100 && num<1000){
            residuo=num%100;
            if(residuo==0){
                palabra=c[num/100];
            }
            else if(num%10==0){
                if(num/100==1){
                    palabra=c[0]+" "+d[residuo/10];
                }
                else{
                    palabra=c[num/100]+" "+d[residuo/10];
                }
            }
            else{
                if(num/100==1){
                    palabra=c[0];
                    if (residuo<10){
                        palabra=palabra+" "+u[residuo];
                    }
                    else if(residuo<20){
                        palabra=palabra+" "+extra[residuo-10];
                    }
                    else if(residuo<30){
                        String sc=new String(u[residuo-20]);
                        palabra=palabra+" "+d[0]+ sc.toLowerCase();
                    }
                    else{
                        palabra=palabra+" "+d[residuo/10]+" y "+u[residuo%10];
                    }
                }
                else{
                    palabra=c[num/100];
                    if (residuo<10){
                        palabra=palabra+" "+u[residuo];
                    }
                    else if(residuo<20){
                        palabra=palabra+" "+extra[residuo-10];
                    }
                    else if(residuo<30){
                        String sc =new String(u[residuo-20]);
                        palabra=palabra+" "+d[0]+ sc.toLowerCase();
                    }
                    else{
                        palabra=palabra+" "+d[residuo/10]+" y "+u[residuo%10];
                    }
                }
            }
        }
        else if(num>=1000 && num<=9999){
            residuo=num%1000;
            int resC =residuo%100;
            if(residuo==0) {
                if (num == 1000) {
                    palabra = extra[0];
                }
                else {
                    palabra = u[num / 1000] + " " + extra[0];
                }
            }
            else if(resC ==0){
                if (num/1000==1) {
                    palabra = extra[0]+" "+c[residuo/100];
                }
                else {
                    palabra = u[num / 1000] + " " + extra[0]+" "+c[residuo/100];
                }
            }
            else if(resC %10==0) {
                if (num/1000==1) {
                    if (residuo/100 == 1) {
                        palabra = extra[0] + " " + c[0] + " " + d[resC / 10];
                    }
                    else {
                        palabra = extra[0] + " " + c[residuo/ 100] + " " + d[resC / 10];
                    }
                }
                else {
                    if (residuo/100 == 1) {
                        palabra = u[num / 1000] + " " + extra[0] + " " + c[0] + " " + d[resC / 10];
                    }
                    else {
                        palabra = u[num / 1000] + " " + extra[0] + " " + c[residuo/ 100] + " " + d[resC / 10];
                    }
                }
            }
            else{
                if (num/1000==1) {
                    if (residuo/100==1) {
                        palabra=extra[0] + " " + c[0];
                        if (resC <10){
                            palabra=palabra+" "+u[resC];
                        }
                        else if(resC <20){
                            palabra=palabra+" "+extra[resC -10];
                        }
                        else if(resC <30){
                            String sm =new String(u[resC -20]);
                            palabra=palabra+" "+d[0]+ sm.toLowerCase();
                        }
                        else{
                            palabra=palabra+" "+d[resC /10]+" y "+u[resC %10];
                        }
                    }
                    else {
                        palabra=extra[0] + " " + c[residuo/ 100];
                        if (resC <10){
                            palabra=palabra+" "+u[resC];
                        }
                        else if(resC <20){
                            palabra=palabra+" "+extra[resC -10];
                        }
                        else if(resC <30){
                            String sm =new String(u[resC -20]);
                            palabra=palabra+" "+d[0]+ sm.toLowerCase();
                        }
                        else{
                            palabra=palabra+" "+d[resC /10]+" y "+u[resC %10];
                        }
                    }
                }
                else {
                    if (residuo/ 100 == 1) {
                        palabra = u[num / 1000] + " " + extra[0] + " " + c[0];
                        if (resC <10){
                            palabra=palabra+" "+u[resC];
                        }
                        else if(resC <20){
                            palabra=palabra+" "+extra[resC -10];
                        }
                        else if(resC <30){
                            String sm =new String(u[resC -20]);
                            palabra=palabra+" "+d[0]+ sm.toLowerCase();
                        }
                        else{
                            palabra=palabra+" "+d[resC /10]+" y "+u[resC %10];
                        }
                    }
                    else {
                        palabra = u[num / 1000] + " " + extra[0] + " " + c[residuo/ 100];
                        if (resC <10){
                            palabra=palabra+" "+u[resC];
                        }
                        else if(resC <20){
                            palabra=palabra+" "+extra[resC -10];
                        }
                        else if(resC <30){
                            String sm =new String(u[resC -20]);
                            palabra=palabra+" "+d[0]+ sm.toLowerCase();
                        }
                        else{
                            palabra=palabra+" "+d[resC /10]+" y "+u[resC %10];
                        }
                    }
                }
            }
        }
        else{
            palabra="El número ingresado no es válido";
        }
        return palabra;
    }
}