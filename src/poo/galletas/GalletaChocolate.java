package poo.galletas;

public class GalletaChocolate extends GalletaBase {

    private Float gramosChocolate;
    private String saborChocolate;

    public GalletaChocolate(String color, String sabor, String forma, Float cantidadHarina, Float cantidadMantequilla, Float cantidadAzucar, Float cantidadSal, Integer cantidadHuevos, Float cantidadLevadura, Float cantidadEsenciaVainilla, Float gramosChocolate, String saborChocolate) {
        super(color, sabor, forma, cantidadHarina, cantidadMantequilla, cantidadAzucar, cantidadSal, cantidadHuevos, cantidadLevadura, cantidadEsenciaVainilla);
        this.gramosChocolate = gramosChocolate;
        this.saborChocolate = saborChocolate;
    }

    public Float getGramosChocolate() {
        return gramosChocolate;
    }

    public void setGramosChocolate(Float gramosChocolate) {
        this.gramosChocolate = gramosChocolate;
    }

    public String getSaborChocolate() {
        return saborChocolate;
    }

    public void setSaborChocolate(String saborChocolate) {
        this.saborChocolate = saborChocolate;
    }

    @Override
    public String toString() {
        return "GalletaChocolate{" +
                "gramosChocolate=" + gramosChocolate +
                ", saborChocolate='" + saborChocolate + '\'' +
                "} " + super.toString();
    }
}
