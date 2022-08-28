import java.util.Scanner;

public class SumarTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double numeroUno = Double.parseDouble(sc.nextLine());

        System.out.println("Ingrese el segundo número: ");
        double numeroDos = Double.parseDouble(sc.nextLine());
        
        System.out.println("Ingrese el tercer número: ");
        double numeroTres = Double.parseDouble(sc.nextLine());

        double suma = numeroUno + numeroDos + numeroTres;
        System.out.println("La suma de los números ingresados da como resultado: " + suma);

        sc.close();
    }
}