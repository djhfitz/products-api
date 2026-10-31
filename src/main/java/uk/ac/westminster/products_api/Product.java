package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //getters
    public Long getId() { return id; }
    public String getName() { return name; }
    // activity 3 tut 2 - i predict that because it cannot get the field it will just return nothing
    public double getPrice() { return price; }

    //setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

}
