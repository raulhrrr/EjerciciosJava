import java.util.Scanner;

public class DefinitivaDeLaMateria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        double notaUno = Double.parseDouble(sc.nextLine());

        System.out.println("Ingrese la segunda nota: ");
        double notaDos = Double.parseDouble(sc.nextLine());

        System.out.println("Ingrese la tercera nota: ");
        double notaTres = Double.parseDouble(sc.nextLine());

        double definitiva = (notaUno + notaDos + notaTres) / 3;
        System.out.println("La suma de los números ingresados da como resultado: " + definitiva);

        sc.close();
    }
}