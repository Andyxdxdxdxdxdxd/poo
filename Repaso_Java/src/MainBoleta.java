public class MainBoleta {
    public static void main(String[] args){
        Boleta b1=new Boleta();

        b1.nombre="Andrea";
        b1.carrera="Ingeniería en Sistemas Computacionales";
        b1.semestre=2;
        b1.materia1="Calculo Integral";
        b1.materia2="Programacion Orientada a Objetos";
        b1.materia3="Contabilidad Financiera";
        b1.materia4="Química";
        b1.materia5="Algebra Lineal";
        b1.materia6="Probabilidad y Estadística";
        b1.calif_materia1=90;
        b1.calif_materia2=98;
        b1.calif_materia3=100;
        b1.calif_materia4=85;
        b1.calif_materia5=93;
        b1.calif_materia6=100;

        System.out.println(b1.obtener_boleta());
        System.out.println(b1.calcula_promedio());

        Boleta b2=new Boleta();

        b2.nombre="Monserrat";
        b2.carrera="Ingeniería en Sistemas Computacionales";
        b2.semestre=2;
        b2.materia1="Calculo Integral";
        b2.materia2="Programacion Orientada a Objetos";
        b2.materia3="Contabilidad Financiera";
        b2.materia4="Química";
        b2.materia5="Algebra Lineal";
        b2.materia6="Probabilidad y Estadística";
        b2.calif_materia1=82;
        b2.calif_materia2=95;
        b2.calif_materia3=79;
        b2.calif_materia4=85;
        b2.calif_materia5=90;
        b2.calif_materia6=80;

        System.out.println(b2.obtener_boleta());
        System.out.println(b2.calcula_promedio());

        Boleta b3=new Boleta();

        b3.nombre="Luis";
        b3.carrera="Ingeniería en Sistemas Computacionales";
        b3.semestre=2;
        b3.materia1="Calculo Integral";
        b3.materia2="Programacion Orientada a Objetos";
        b3.materia3="Contabilidad Financiera";
        b3.materia4="Química";
        b3.materia5="Algebra Lineal";
        b3.materia6="Probabilidad y Estadística";
        b3.calif_materia1=99;
        b3.calif_materia2=98;
        b3.calif_materia3=95;
        b3.calif_materia4=90;
        b3.calif_materia5=93;
        b3.calif_materia6=97;

        System.out.println(b3.obtener_boleta());
        System.out.println(b3.calcula_promedio());


    }
}
