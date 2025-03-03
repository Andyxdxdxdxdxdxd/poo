public class Boleto {
    private String tipo;
    private double precio;
    private String hora;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "tipo='" + tipo + '\'' +
                ", precio= $" + precio +
                ", hora de la función='" + hora + '\'' +
                '}';
    }
}
//20-02-2025
