package Patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> carsList = new ArrayList<>(Arrays.asList(new Product("BMW", 80000, 70000), new Product("Audi", 80000, 55000),
                new Product("BMW", 100000, 80000), new Product("Opel", 35000, 30000),
                new Product("VW", 16000, 12000)));
        ProductService service = new ProductService(carsList);
        System.out.println(service.filter(new ProductFilterByName("BMW")));
        System.out.println(service.filter(new ProductFilterByPrice(80000)));
        System.out.println(service.filter(new ProductsFilterBySellingPrice(12000)));
    }
}
