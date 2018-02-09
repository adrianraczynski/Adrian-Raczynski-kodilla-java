package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop {

    private Company company;
    private List<Product> productList;

    public GlutenFreeShop(Company company, List<Product> productList) {
        this.company = company;
        this.productList = productList;
    }

    public Company process() {
       return company;
    }

    public List<Product> getProductList() {

        List<Product> listOfGlutenFreeShop = new ArrayList<>();
        listOfGlutenFreeShop.add(new Product("Bread","Gluten Free Food",2,1));
        listOfGlutenFreeShop.add(new Product("Flour","Gluten Free Food",5,2));
        listOfGlutenFreeShop.add(new Product("Milk","Gluten Free Food",3,3));
        listOfGlutenFreeShop.add(new Product("Rice","Gluten Free Food",6,4));

        return listOfGlutenFreeShop;
    }
}
