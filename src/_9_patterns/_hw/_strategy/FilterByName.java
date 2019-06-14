package _9_patterns._hw._strategy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByName implements ProductFilteringStrategy<List<Product>> {
    @Override
    public void filter(List<Product> products) {

         products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
