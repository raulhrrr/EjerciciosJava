package poo.actividad20septiembre.notasestudiante;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Float notaUno = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la primera nota"));
        Float notaDos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la segunda nota"));
        Float notaTres = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tercera nota"));

        Notas notas = new Notas(notaUno, notaDos, notaTres);
        notas.mostrarResultado();

    }

}
