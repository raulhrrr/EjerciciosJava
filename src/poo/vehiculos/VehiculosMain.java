package poo.vehiculos;

public class VehiculosMain {

    public static void main(String[] args) {
        TransporteBase[] vehiculos = new TransporteBase[7];

        vehiculos[0] = new Uber(4, "Amarillo", "ABC123", 4F, 120F, 0F, "Audi");
        vehiculos[1] = new Taxi(4, "Amarillo", "ABC123", 4F, 120F, 0F, "Audi", 22000F);
        vehiculos[2] = new MotoTaxi(2, "Azul", "BCA231", 2F, 60F, 0F, 90F);
        vehiculos[3] = new Sitp(4, "Negro", "CBA321", 4F, 110F, 0F, 4, 2500F, 4, 20, 50);
        vehiculos[4] = new Intermunicipal(4, "Negro", "CBA321", 4F, 110F, 0F, 26, 5500F, 4, 20, 50);
        vehiculos[5] = new Transmilenio(4, "Negro", "CBA321", 4F, 110F, 0F, 5500F, 4, 53, 150);
        vehiculos[6] = new Tren(10, "Gris", "XCV234", 140F, 180F, 0F, "Acero", 6);

        for (TransporteBase vehiculo : vehiculos) {
            vehiculo.avanzar();
            vehiculo.detenerse();
            vehiculo.retroceder();
            vehiculo.pitar();

            System.out.println(vehiculo);
            System.out.println("");
        }

    }

}
