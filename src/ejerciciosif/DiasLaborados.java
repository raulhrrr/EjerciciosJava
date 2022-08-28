package ejerciciosif;

import java.util.Scanner;

public class DiasLaborados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMinimo = 1000000, salarioEmpleado, auxilioTransporte = 117772;
        int diasLaborados;
        
        System.out.println("Ingrese el salario del empleado");
        salarioEmpleado = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese los días laborados");
        diasLaborados = Integer.parseInt(sc.nextLine());

        if (salarioEmpleado > salarioMinimo * 2) {
            System.out.println("No tiene auxilio de transporte");
            System.out.println("Valor devengado: " + ((salarioEmpleado / 30) * diasLaborados));
        } else {
            System.out.println("Recibe auxilio de transporte");
            System.out.println("Valor devengado: " + (((salarioEmpleado / 30) * diasLaborados) + auxilioTransporte));
        }
    }
}
