package org.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductSort {
    public static void main(String[] args) {
        List<ProductPojo> product = new ArrayList<>();

        product.add(new ProductPojo(1,"vivo"));
        product.add(new ProductPojo(2,"oppo"));
        product.add(new ProductPojo(3,"apple"));
        product.add(new ProductPojo(4,"samsung"));
        product.add(new ProductPojo(5,"oneplus"));


        Collections.sort(product,Comparator.comparing(ProductPojo::getName));
        for(ProductPojo prod:product){
            System.out.println(prod);
        }
    }
}
