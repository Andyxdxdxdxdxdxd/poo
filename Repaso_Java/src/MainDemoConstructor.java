//21-02-2025
public class MainDemoConstructor {
    public static void main(String[] args) {

        //Aquí estas invocando al constructor
        DemoConstructor_01 obj=new DemoConstructor_01();
        System.out.println(obj.atributo1);
        obj.atributo1="Nuevo valor";
        System.out.println(obj.atributo1);

        DemoConstructor_01 obj2=new DemoConstructor_01("Este es mi valor");
        System.out.println(obj2.atributo1);

        DemoConstructor_01 obj3=new DemoConstructor_01(20.5, "Valor string"); //DemoConstructor (double, String)

        /*Alumno r=new Alumno("Rebeca", 18, "E20234567","Segundo");

        //Esto ya no sería necesario:
        r.nombre="Rebeca";
        r.edad=18;
        r.control="E20234567";
        r.semestre="Segundo";*/
    }
}
