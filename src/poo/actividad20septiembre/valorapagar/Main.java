package poo.actividad20septiembre.valorapagar;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String valorString = JOptionPane.showInputDialog("Ingrese el valor de artículo");
        String ivaString = JOptionPane.showInputDialog("Ingrese el iva a aplicar (se aplicará el 19% si no se ingresa el valor");
        String cantidadArticulosString = JOptionPane.showInputDialog("Ingrese la cantidad de artículos");

        Float valor = Float.parseFloat(!valorString.isEmpty() ? valorString : "0");
        Float iva = Float.parseFloat(!ivaString.isEmpty() ? ivaString : "19");
        Integer cantidadArticulos = Integer.parseInt(!cantidadArticulosString.isEmpty() ? cantidadArticulosString : "0");

        Articulo articulo = new Articulo(cantidadArticulos, valor, iva);
        articulo.mostrarValorTotal();

    }

}
