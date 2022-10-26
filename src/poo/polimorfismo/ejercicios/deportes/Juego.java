package poo.polimorfismo.ejercicios.deportes;

public class Juego {

    private String desarrollador;
    private String nombre;
    private String anio;

    public Juego(String desarrollador, String nombre, String anio) {
        this.desarrollador = desarrollador;
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Juego{" + "desarrollador=" + desarrollador + ", nombre=" + nombre + ", anio=" + anio + '}';
    }
    
}
