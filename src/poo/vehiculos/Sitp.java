package poo.vehiculos;

public class Sitp extends TransporteBase {

    private Integer numeroVentanas;
    private Float tarifa;
    private Integer numeroRuedas;
    private Integer numeroSillas;
    private Integer capacidadPasajeros;

    public Sitp(Integer numeroPuertas, String color, String matricula, Float tamanio, Float velocidadMax, Float velocidadMin, Integer numeroVentanas, Float tarifa, Integer numeroRuedas, Integer numeroSillas, Integer capacidadPasajeros) {
        super(numeroPuertas, color, matricula, tamanio, velocidadMax, velocidadMin);
        this.numeroVentanas = numeroVentanas;
        this.tarifa = tarifa;
        this.numeroRuedas = numeroRuedas;
        this.numeroSillas = numeroSillas;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public Integer getNumeroVentanas() {
        return numeroVentanas;
    }

    public void setNumeroVentanas(Integer numeroVentanas) {
        this.numeroVentanas = numeroVentanas;
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
        return "Sitp{" +
                "numeroVentanas=" + numeroVentanas +
                ", tarifa=" + tarifa +
                ", numeroRuedas=" + numeroRuedas +
                ", numeroSillas=" + numeroSillas +
                ", capacidadPasajeros=" + capacidadPasajeros +
                "} " + super.toString();
    }
}
