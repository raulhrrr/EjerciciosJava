package poo.polimorfismo.ejercicios.animales;

public class Delfin extends Animal {

    private Float tamanioAletas;

    public Delfin(Float tamanioAletas) {
        this.tamanioAletas = tamanioAletas;
    }

    public Delfin(Float tamanioAletas, String raza, String color, Float tamanio, String habitat, String taxonomia) {
        super(raza, color, tamanio, habitat, taxonomia);
        this.tamanioAletas = tamanioAletas;
    }

    public Float getTamanioAletas() {
        return tamanioAletas;
    }

    public void setTamanioAletas(Float tamanioAletas) {
        this.tamanioAletas = tamanioAletas;
    }

    @Override
    public String toString() {
        return "Delfin{" + "tamanioAletas=" + tamanioAletas + '}' + ' ' + super.toString();
    }

}
