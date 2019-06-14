package _9_patterns._hw._strategy;

import java.util.List;

public class ProductService {

    private ProductFilteringStrategy filterStrategy;
    private List<Product> products;

    public void filter(ProductFilteringStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void applyFilter(List<Product> products){
        filterStrategy.filter(products);
    }
}
