package poo.actividad26septiembre;

public class Persona {

    private String nombre;
    private Integer edad;
    private Integer documentoIdentidad;

    public Persona(String nombre, Integer edad, Integer documentoIdentidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(Integer documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public void correr() {
        System.out.println("Soy " + this.nombre + " tengo " + this.edad + " años, mi documento de identidad es " + this.documentoIdentidad);
    }
    

    public void correr(int km) {
        System.out.println("He corrido " + km + " kilometros");
    }
    
    public void mostrarDatos() {
        System.out.println("El nombre es: " + getNombre());
        System.out.println("La edad es: " + getEdad());
    }

}
