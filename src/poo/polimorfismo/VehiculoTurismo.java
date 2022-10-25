package poo.polimorfismo;

public class VehiculoTurismo extends Vehiculo {

    private Integer numeroPuertas;

    public VehiculoTurismo(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public VehiculoTurismo(String matricula, String marca, String modelo, Integer numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "VehiculoTurismo{" +
                "numeroPuertas=" + numeroPuertas +
                "} " + super.toString();
    }
}
