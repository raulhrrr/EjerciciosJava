package poo.polimorfismo;

public class VehiculoDeportivo extends Vehiculo {

    private Integer cilindrada;

    public VehiculoDeportivo(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public VehiculoDeportivo(String matricula, String marca, String modelo, Integer cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "VehiculoDeportivo{" +
                "cilindrada=" + cilindrada +
                "} " + super.toString();
    }
}
