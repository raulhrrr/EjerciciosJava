package poo.actividad26septiembre;

public class Fecha {

    private Integer dia;
    private String mes;
    private Integer anio;

    public Fecha(Integer dia, String mes, Integer anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public void mostrarFecha() {
        System.out.println(String.format("%d de %s del %s", dia, mes, anio));
    }

}
