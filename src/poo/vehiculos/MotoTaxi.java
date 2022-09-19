package poo.vehiculos;

public class MotoTaxi extends TransporteBase {

    private Float cilindraje;

    public MotoTaxi(Integer numeroPuertas, String color, String matricula, Float tamanio, Float velocidadMax, Float velocidadMin, Float cilindraje) {
        super(numeroPuertas, color, matricula, tamanio, velocidadMax, velocidadMin);
        this.cilindraje = cilindraje;
    }

    public Float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Float cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "MotoTaxi{" +
                "cilindraje=" + cilindraje +
                "} " + super.toString();
    }
}
