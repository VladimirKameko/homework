package Patterns;

public class ProductFilterByPrice implements ProductFilteringStrategy {
    private Integer price;

    public ProductFilterByPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean filter(Product product) {
        return this.price.equals(product.getListPrice());
    }
}
