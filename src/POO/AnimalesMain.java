package POO;

public class AnimalesMain {

    public static void main(String[] args) {

        AnimalVolador[] animalesVoladores = new AnimalVolador[2];

        animalesVoladores[0] = new AnimalVolador("Aguila", 150, 5, 7, "Naranja", 'M');
        animalesVoladores[1] = new AnimalVolador("Pelicano", 60, 15, 150, "Blanco", 'F');

        for (AnimalVolador animal : animalesVoladores) {
            System.out.println(animal);
            animal.cazar();
            animal.comer();
            animal.dormir();
            animal.extenderAlas();
            animal.volar();
        }

    }

}
