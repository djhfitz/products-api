package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        // Note: no new Product(...) anywhere — it is abstract now.
        products.add(new DigitalProduct(
                nextId++, "Digital Music Album", 9.99,
                "https://musicwebsiteexample.com/music24414.mp4", 120.0));
        products.add(new PhysicalProduct(
                nextId++, "Vinyl", 74.99, 0.350, "12-Inch LP"));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public List<String> getAllSummaries() {
        List<String> summaries = new ArrayList<>();
        for (Product p : products) {
            // One line. No instanceof, no casts, no type names.
            summaries.add(p.getSummary());
        }
        return summaries;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++); // use the value, then add one
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }
}