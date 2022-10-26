package poo.polimorfismo.ejercicios.figuras;

public class Circulo extends FiguraGeometrica {

    private Float radio;
    private String color;

    public Circulo(Float radio, String color, Float perimetro, Float area, Float volumen) {
        super(perimetro, area, volumen);
        this.radio = radio;
        this.color = color;
    }

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}' + ' ' + super.toString();
    }
    
}
