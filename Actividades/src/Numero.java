//TAREA:Crear una clase que reciba un numero entre 0 y 9999 y tenga un metodo para imprimir la cantidad con letra
//Ejemplo: 1650
//Salida: Mil Seiscientos Cincuenta

public class Numero {
    int num;
    String palabra;

    String convertirNumero() {
        String u[]={"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis","Siete","Ocho","Nueve"};
        String d[]={"Veinti","Diez","Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
        String c[]={"Ciento","Cien","Doscientos","Trescientos","Cuatrocientos","Quinientos","Seiscientos","Setecientos","Ochocientos","Novecientos"};
        String extra[]={"Mil","Once","Doce","Trece","Catorce","Quince","Dieciséis","Diecisiete","Dieciocho","Diecinueve"};
        int x;

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
            x=num%100;
            if(x==0){
                palabra=c[num/100];
            }
            else if(num%10==0){
                if(num/100==1){
                    palabra=c[0]+" "+d[x/10];
                }
                else{
                    palabra=c[num/100]+" "+d[x/10];
                }
            }
            else{
                if(num/100==1){
                    palabra=c[0];
                    if (x<10){
                        palabra=palabra+" "+u[x];
                    }
                    else if(x<20){
                        palabra=palabra+" "+extra[x-10];
                    }
                    else if(x<30){
                        String sc =new String(u[x-20]);
                        palabra=palabra+" "+d[0]+ sc.toLowerCase();
                    }
                    else{
                        palabra=palabra+" "+d[x/10]+" y "+u[x%10];
                    }
                }
                else{
                    palabra=c[num/100];
                    if (x<10){
                        palabra=palabra+" "+u[x];
                    }
                    else if(x<20){
                        palabra=palabra+" "+extra[x-10];
                    }
                    else if(x<30){
                        String sc =new String(u[x-20]);
                        palabra=palabra+" "+d[0]+ sc.toLowerCase();
                    }
                    else{
                        palabra=palabra+" "+d[x/10]+" y "+u[x%10];
                    }
                }
            }
        }
        else if(num>=1000 && num<=9999){
            x=num%1000;
            int y=x%100;
            if(x==0) {
                if (num == 1000) {
                    palabra = extra[0];
                }
                else {
                    palabra = u[num / 1000] + " " + extra[0];
                }
            }
            else if(y==0){
                if (num/1000==1) {
                    palabra = extra[0]+" "+c[x/100];
                }
                else {
                    palabra = u[num / 1000] + " " + extra[0]+" "+c[x/100];
                }
            }
            else if(y%10==0) {
                if (num/1000==1) {
                    if (x/100 == 1) {
                        palabra = extra[0] + " " + c[0] + " " + d[y / 10];
                    }
                    else {
                        palabra = extra[0] + " " + c[x / 100] + " " + d[y / 10];
                    }
                }
                else {
                    if (x / 100 == 1) {
                        palabra = u[num / 1000] + " " + extra[0] + " " + c[0] + " " + d[y / 10];
                    }
                    else {
                        palabra = u[num / 1000] + " " + extra[0] + " " + c[x / 100] + " " + d[y / 10];
                    }
                }
            }
            else{
                if (num/1000==1) {
                    if (x/100==1) {
                        palabra=extra[0] + " " + c[0];
                        if (y<10){
                            palabra=palabra+" "+u[y];
                        }
                        else if(y<20){
                            palabra=palabra+" "+extra[y-10];
                        }
                        else if(y<30){
                            String sm =new String(u[y-20]);
                            palabra=palabra+" "+d[0]+ sm.toLowerCase();
                        }
                        else{
                            palabra=palabra+" "+d[y/10]+" y "+u[y%10];
                        }
                    }
                    else {
                        palabra=extra[0] + " " + c[x / 100];
                        if (y<10){
                            palabra=palabra+" "+u[y];
                        }
                        else if(y<20){
                            palabra=palabra+" "+extra[y-10];
                        }
                        else if(y<30){
                            String sm =new String(u[y-20]);
                            palabra=palabra+" "+d[0]+ sm.toLowerCase();
                        }
                        else{
                            palabra=palabra+" "+d[y/10]+" y "+u[y%10];
                        }
                    }
                }
                else {
                    if (x / 100 == 1) {
                        palabra = u[num / 1000] + " " + extra[0] + " " + c[0];
                        if (y<10){
                            palabra=palabra+" "+u[y];
                        }
                        else if(y<20){
                            palabra=palabra+" "+extra[y-10];
                        }
                        else if(y<30){
                            String sm =new String(u[y-20]);
                            palabra=palabra+" "+d[0]+ sm.toLowerCase();
                        }
                        else{
                            palabra=palabra+" "+d[y/10]+" y "+u[y%10];
                        }
                    }
                    else {
                        palabra = u[num / 1000] + " " + extra[0] + " " + c[x / 100];
                        if (y<10){
                            palabra=palabra+" "+u[y];
                        }
                        else if(y<20){
                            palabra=palabra+" "+extra[y-10];
                        }
                        else if(y<30){
                            String sm =new String(u[y-20]);
                            palabra=palabra+" "+d[0]+ sm.toLowerCase();
                        }
                        else{
                            palabra=palabra+" "+d[y/10]+" y "+u[y%10];
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

    public Numero(int v1){
        num=v1;
    }
}