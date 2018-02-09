package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderFoodRequest {

    private List<Product> product;
    private Company company;


    public OrderFoodRequest(List<Product> product, Company company) {
        this.product = product;
        this.company = company;
    }

    public List<Product> getProduct() {
        return product;
    }

    public Company getCompany() {
        return company;
    }
}
