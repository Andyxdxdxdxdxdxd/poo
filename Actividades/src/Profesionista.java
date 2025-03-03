public class Profesionista {
    private String nombre;
    private int tiempo_trabajando;
    private String profesion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo_trabajando() {
        return tiempo_trabajando;
    }

    public void setTiempo_trabajando(int tiempo_trabajando) {
        this.tiempo_trabajando = tiempo_trabajando;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Profesionista{" +
                "nombre='" + nombre + '\'' +
                ", años trabajando=" + tiempo_trabajando +
                ", profesión='" + profesion + '\'' +
                '}';
    }
}
//20-02-2025