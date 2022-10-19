package poo.herencia.ejercicios;

public class Operario extends Empleado {

    private String cargoOperario;
    private Float salarioOperario;

    public Operario() {
        super();
    }
    
    public Operario(String cargoOperario, Float salarioOperario, String nombre, String apellidos, Integer cedula) {
        super(nombre, apellidos, cedula);
        this.cargoOperario = cargoOperario;
        this.salarioOperario = salarioOperario;
    }

    public Float getSalarioOperario() {
        return salarioOperario;
    }

    public void setSalarioOperario(Float salarioOperario) {
        this.salarioOperario = salarioOperario;
    }

    public String getCargoOperario() {
        return cargoOperario;
    }

    public void setCargoOperario(String cargoOperario) {
        this.cargoOperario = cargoOperario;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "Operario{" + "cargoOperario=" + cargoOperario + ", salarioOperario=" + salarioOperario + '}';
    }

}
