package poo.vehiculos;

public class Transmilenio extends TransporteBase {

    private Float tarifa;
    private Integer numeroRuedas;
    private Integer numeroSillas;
    private Integer capacidadPasajeros;

    public Transmilenio(Integer numeroPuertas, String color, String matricula, Float tamanio, Float velocidadMax, Float velocidadMin, Float tarifa, Integer numeroRuedas, Integer numeroSillas, Integer capacidadPasajeros) {
        super(numeroPuertas, color, matricula, tamanio, velocidadMax, velocidadMin);
        this.tarifa = tarifa;
        this.numeroRuedas = numeroRuedas;
        this.numeroSillas = numeroSillas;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public Float getTarifa() {
        return tarifa;
    }

    public void setTarifa(Float tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(Integer numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
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
        return "Transmilenio{" +
                "tarifa=" + tarifa +
                ", numeroRuedas=" + numeroRuedas +
                ", numeroSillas=" + numeroSillas +
                ", capacidadPasajeros=" + capacidadPasajeros +
                "} " + super.toString();
    }
}
