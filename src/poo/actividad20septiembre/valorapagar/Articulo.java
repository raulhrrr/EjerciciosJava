package poo.actividad20septiembre.valorapagar;

public class Articulo {

    private Float valorArticulo;
    private Float iva;
    private Integer cantidadArticulos;

    public Articulo(Integer cantidadArticulos, Float valorArticulo, Float iva) {
        this.valorArticulo = valorArticulo;
        this.iva = iva;
        this.cantidadArticulos = cantidadArticulos;
    }

    public void mostrarValorTotal() {
        Float valorTotal = (this.valorArticulo * this.cantidadArticulos) * (1 + (this.iva / 100));
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Para pago en efectivo se aplica descuento del 15%: " + valorTotal * .85);
        System.out.println("Para pago con tarjeta debito se aplica descuento del 10%: " + valorTotal * .90);
        System.out.println("Para pago con tarjeta de crédito se aplica descuento del 5%: " + valorTotal * .95);
    }

    public Float getValorArticulo() {
        return valorArticulo;
    }

    public void setValorArticulo(Float valorArticulo) {
        this.valorArticulo = valorArticulo;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public Integer getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(Integer cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }
}
