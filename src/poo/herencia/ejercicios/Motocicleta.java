package poo.herencia.ejercicios;

public class Motocicleta extends MedioTransporte {

    private Float peso;
    private Float precio;

    public Motocicleta() {
        super();
    }

    public Motocicleta(Float peso, Float precio) {
        super();
        this.peso = peso;
        this.precio = precio;
    }

    public Motocicleta(String marca, String modelo, Integer cilindraje, String color) {
        super(marca, modelo, cilindraje, color);
    }

    public Motocicleta(String marca, String modelo, Integer cilindraje, String color, Float peso, Float precio) {
        super(marca, modelo, cilindraje, color);
        this.peso = peso;
        this.precio = precio;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "peso=" + peso +
                ", precio=" + precio +
                "} " + super.toString();
    }
}
