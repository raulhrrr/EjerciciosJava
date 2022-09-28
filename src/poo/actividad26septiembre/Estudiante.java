package poo.actividad26septiembre;

public class Estudiante {

    private Integer nit;
    private String nombre;
    private String apellido;
    private String direccion;
    private Integer edad;

    public Estudiante() {
    }

    public Estudiante(Integer nit, String nombre, String apellido, String direccion, Integer edad) {
        this.nit = nit;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void estadoDeAnimo() {
        System.out.println("El estudiante está feliz porque pasó la materia");
    }
    
    public void estadoDeAnimo(boolean tieneMateriasPerdias) {
        if (tieneMateriasPerdias)
            System.out.println("El estudiante está triste porque perdió una o más materias");
    }
    
    public void mostrarDatos() {
        System.out.println("Nit: " + nit);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dirección: " + direccion);
        System.out.println("Edad: " + edad);
    }
}
