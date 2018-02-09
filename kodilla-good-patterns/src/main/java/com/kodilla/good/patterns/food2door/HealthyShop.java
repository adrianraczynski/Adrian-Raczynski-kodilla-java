package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop  {

    private Company company;
    private List<Product> productList;

    public HealthyShop(Company company, List<Product> productList) {
        this.company = company;
        this.productList = productList;
    }

    public Company process() {
        return company;
    }


    public List<Product> getProductList() {

        List<Product> listOfHealthyShop = new ArrayList<>();
        listOfHealthyShop.add(new Product("Eggs", "Healthy Food", 10, 1));
        listOfHealthyShop.add(new Product("Tomatoes","Healthy Food",8,2));
        listOfHealthyShop.add(new Product("Honey","Healthy Food",2,3));
        listOfHealthyShop.add(new Product("Chicken","Healthy Food",2,4));

        return listOfHealthyShop;
    }
}
