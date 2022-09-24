import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioPorDiasTrabajados {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("$###,###,##0.00");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de días trabajados: ");
        double diasTrabajdos = Double.parseDouble(sc.nextLine());

        double valorDia = 1000000 / 30;
        String salario = decimalFormat.format(diasTrabajdos * valorDia);

        System.out.println("Salario correspondiente para la cantidad de días trabajados: " + salario);

        sc.close();
    }
}