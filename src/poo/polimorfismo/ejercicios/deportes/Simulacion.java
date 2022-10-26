package poo.polimorfismo.ejercicios.deportes;

public class Simulacion extends Juego {
    
    private String consola;
    private Integer nivelRealismo;

    public Simulacion(String consola, Integer nivelRealismo, String desarrollador, String nombre, String anio) {
        super(desarrollador, nombre, anio);
        this.consola = consola;
        this.nivelRealismo = nivelRealismo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public Integer getNivelRealismo() {
        return nivelRealismo;
    }

    public void setNivelRealismo(Integer nivelRealismo) {
        this.nivelRealismo = nivelRealismo;
    }

    @Override
    public String toString() {
        return "Simulacion{" + "consola=" + consola + ", nivelRealismo=" + nivelRealismo + '}' + ' ' + super.toString();
    }
    
}
