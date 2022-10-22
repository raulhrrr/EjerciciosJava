package poo.herencia.ejercicios;

public class Automovil extends MedioTransporte {

    private Integer caballosDeFuerza;
    private Boolean esDeportivo;

    public Automovil() {
        super();
    }

    public Automovil(Integer caballosDeFuerza, Boolean esDeportivo) {
        super();
        this.caballosDeFuerza = caballosDeFuerza;
        this.esDeportivo = esDeportivo;
    }

    public Automovil(String marca, String modelo, Integer cilindraje, String color) {
        super(marca, modelo, cilindraje, color);
    }

    public Automovil(String marca, String modelo, Integer cilindraje, String color, Integer caballosDeFuerza, Boolean esDeportivo) {
        super(marca, modelo, cilindraje, color);
        this.caballosDeFuerza = caballosDeFuerza;
        this.esDeportivo = esDeportivo;
    }

    public Integer getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(Integer caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public Boolean getEsDeportivo() {
        return esDeportivo;
    }

    public void setEsDeportivo(Boolean esDeportivo) {
        this.esDeportivo = esDeportivo;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "caballosDeFuerza=" + caballosDeFuerza +
                ", esDeportivo=" + esDeportivo +
                "} " + super.toString();
    }
}
