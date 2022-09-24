package poo.operaciones;

import javax.swing.*;

public class Operacion {

    float numeroUno;
    float numeroDos;
    float resultadoSuma;
    float resultadoResta;
    float resultadoMultiplicacion;
    float resultadoDivision;
    float resultadoExponenciacion;

    public void leerNumeros() {
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
    }

    public void sumar() {
        resultadoSuma = numeroUno + numeroDos;
    }

    public void restar() {
        resultadoResta = numeroUno - numeroDos;
    }

    public void multiplicar() {
        resultadoMultiplicacion = numeroUno * numeroDos;
    }

    public void dividir() {
        resultadoDivision = numeroUno / numeroDos;
    }

    public void elevado() {
        resultadoExponenciacion = (float) Math.pow(numeroUno, numeroDos);
    }

    public void mostrarResultado() {
        System.out.println("La suma es: " + resultadoSuma);
        System.out.println("La resta es: " + resultadoResta);
        System.out.println("La multiplicacion es: " + resultadoMultiplicacion);
        System.out.println("La division es: " + resultadoDivision);
        System.out.println("La exponenciacion es: " + resultadoExponenciacion);
    }

}
