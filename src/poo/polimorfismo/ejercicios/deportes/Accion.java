package poo.polimorfismo.ejercicios.deportes;

public class Accion extends Juego {
    
    private String objetivo;
    private Float horasDeJuego;

    public Accion(String objetivo, Float horasDeJuego, String desarrollador, String nombre, String anio) {
        super(desarrollador, nombre, anio);
        this.objetivo = objetivo;
        this.horasDeJuego = horasDeJuego;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Float getHorasDeJuego() {
        return horasDeJuego;
    }

    public void setHorasDeJuego(Float horasDeJuego) {
        this.horasDeJuego = horasDeJuego;
    }

    @Override
    public String toString() {
        return "Accion{" + "objetivo=" + objetivo + ", horasDeJuego=" + horasDeJuego + '}' + ' ' + super.toString();
    }
    
}
