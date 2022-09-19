package poo.vehiculos;

public class BiciTaxi extends TransporteBase {

    private Integer capacidadPasajeros;
    private Boolean esMotorizado;

    public BiciTaxi(Integer numeroPuertas, String color, String matricula, Float tamanio, Float velocidadMax, Float velocidadMin, Integer capacidadPasajeros, Boolean esMotorizado) {
        super(numeroPuertas, color, matricula, tamanio, velocidadMax, velocidadMin);
        this.capacidadPasajeros = capacidadPasajeros;
        this.esMotorizado = esMotorizado;
    }

    public Integer getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(Integer capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public Boolean getEsMotorizado() {
        return esMotorizado;
    }

    public void setEsMotorizado(Boolean esMotorizado) {
        this.esMotorizado = esMotorizado;
    }

    @Override
    public String toString() {
        return "BiciTaxi{" +
                "capacidadPasajeros=" + capacidadPasajeros +
                ", esMotorizado=" + esMotorizado +
                "} " + super.toString();
    }
}
