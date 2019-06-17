package Patterns;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    private List<Product> products;

    public ProductService(List<Product> products) {
        this.products = products;
    }

    public List<Product> filter(ProductFilteringStrategy filteringStrategy) {
        return products.stream()
                .filter(product -> filteringStrategy.filter(product))
                .collect(Collectors.toList());

    }
}
