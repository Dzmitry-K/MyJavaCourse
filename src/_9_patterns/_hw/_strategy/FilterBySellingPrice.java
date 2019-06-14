package _9_patterns._hw._strategy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterBySellingPrice implements ProductFilteringStrategy<List<Product>> {
    @Override
    public void filter(List<Product> products) {

         products.stream()
                .sorted(Comparator.comparingInt(Product::getSellingPrice))
                .collect(Collectors.toList())
                 .forEach(System.out::println);

    }
}
