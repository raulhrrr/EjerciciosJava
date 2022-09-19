package poo.vehiculos;

public class Transmicable extends TransporteBase {

    private Float tarifa;
    private Integer numeroEstaciones;
    private Integer numeroSillas;
    private Integer capacidadPasajeros;

    public Transmicable(Integer numeroPuertas, String color, String matricula, Float tamanio, Float velocidadMax, Float velocidadMin, Float tarifa, Integer numeroEstaciones, Integer numeroSillas, Integer capacidadPasajeros) {
        super(numeroPuertas, color, matricula, tamanio, velocidadMax, velocidadMin);
        this.tarifa = tarifa;
        this.numeroEstaciones = numeroEstaciones;
        this.numeroSillas = numeroSillas;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public Float getTarifa() {
        return tarifa;
    }

    public void setTarifa(Float tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getNumeroEstaciones() {
        return numeroEstaciones;
    }

    public void setNumeroEstaciones(Integer numeroEstaciones) {
        this.numeroEstaciones = numeroEstaciones;
    }

    public Integer getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(Integer numeroSillas) {
        this.numeroSillas = numeroSillas;
    }

    public Integer getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(Integer capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        return "Transmicable{" +
                "tarifa=" + tarifa +
                ", numeroEstaciones=" + numeroEstaciones +
                ", numeroSillas=" + numeroSillas +
                ", capacidadPasajeros=" + capacidadPasajeros +
                "} " + super.toString();
    }
}
