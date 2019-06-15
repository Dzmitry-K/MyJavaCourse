package _9_patterns._hw._strategy;

import java.util.List;

public class ProductService {

    private ProductFilteringStrategy filterStrategy;


    public void filter(ProductFilteringStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void applyFilter(List<Product> products){
        filterStrategy.filter(products);
    }
}
