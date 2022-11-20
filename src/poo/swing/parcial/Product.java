package poo.swing.parcial;

import java.io.Serializable;

public class Product implements Serializable {

    private String name;
    private Integer quantity;
    private Double price;

    public Product() {
    }

    public Product(String name, Integer quantity, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public void getName(String nombre) {
        this.name = nombre;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer cantidad) {
        this.quantity = cantidad;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double precio) {
        this.price = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name=").append(name);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        return sb.toString();
    }
    
}
