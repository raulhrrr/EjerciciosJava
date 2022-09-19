package poo.galletas;

public class MoldeEstrella extends MoldeBase {

    private Integer cantidadPuntas;

    public MoldeEstrella(String material, Float tamanio, String color, Integer cantidadPuntas) {
        super(material, tamanio, color);
        this.cantidadPuntas = cantidadPuntas;
    }

    public Integer getCantidadPuntas() {
        return cantidadPuntas;
    }

    public void setCantidadPuntas(Integer cantidadPuntas) {
        this.cantidadPuntas = cantidadPuntas;
    }

    @Override
    public String toString() {
        return "MoldeEstrella{" +
                "cantidadPuntas=" + cantidadPuntas +
                "} " + super.toString();
    }
}
