package poo.polimorfismo.ejercicios.deportes;

public class Aventura extends Juego {
    
    private String tamanioMapa;
    private Boolean isRol;

    public Aventura(String tamanioMapa, Boolean isRol, String desarrollador, String nombre, String anio) {
        super(desarrollador, nombre, anio);
        this.tamanioMapa = tamanioMapa;
        this.isRol = isRol;
    }

    public String getTamanioMapa() {
        return tamanioMapa;
    }

    public void setTamanioMapa(String tamanioMapa) {
        this.tamanioMapa = tamanioMapa;
    }

    public Boolean getIsRol() {
        return isRol;
    }

    public void setIsRol(Boolean isRol) {
        this.isRol = isRol;
    }

    @Override
    public String toString() {
        return "Aventura{" + "tamanioMapa=" + tamanioMapa + ", isRol=" + isRol + '}' + ' ' + super.toString();
    }
    
}
