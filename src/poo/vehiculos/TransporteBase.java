package poo.vehiculos;

public class TransporteBase {

    private Integer numeroPuertas;
    private String color;
    private String matricula;
    private Float tamanio;
    private Float velocidadMax;
    private Float velocidadMin;

    public TransporteBase(Integer numeroPuertas, String color, String matricula, Float tamanio, Float velocidadMax, Float velocidadMin) {
        this.numeroPuertas = numeroPuertas;
        this.color = color;
        this.matricula = matricula;
        this.tamanio = tamanio;
        this.velocidadMax = velocidadMax;
        this.velocidadMin = velocidadMin;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Float getTamanio() {
        return tamanio;
    }

    public void setTamanio(Float tamanio) {
        this.tamanio = tamanio;
    }

    public Float getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Float velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Float getVelocidadMin() {
        return velocidadMin;
    }

    public void setVelocidadMin(Float velocidadMin) {
        this.velocidadMin = velocidadMin;
    }

    public void avanzar() {
        System.out.println("El " + this.getClass().getSimpleName() + " avanza");
    }

    public void detenerse() {
        System.out.println("El " + this.getClass().getSimpleName() + " se detiene");
    }

    public void retroceder() {
        System.out.println("El " + this.getClass().getSimpleName() + " retrocede");
    }

    public void pitar() {
        System.out.println("El " + this.getClass().getSimpleName() + " está pitando");
    }

    @Override
    public String toString() {
        return "TransporteBase{" +
                "numeroPuertas=" + numeroPuertas +
                ", color='" + color + '\'' +
                ", matricula='" + matricula + '\'' +
                ", tamanio=" + tamanio +
                ", velocidadMax=" + velocidadMax +
                ", velocidadMin=" + velocidadMin +
                '}';
    }
}
