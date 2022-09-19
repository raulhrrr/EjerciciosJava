package poo.vehiculos;

public class Tren extends TransporteBase {

    private String material;
    private Integer cantidadVagones;

    public Tren(Integer numeroPuertas, String color, String matricula, Float tamanio, Float velocidadMax, Float velocidadMin, String material, Integer cantidadVagones) {
        super(numeroPuertas, color, matricula, tamanio, velocidadMax, velocidadMin);
        this.material = material;
        this.cantidadVagones = cantidadVagones;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getCantidadVagones() {
        return cantidadVagones;
    }

    public void setCantidadVagones(Integer cantidadVagones) {
        this.cantidadVagones = cantidadVagones;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "material='" + material + '\'' +
                ", cantidadVagones=" + cantidadVagones +
                "} " + super.toString();
    }
}
