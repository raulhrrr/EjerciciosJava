package POO;

public class Coche {

    private String color;
    private String marca;
    private int km;

    public Coche(String color, String marca, int km) {
        this.color = color;
        this.marca = marca;
        this.km = km;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", km=" + km + '}';
    }
}
