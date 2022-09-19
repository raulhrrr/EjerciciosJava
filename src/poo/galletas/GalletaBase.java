package poo.galletas;

public class GalletaBase {

    private String color;
    private String sabor;
    private String forma;
    private Float cantidadHarina;
    private Float cantidadMantequilla;
    private Float cantidadAzucar;
    private Float cantidadSal;
    private Integer cantidadHuevos;
    private Float cantidadLevadura;
    private Float cantidadEsenciaVainilla;

    public GalletaBase(String color, String sabor, String forma, Float cantidadHarina, Float cantidadMantequilla, Float cantidadAzucar, Float cantidadSal, Integer cantidadHuevos, Float cantidadLevadura, Float cantidadEsenciaVainilla) {
        this.color = color;
        this.sabor = sabor;
        this.forma = forma;
        this.cantidadHarina = cantidadHarina;
        this.cantidadMantequilla = cantidadMantequilla;
        this.cantidadAzucar = cantidadAzucar;
        this.cantidadSal = cantidadSal;
        this.cantidadHuevos = cantidadHuevos;
        this.cantidadLevadura = cantidadLevadura;
        this.cantidadEsenciaVainilla = cantidadEsenciaVainilla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Float getCantidadHarina() {
        return cantidadHarina;
    }

    public void setCantidadHarina(Float cantidadHarina) {
        this.cantidadHarina = cantidadHarina;
    }

    public Float getCantidadMantequilla() {
        return cantidadMantequilla;
    }

    public void setCantidadMantequilla(Float cantidadMantequilla) {
        this.cantidadMantequilla = cantidadMantequilla;
    }

    public Float getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(Float cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public Float getCantidadSal() {
        return cantidadSal;
    }

    public void setCantidadSal(Float cantidadSal) {
        this.cantidadSal = cantidadSal;
    }

    public Integer getCantidadHuevos() {
        return cantidadHuevos;
    }

    public void setCantidadHuevos(Integer cantidadHuevos) {
        this.cantidadHuevos = cantidadHuevos;
    }

    public Float getCantidadLevadura() {
        return cantidadLevadura;
    }

    public void setCantidadLevadura(Float cantidadLevadura) {
        this.cantidadLevadura = cantidadLevadura;
    }

    public Float getCantidadEsenciaVainilla() {
        return cantidadEsenciaVainilla;
    }

    public void setCantidadEsenciaVainilla(Float cantidadEsenciaVainilla) {
        this.cantidadEsenciaVainilla = cantidadEsenciaVainilla;
    }

    public void hornear() {
        System.out.println("La galleta de " + this.getClass().getSimpleName() + " se está horneando");
    }

    public void darForma() {
        System.out.println("La galleta de " + this.getClass().getSimpleName() + " se le está dando forma");
    }

    public void mezclarIngredientes() {
        System.out.println("La galleta de " + this.getClass().getSimpleName() + " se está mezclando con los ingredientes");
    }

    public void preparar() {
        System.out.println("La galleta de " + this.getClass().getSimpleName() + " se está preparando");
    }

    @Override
    public String toString() {
        return "Galleta{" +
                "color='" + color + '\'' +
                ", sabor='" + sabor + '\'' +
                ", forma='" + forma + '\'' +
                ", cantidadHarina=" + cantidadHarina +
                ", cantidadMantequilla=" + cantidadMantequilla +
                ", cantidadAzucar=" + cantidadAzucar +
                ", cantidadSal=" + cantidadSal +
                ", cantidadHuevos=" + cantidadHuevos +
                ", cantidadLevadura=" + cantidadLevadura +
                ", cantidadEsenciaVainilla=" + cantidadEsenciaVainilla +
                '}';
    }
}
