public class Mousse {
    private String tipo;
    private String color;
    private double precio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Mousse (){}

    public Mousse (String v1, String v2){
        tipo=v1;
        color=v2;
    }

    public Mousse (String v1, String v2, double v3){
        tipo=v1;
        color=v2;
        precio=v3;
    }

    public Mousse (double v3, String v2, String v1){
        tipo=v1;
        color=v2;
        precio=v3;
    }

    @Override
    public String toString() {
        return "Mousse{" +
                "tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", precio= $" + precio +
                '}';
    }
}
//26-02-2025