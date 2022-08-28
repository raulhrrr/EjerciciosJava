import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorArticulosConIva {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("$###,###,##0.00");
        Scanner sc = new Scanner(System.in);

        int iteracion = 0;
        double valorProductos = 0;
        
        do {
            System.out.println("Ingrese el precio del producto #" + ++iteracion + ": ");
            String entrada = sc.nextLine();
            if ("".equals(entrada)) {
                break;
            }
            valorProductos += Double.parseDouble(entrada);
            
        } while (true);

        String valorProductosConIva = decimalFormat.format(valorProductos * 1.19);

        System.out.println("Valor de los productos incluyendo el iva: " + valorProductosConIva);
    }
}
