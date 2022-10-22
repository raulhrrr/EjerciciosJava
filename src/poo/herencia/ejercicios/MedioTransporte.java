package poo.herencia.ejercicios;

public class MedioTransporte {

    private String marca;
    private String modelo;
    private Integer cilindraje;
    private String color;

    public MedioTransporte() {
    }

    public MedioTransporte(String marca, String modelo, Integer cilindraje, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MedioTransporte{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindraje=" + cilindraje +
                ", color='" + color + '\'' +
                '}';
    }
}
