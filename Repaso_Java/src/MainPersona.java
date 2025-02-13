public class MainPersona {
    public static void main(String[] args){
        Persona p1=new Persona(); //Instanciamiento

        //Configurar el objeto dando valores a sus atributos
        p1.nombre="Leonardo";
        p1.genero="masculino";
        p1.estatura=1.72;
        p1.peso=57;
        p1.edad=18;

        //Usando uno de los métodos de clase
        System.out.println(p1.obtenerDatos());
        System.out.println(p1.calcula_imc());

        Persona p2=new Persona();
        p2.nombre="Emiliano";
        p2.genero="masculino";
        p2.peso=42;
        p2.estatura=1.61;
        p2.edad=18;

        String res=p2.obtenerDatos();
        System.out.println(res);

        System.out.println(p2.calcula_imc());
    }
}
