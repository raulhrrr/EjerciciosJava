package poo.galletas;

public class MoldeBase {

    private String material;
    private Float tamanio;
    private String color;

    public MoldeBase(String material, Float tamanio, String color) {
        this.material = material;
        this.tamanio = tamanio;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Float getTamanio() {
        return tamanio;
    }

    public void setTamanio(Float tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void crearMolde() {
        System.out.println("Se está creando el molde para " + this.getClass().getSimpleName());
    }

    public void romperse() {
        System.out.println("Se rompió el molde " + this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "MoldeBase{" +
                "material='" + material + '\'' +
                ", tamanio=" + tamanio +
                ", color='" + color + '\'' +
                '}';
    }
}
