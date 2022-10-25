package poo.polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {

    private Integer carga;

    public VehiculoFurgoneta(Integer carga) {
        this.carga = carga;
    }

    public VehiculoFurgoneta(String matricula, String marca, String modelo, Integer carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "VehiculoFurgoneta{" +
                "carga=" + carga +
                "} " + super.toString();
    }
}
