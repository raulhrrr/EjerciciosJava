package poo.actividad20septiembre.cuadradoperimetro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Medida medida = new Medida();
        medida.leerLado();
        medida.calcularArea();
        medida.calcularPerimetro();
        medida.mostrarResultado();
        
    }
    
}
