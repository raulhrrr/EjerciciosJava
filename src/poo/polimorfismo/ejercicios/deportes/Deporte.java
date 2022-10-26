package poo.polimorfismo.ejercicios.deportes;

public class Deporte extends Juego {
    
    private String tipo;
    private Integer cantidadPersonajes;

    public Deporte(String tipo, Integer cantidadPersonajes, String desarrollador, String nombre, String anio) {
        super(desarrollador, nombre, anio);
        this.tipo = tipo;
        this.cantidadPersonajes = cantidadPersonajes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidadPersonajes() {
        return cantidadPersonajes;
    }

    public void setCantidadPersonajes(Integer cantidadPersonajes) {
        this.cantidadPersonajes = cantidadPersonajes;
    }

    @Override
    public String toString() {
        return "Deporte{" + "tipo=" + tipo + ", cantidadPersonajes=" + cantidadPersonajes + '}' + ' ' + super.toString();
    }
    
}
