package poo.vehiculos;

public class Uber extends TransporteBase {

    private String marca;

    public Uber(Integer numeroPuertas, String color, String matricula, Float tamanio, Float velocidadMax, Float velocidadMin, String marca) {
        super(numeroPuertas, color, matricula, tamanio, velocidadMax, velocidadMin);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Uber{" +
                "marca='" + marca + '\'' +
                "} " + super.toString();
    }
}
