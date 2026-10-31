package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    // (a): empty no-arg constructor for Jackson
    public PhysicalProduct() {

    }
    // (b): full constructor
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        // First line must be super(id, name, price);
        super(id, name, price);
        // then assign this.weightKg and this.dimensions
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // (c): getWeightKg() and getDimensions()
    public double getWeightKg() { return weightKg; }
    public String getDimensions() { return dimensions; }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
