package poo.polimorfismo.ejercicios.figuras;

public class Cuadrado extends FiguraGeometrica {

    private Integer lados;
    private String color;

    public Cuadrado(Integer lados, String color, Float perimetro, Float area, Float volumen) {
        super(perimetro, area, volumen);
        this.lados = lados;
        this.color = color;
    }

    public Integer getLados() {
        return lados;
    }

    public void setLados(Integer lados) {
        this.lados = lados;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lados=" + lados + ", color=" + color + '}'  + ' ' + super.toString();
    }
    
}
