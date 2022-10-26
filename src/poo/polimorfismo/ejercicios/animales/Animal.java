package poo.polimorfismo.ejercicios.animales;

public class Animal {

    private String raza;
    private String color;
    private Float tamanio;
    private String habitat;
    private String taxonomia;

    public Animal() {
    }

    public Animal(String raza, String color, Float tamanio, String habitat, String taxonomia) {
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.habitat = habitat;
        this.taxonomia = taxonomia;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getTamanio() {
        return tamanio;
    }

    public void setTamanio(Float tamanio) {
        this.tamanio = tamanio;
    }

    public String getTaxonomia() {
        return taxonomia;
    }

    public void setTaxonomia(String taxonomia) {
        this.taxonomia = taxonomia;
    }

    @Override
    public String toString() {
        return "Animal{" + "raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", habitat=" + habitat + ", taxonomia=" + taxonomia + '}';
    }

}
