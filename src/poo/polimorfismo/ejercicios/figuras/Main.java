package poo.polimorfismo.ejercicios.figuras;

public class Main {

    public static void main(String[] args) {
        
        FiguraGeometrica circulo = new Circulo(5F, "Rojito", 20F, 50F, 35F);
        FiguraGeometrica cuadrado = new Cuadrado(4, "Verde", 15F, 40F, 60F);
        FiguraGeometrica rectangulo = new Rectangulo(3, "Naranja", 20F, 40F, 15F);
        FiguraGeometrica triangulo = new Triangulo("Equilatero", "Blanco", 35F, 30F, 30F);
        
        System.out.println("circulo = " + circulo);
        System.out.println("cuadrado = " + cuadrado);
        System.out.println("rectangulo = " + rectangulo);
        System.out.println("triangulo = " + triangulo);
        
    }
    
}
