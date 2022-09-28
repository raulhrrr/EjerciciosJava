package poo.actividad26septiembre;

public class Auto {

    private String placa;
    private String color;
    private String marca;
    private Integer cilindraje;
    private Integer anio;

    public Auto(String placa, String marca, Integer anio) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
    }

    public Auto(String placa, String color, String marca, Integer cilindraje, Integer anio) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.anio = anio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public Integer getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    /*
    public void mostrarDatos() {
        System.out.println("Placa: " + placa);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Año: " + anio);
    }
    */

    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", color=" + color + ", marca=" + marca + ", cilindraje=" + cilindraje + ", anio=" + anio + '}';
    }
    
    
}
