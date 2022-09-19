package poo.galletas;

public class MoldeTriangular extends MoldeBase {

    private String tipoTriangulo;

    public MoldeTriangular(String material, Float tamanio, String color, String tipoTriangulo) {
        super(material, tamanio, color);
        this.tipoTriangulo = tipoTriangulo;
    }

    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }

    @Override
    public String toString() {
        return "MoldeTriangular{" +
                "tipoTriangulo='" + tipoTriangulo + '\'' +
                "} " + super.toString();
    }
}
