public class Boleta {
    String nombre;
    String carrera;
    int semestre;
    String materia1;
    String materia2;
    String materia3;
    String materia4;
    String materia5;
    String materia6;
    double calif_materia1;
    double calif_materia2;
    double calif_materia3;
    double calif_materia4;
    double calif_materia5;
    double calif_materia6;

    double calcula_promedio(){
        return (calif_materia1+calif_materia2+calif_materia3+calif_materia4+calif_materia5+calif_materia6)/6;
    }

    String obtener_boleta(){
        String cad="";
        cad=cad+"Persona{"+nombre+"; "+carrera+"; ";
        cad=cad+"semestre "+semestre+"; ";
        cad=cad+materia1+": "+calif_materia1+"; ";
        cad=cad+materia2+": "+calif_materia2+"; ";
        cad=cad+materia3+": "+calif_materia3+"; ";
        cad=cad+materia4+": "+calif_materia4+"; ";
        cad=cad+materia5+": "+calif_materia5+"; ";
        cad=cad+materia6+": "+calif_materia6+"}";
        return cad;
    }
}
