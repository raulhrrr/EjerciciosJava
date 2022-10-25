package poo.polimorfismo;

public class Main {

    public static void main(String[] args) {

        Vehiculo normal = new Vehiculo("GH67", "Ferrari", "A89");
        Vehiculo deportivo = new VehiculoDeportivo("45GH", "Toyota", "KJ8", 500);
        Vehiculo turismo = new VehiculoTurismo("78HJ", "Audi", "P14", 4);
        Vehiculo furgoneta = new VehiculoFurgoneta("J18", "Toyota", "J9", 2000);

        Vehiculo[] vehiculos = {normal, deportivo, turismo, furgoneta};

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }

    }

}
