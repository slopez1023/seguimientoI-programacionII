package Models;

import Enums.PC;
import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Product {
    private  Long id;
    private String name;
    private PC category;
    private Double price;


    public Product(Long id, String name, PC category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PC getCategory() {
        return category;
    }

    public void setCategory(PC category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public String toString() {
        return "Producto ->" +
                "Id=" + id +
                ", Nombre del producto='" + name + '\'' +
                ", Categoria='" + category + '\'' +
                ", Precio=" + price ;
    }
    public static List<Product> products = new ArrayList<>();
}
