package poo.actividad20septiembre.cuadradoperimetro;

import javax.swing.JOptionPane;

public class Medida {

    Float lado;
    Float area;
    Float perimetro;
    
    public void leerLado() {
        lado = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado del cuadrado: "));
    }
    
    public void calcularArea() {
        area = lado * lado;
    }
    
    public void calcularPerimetro() {
        perimetro = lado * 4;
    }
    
    public void mostrarResultado() {
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
    
}
