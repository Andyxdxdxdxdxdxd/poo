public class MainMousse {
    public static void main(String[] arg){

        Mousse m1=new Mousse();
          m1.setTipo("Inalambrico");
          m1.setColor("Blanco");
          m1.setPrecio(300);
        System.out.println(m1);

        Mousse m2=new Mousse("Cable", "Negro");
        System.out.println(m2);

        Mousse m3=new Mousse("Inalambrico","Azul",225.9);
        System.out.println(m3);

        Mousse m4=new Mousse(360.5,"Rojo","Cable");
        System.out.println(m4);
    }
}
//26-02-2025
