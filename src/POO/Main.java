package POO;

public class Main {

    public static void main(String[] args) {
        Coche[] coches = new Coche[3];
        
        coches[0] = new Coche("Amarillo", "Audi", 0);
        coches[1] = new Coche("Azul", "Ford", 0);
        coches[2] = new Coche("Verde", "Mazda", 0);
        
        for (Coche coche : coches) {
            System.out.println(coche);
        }

    }

}
