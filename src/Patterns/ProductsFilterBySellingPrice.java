package Patterns;

public class ProductsFilterBySellingPrice implements ProductFilteringStrategy {
    private Integer sellingPrice;

    public ProductsFilterBySellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public boolean filter(Product product) {
        return this.sellingPrice.equals(product.getSellingPrice());
    }
}
