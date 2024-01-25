package org.Assignment;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductSort {
    public static void main(String[] args) {
//        Write a program to create POJO class of Product (Product Id, ProductName) and
//        Store all values in any collection and Sort that values by ProductName in ascending order

        List<ProductPojo> product = new ArrayList<>();

        product.add(new ProductPojo(1,"vivo"));
        product.add(new ProductPojo(2,"oppo"));
        product.add(new ProductPojo(3,"apple"));
        product.add(new ProductPojo(4,"samsung"));
        product.add(new ProductPojo(5,"oneplus"));


        // Sort the products based on product name in descending order
        System.out.println("List of Product in Descending Order :");
        Collections.sort(product,Comparator.comparing(ProductPojo::getPName).reversed());
        for(ProductPojo prod:product){
            System.out.println(prod);
        }

        // Filter products whose name starts with 'S'
        List<ProductPojo> filter = product.stream()
                .filter(pro -> pro.getPName().toLowerCase().startsWith("s"))
                .collect(Collectors.toList());

        System.out.println("\nFilter products whose name starts with 'S'");
        for (ProductPojo prod : filter) {
            System.out.println("Product ID: " + prod.getPId() + ", Product Name: " + prod.getPName());
        }
    }
}
