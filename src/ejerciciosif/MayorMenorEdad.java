package ejerciciosif;

import java.util.Scanner;

public class MayorMenorEdad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = Integer.parseInt(sc.nextLine());
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }
}
