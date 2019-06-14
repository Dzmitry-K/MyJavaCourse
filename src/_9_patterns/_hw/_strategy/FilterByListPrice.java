package _9_patterns._hw._strategy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByListPrice implements ProductFilteringStrategy<List<Product>> {
    @Override
    public void filter(List<Product> products) {

         products.stream()
                .sorted(Comparator.comparingInt(Product::getListPrice))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
