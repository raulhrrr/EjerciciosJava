package poo.polimorfismo.ejercicios.figuras;

public class Rectangulo extends FiguraGeometrica {

    private Integer vertices;
    private String color;

    public Rectangulo(Integer vertices, String color, Float perimetro, Float area, Float volumen) {
        super(perimetro, area, volumen);
        this.vertices = vertices;
        this.color = color;
    }

    public Integer getVertices() {
        return vertices;
    }

    public void setVertices(Integer vertices) {
        this.vertices = vertices;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "vertices=" + vertices + ", color=" + color + '}' + ' ' + super.toString();
    }
    
}
