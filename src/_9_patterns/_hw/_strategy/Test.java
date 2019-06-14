package _9_patterns._hw._strategy;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product("Bread", 10, 12);
        Product product2 = new Product("Water", 5, 7);
        Product product3 = new Product("Sweet", 2, 3);
        Product product4 = new Product("IceCream", 12, 15);

        List<Product> productList = Arrays.asList(product1, product2, product3, product4);

        ProductService productService = new ProductService();
        productService.filter(new FilterByName());
//        productService.filter(new FilterByListPrice());
//        productService.filter(new FilterBySellingPrice());
        productService.applyFilter(productList);


    }
}
