import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorArticuloConIva {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("$###,###,##0.00");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del producto: ");
        double valorProducto = Double.parseDouble(sc.nextLine());
        String valorProductoConIva = decimalFormat.format(valorProducto * 1.19);

        System.out.println("Valor del producto incluyendo el iva: " + valorProductoConIva);
    }
}
