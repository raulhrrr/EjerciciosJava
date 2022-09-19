package poo.vehiculos;

public class Taxi extends TransporteBase {

    private String marca;
    private Float tarifa;

    public Taxi(Integer numeroPuertas, String color, String matricula, Float tamanio, Float velocidadMax, Float velocidadMin, String marca, Float tarifa) {
        super(numeroPuertas, color, matricula, tamanio, velocidadMax, velocidadMin);
        this.marca = marca;
        this.tarifa = tarifa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getTarifa() {
        return tarifa;
    }

    public void setTarifa(Float tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "marca='" + marca + '\'' +
                ", tarifa=" + tarifa +
                "} " + super.toString();
    }
}
