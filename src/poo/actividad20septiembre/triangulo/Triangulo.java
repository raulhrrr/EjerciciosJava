package poo.actividad20septiembre.triangulo;

import javax.swing.*;

public class Triangulo {

    Float ladoUno;
    Float ladoDos;
    Float ladoTres;
    boolean esIsoceles;
    boolean esEquilatero;
    boolean esEscaleno;

    public void leerLados() {
        ladoUno = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer lado del triangulo: "));
        ladoDos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo lado del triangulo: "));
        ladoTres = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tercer lado del triangulo: "));
    }

    public void obtenerTipoTriangulo() {
        if (ladoUno.equals(ladoDos) && ladoUno.equals(ladoTres)) {
            esEquilatero = true;
        } else if (ladoUno.equals(ladoDos) || ladoUno.equals(ladoTres) || ladoDos.equals(ladoTres)) {
            esIsoceles = true;
        } else {
            esEscaleno = true;
        }
    }

    public void mostrarResultado() {
        System.out.println("El triangulo es isoceles? " + esIsoceles);
        System.out.println("El triangulo es equilatero? " + esEquilatero);
        System.out.println("El triangulo es escaleno? " + esEscaleno);
    }

}
