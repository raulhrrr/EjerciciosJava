package poo.actividad26septiembre;

public class Main {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Alejandro", 21, 123456789);
        persona1.mostrarDatos();
        persona1.correr();
        persona1.correr(100);
        
        System.out.println("");

        Fecha fecha = new Fecha(12, "Febrero", 2022);
        fecha.mostrarFecha();

        System.out.println("");

        Estudiante estudiante = new Estudiante(123456, "Camilo", "Heredia", "Cll 45 bis", 23);
        estudiante.mostrarDatos();
        estudiante.estadoDeAnimo();
        estudiante.estadoDeAnimo(false);

        System.out.println("");

        Auto auto = new Auto("ABC123", "Naranaja", "Ford", 1500, 2021);
        System.out.println(auto);
        Auto auto2 = new Auto("ABC123", "Ford", 2021);
        System.out.println(auto2);

    }
    
}
