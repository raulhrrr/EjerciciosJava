package ejerciciosif;

import java.util.Scanner;

public class Voley {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su estatura");
        float estatura = Float.parseFloat(sc.nextLine());
        System.out.println("Ingrese su peso");
        float peso = Float.parseFloat(sc.nextLine());
        
        if (estatura > 180 && peso < 70) {
            System.out.println("Puede jugar");
        } else {
            System.out.println("No puede jugar");
        }
    }
}
