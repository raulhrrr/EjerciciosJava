package poo.herencia.ejercicios;

public class Main {

    public static void main(String[] args) {

        Empleado operario = new Operario("Arquitecto", 2500000F, "Alberto", "Rodriguez", 123456789);
        System.out.println("operario = " + operario);

        MedioTransporte motocicleta = new Motocicleta("Honda", "CB 190R 2023", 120, "Rojo", 250F, 8000000F);
        System.out.println("motocicleta = " + motocicleta);

        MedioTransporte automovil = new Automovil("Ford", "Focus", 0, "Negro", 120, false);
        System.out.println("automovil = " + automovil);

    }

}
