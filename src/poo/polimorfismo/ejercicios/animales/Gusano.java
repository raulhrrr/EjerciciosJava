package poo.polimorfismo.ejercicios.animales;

public class Gusano extends Animal {

    private String grosor;

    public Gusano(String grosor) {
        this.grosor = grosor;
    }

    public Gusano(String grosor, String raza, String color, Float tamanio, String habitat, String taxonomia) {
        super(raza, color, tamanio, habitat, taxonomia);
        this.grosor = grosor;
    }

    public String getGrosor() {
        return grosor;
    }

    public void setGrosor(String grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Gusano{" + "grosor=" + grosor + '}' + ' ' + super.toString();
    }
    
}
