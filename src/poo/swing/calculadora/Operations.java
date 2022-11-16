/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.swing.calculadora;

/**
 *
 * @author SALAS
 */
public class Operations {
    
    private double result;
    
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    public void add(double numberOne, double numberTwo) {
        setResult(numberOne + numberTwo);
    }
    
    
    public void substract(double numberOne, double numberTwo) {
        setResult(numberOne - numberTwo);
    }
    
    
    public void multiply(double numberOne, double numberTwo) {
        setResult(numberOne * numberTwo);
    }
    
    
    public void divide(double numberOne, double numberTwo) {
        setResult(numberOne / numberTwo);
    }

}
