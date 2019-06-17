package Patterns;

public class ProductFilterByName implements ProductFilteringStrategy {
    private String name;

    public ProductFilterByName(String name) {
        this.name = name;
    }

    @Override
    public boolean filter(Product product) {
        return this.name.equals(product.getName());
    }
}
