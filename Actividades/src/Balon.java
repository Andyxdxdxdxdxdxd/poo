public class Balon {
    private String tipo;
    private String tamanio;
    private double precio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "tipo de balón='" + tipo + '\'' +
                ", tamaño='" + tamanio + '\'' +
                ", precio= $" + precio +
                '}';
    }
}
//20-02-2025