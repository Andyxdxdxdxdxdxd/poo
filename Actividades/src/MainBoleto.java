public class MainBoleto {
    public static void main(String[] arg){

        Boleto b1=new Boleto();
            b1.setTipo("Adulto");
            b1.setHora("11:20");
            b1.setPrecio(75);
        System.out.println(b1);

        Boleto b2 =new Boleto();
            b2.setTipo("Niño");
            b2.setHora("14:50");
            b2.setPrecio(38);
        System.out.println(b2);
    }
}
//20-02-2025