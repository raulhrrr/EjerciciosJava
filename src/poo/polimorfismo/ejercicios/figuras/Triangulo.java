package poo.polimorfismo.ejercicios.figuras;

public class Triangulo extends FiguraGeometrica {

    private String tipo;
    private String color;

    public Triangulo(String tipo, String color, Float perimetro, Float area, Float volumen) {
        super(perimetro, area, volumen);
        this.tipo = tipo;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "tipo=" + tipo + ", color=" + color + '}' + ' ' + super.toString();
    }
    
}
