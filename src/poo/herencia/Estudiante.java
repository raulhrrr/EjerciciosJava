package poo.herencia;

public class Estudiante extends Persona {

    private Integer codigoEstudiante;
    private Float notaFinal;
    private String carrera;
    
    public Estudiante() {
        super();
    }

    public Estudiante(Integer codigoEstudiante, Float notaFinal, String carrera) {
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
        this.carrera = carrera;
    }

    public Estudiante(String nombre, String apellidos, Integer edad) {
        super(nombre, apellidos, edad);
    }

    public Estudiante(String nombre, String apellidos, Integer edad, Integer codigoEstudiante, Float notaFinal, String carrera) {
        super(nombre, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
        this.carrera = carrera;
    }

    public Float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Integer getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(Integer codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "Estudiante{" + "codigoEstudiante=" + codigoEstudiante + ", notaFinal=" + notaFinal + ", carrera=" + carrera + '}';
    }
    
}
