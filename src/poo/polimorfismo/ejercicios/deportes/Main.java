package poo.polimorfismo.ejercicios.deportes;

public class Main {

    public static void main(String[] args) {
        
        Juego accion = new Accion("Ganar", 20F, "Nakamoto", "Juego de acción", "2021");  
        Juego deporte = new Deporte("Futbol", 50, "Otro desarrollador", "Fifa", "2015");
        Juego simulacion = new Simulacion("PS4", 10, "Other developer", "Meta", "2023");
        Juego musical = new Musical("Salsa", "Todas", "Other", "Salsa Music", "2018");
        Juego aventura = new Aventura("Gigante", true, "Santa Monica Studios", "God Of War", "2022");
        
        System.out.println("accion = " + accion);
        System.out.println("deporte = " + deporte);
        System.out.println("simulacion = " + simulacion);
        System.out.println("musical = " + musical);
        System.out.println("aventura = " + aventura);
        
    }
    
}
