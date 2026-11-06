package uk.ac.westminster.products_api;

public class DigitalProduct extends Product
        implements Discountable {
    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;
    public DigitalProduct() {
    }
    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB) {
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
        this.discountedPrice = price; // no discount applied yet
    }
    @Override
    public String getSummary() {
        // getName(), not name — name is private to Product.
        return "Digital: " + getName()
                + " | Download: " + downloadUrl;
    }
    @Override
    public void applyDiscount(double rate) {
        // Nothing is shipped, so the full rate applies.
        this.discountedPrice = getPrice() * (1 - rate);
    }
    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
    public String getDownloadUrl() { return downloadUrl; }
    public double getFileSizeMB() { return fileSizeMB; }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
}