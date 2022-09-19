package poo.galletas;

public class GalletaChips extends GalletaBase {

    private Integer cantidadChips;
    private String saborChips;

    public GalletaChips(String color, String sabor, String forma, Float cantidadHarina, Float cantidadMantequilla, Float cantidadAzucar, Float cantidadSal, Integer cantidadHuevos, Float cantidadLevadura, Float cantidadEsenciaVainilla, Integer cantidadChips, String saborChips) {
        super(color, sabor, forma, cantidadHarina, cantidadMantequilla, cantidadAzucar, cantidadSal, cantidadHuevos, cantidadLevadura, cantidadEsenciaVainilla);
        this.cantidadChips = cantidadChips;
        this.saborChips = saborChips;
    }

    public Integer getCantidadChips() {
        return cantidadChips;
    }

    public void setCantidadChips(Integer cantidadChips) {
        this.cantidadChips = cantidadChips;
    }

    public String getSaborChips() {
        return saborChips;
    }

    public void setSaborChips(String saborChips) {
        this.saborChips = saborChips;
    }

    @Override
    public String toString() {
        return "GalletaChips{" +
                "cantidadChips=" + cantidadChips +
                ", saborChips='" + saborChips + '\'' +
                "} " + super.toString();
    }
}
