public class DemoHerenciaConstructores {
    public static void main(String[] args){

        Animal dumbo=new Elefante("Elephantidae", "Mamifero", "Asiática", 4000);
        System.out.println(dumbo);

        /*Animal animal=new Animal("Canis Lupus", "Mamifero");
        System.out.println(animal);*/
    }
}

abstract class Animal{ //una clase abstract no deja crear objetos de la clase, solo usar la clase para heredarla
    private String especie;
    private String tipo_nacimiento;

    public Animal(){}

    public Animal(String especie, String tipo_nacimiento) {
        this.setEspecie(especie);
        this.setTipo_nacimiento(tipo_nacimiento);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo_nacimiento() {
        return tipo_nacimiento;
    }

    public void setTipo_nacimiento(String tipo_nacimiento) {
        this.tipo_nacimiento = tipo_nacimiento;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", tipo_nacimiento='" + tipo_nacimiento + '\'' +
                '}';
    }
}

class Elefante extends Animal{
    private String raza;
    private double peso;

    public Elefante(){}

    public Elefante(String especie, String tipo_nacimiento, String raza, double peso) {
        super(especie, tipo_nacimiento); //invoca al constructor de la clase padre
        this.raza = raza;
        this.peso = peso;
    }
    //this() constructor local  -     super() constructor padre
    //this.atributos            -     super.atributos

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "especie='" + super.getEspecie() + '\'' +
                ", tipo='" + super.getTipo_nacimiento() + '\'' +
                ", raza='" + raza + '\'' +
                ", peso=" + peso +
                '}';
    }
}
