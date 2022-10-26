package poo.polimorfismo.ejercicios.deportes;

public class Musical extends Juego {
    
    private String tipoMusica;
    private String categoriaEdad;

    public Musical(String tipoMusica, String categoriaEdad, String desarrollador, String nombre, String anio) {
        super(desarrollador, nombre, anio);
        this.tipoMusica = tipoMusica;
        this.categoriaEdad = categoriaEdad;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public String getCategoriaEdad() {
        return categoriaEdad;
    }

    public void setCategoriaEdad(String categoriaEdad) {
        this.categoriaEdad = categoriaEdad;
    }

    @Override
    public String toString() {
        return "Musical{" + "tipoMusica=" + tipoMusica + ", categoriaEdad=" + categoriaEdad + '}' + ' ' + super.toString();
    }
    
}
