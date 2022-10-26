package poo.polimorfismo.ejercicios.animales;

public class Main {

    public static void main(String[] args) {
        
        Animal delfin = new Delfin(2F, "Delphinidae", "Azul", 3F, "Oceano", "Mamifero");
        Animal gato = new Gato("Verdes", "Angora", "Negro", 50F, "Hogar", "Mamifero");
        Animal gusano = new Gusano("5", "Gusanito", "Rosado", 10F, "Cualquier lugar", "Desconocida");
        
        System.out.println("delfin = " + delfin);
        System.out.println("gato = " + gato);
        System.out.println("gusano = " + gusano);
    }
    
}
