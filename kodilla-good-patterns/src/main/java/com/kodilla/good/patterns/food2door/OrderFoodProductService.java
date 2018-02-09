package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderFoodProductService  {

    public boolean order(List<Product> product, Company company, boolean service) {
        if (service) {

            System.out.println(company + "\n" + product);
            return true;

        } else {

            return false;
        }
    }
}
