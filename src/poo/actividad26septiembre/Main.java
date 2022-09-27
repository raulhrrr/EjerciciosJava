package poo.actividad26septiembre;

public class Main {

    public static void main(String[] args) {
        
        Persona persona = new Persona("Alejandro", 21);
        persona.mostrarDatos();

        System.out.println("");

        Fecha fecha = new Fecha(12, "Febrero", 2022);
        fecha.mostrarFecha();

        System.out.println("");

        Estudiante estudiante = new Estudiante(123456, "Camilo", "Heredia", "Cll 45 bis", 23);
        estudiante.mostrarDatos();

        System.out.println("");

        Auto auto = new Auto("ABC123", "Naranaja", "Ford", 1500, 2021);
        auto.mostrarDatos();

    }
    
}
