package poo.polimorfismo.ejercicios.animales;

public class Gato extends Animal {

    private String colorOjos;

    public Gato(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public Gato(String colorOjos, String raza, String color, Float tamanio, String habitat, String taxonomia) {
        super(raza, color, tamanio, habitat, taxonomia);
        this.colorOjos = colorOjos;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public String toString() {
        return "Gato{" + "colorOjos=" + colorOjos + '}' + ' ' + super.toString();
    }

}
