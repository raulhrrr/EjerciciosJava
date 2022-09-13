package POO;

public class AnimalVolador {

    private String nombre;
    private float velocidadVuelo;
    private float peso;
    private float tamanio;
    private String color;
    private char genero;
    
    public AnimalVolador() {
    }

    public AnimalVolador(String nombre, float velocidadVuelo, float peso, float tamanio, String color, char genero) {
        this.nombre = nombre;
        this.velocidadVuelo = velocidadVuelo;
        this.peso = peso;
        this.tamanio = tamanio;
        this.color = color;
        this.genero = genero;
    }

    // Attributes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVelocidadVuelo() {
        return velocidadVuelo;
    }

    public void setVelocidadVuelo(float velocidadVuelo) {
        this.velocidadVuelo = velocidadVuelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    
    // Methods
    public void comer() {
        System.out.println("El " + this.nombre + " está comiendo");
    }
    
    public void dormir() {
        System.out.println("El " + this.nombre + " está durmiendo");
    }
    
    public void volar() {
        System.out.println("El " + this.nombre + " está volando");
    }
    
    public void cazar() {
        System.out.println("El " + this.nombre + " está cazando");
    }
    
    public void extenderAlas() {
        System.out.println("El " + this.nombre + " extiende las alas");
    }

    @Override
    public String toString() {
        return "AnimalVolador{" + "nombre=" + nombre + ", velocidadVuelo=" + velocidadVuelo + ", peso=" + peso + ", tamanio=" + tamanio + ", color=" + color + ", genero=" + genero + '}';
    }
    
}
