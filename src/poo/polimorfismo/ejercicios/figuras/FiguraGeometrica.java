package poo.polimorfismo.ejercicios.figuras;

public class FiguraGeometrica {

    private Float perimetro;
    private Float area;
    private Float volumen;

    public FiguraGeometrica(Float perimetro, Float area, Float volumen) {
        this.perimetro = perimetro;
        this.area = area;
        this.volumen = volumen;
    }

    public Float getVolumen() {
        return volumen;
    }

    public void setVolumen(Float volumen) {
        this.volumen = volumen;
    }

    public Float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Float perimetro) {
        this.perimetro = perimetro;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "perimetro=" + perimetro + ", area=" + area + ", volumen=" + volumen + '}';
    }
    
}
