public class Manzana {
    private String tipo;
    private String color;
    private String tamanio;

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

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Manzana{" +
                "tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", tamaño='" + tamanio + '\'' +
                '}';
    }
}
//20-02-2025
