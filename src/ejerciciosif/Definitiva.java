package ejerciciosif;

import java.util.Scanner;

public class Definitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        float notaUno = Float.parseFloat(sc.nextLine());
        System.out.println("Ingrese la segunda nota: ");
        float notaDos = Float.parseFloat(sc.nextLine());
        System.out.println("Ingrese la tercera nota: ");
        float notaTres = Float.parseFloat(sc.nextLine());
        
        float definitiva = (notaUno + notaDos + notaTres) / 3;
        
        if (definitiva <= 50 && definitiva >= 45) {
            System.out.println("Excelente");
        } else if (definitiva < 45 && definitiva >= 40) {
            System.out.println("Felicitaciones");
        } else if (definitiva < 40 && definitiva >= 35) {
            System.out.println("Sobresaliente");
        } else if (definitiva < 35 && definitiva >= 30) {
            System.out.println("Aceptable");
        } else {
            System.out.println("Perdió");
        }
    }
}
