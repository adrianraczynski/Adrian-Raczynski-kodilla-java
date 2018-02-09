package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main (String[] args){

        List<Product> listOfHealthyShop = new ArrayList<>();
        listOfHealthyShop.add(new Product("Eggs", "Healthy Food", 10, 1));
        listOfHealthyShop.add(new Product("Tomatoes","Healthy Food",8,2));
        listOfHealthyShop.add(new Product("Honey","Healthy Food",2,3));
        listOfHealthyShop.add(new Product("Chicken","Healthy Food",2,4));

        List<Product> listOfGlutenFreeShop = new ArrayList<>();
        listOfGlutenFreeShop.add(new Product("Bread","Gluten Free Food",2,1));
        listOfGlutenFreeShop.add(new Product("Flour","Gluten Free Food",5,2));
        listOfGlutenFreeShop.add(new Product("Milk","Gluten Free Food",3,3));
        listOfGlutenFreeShop.add(new Product("Rice","Gluten Free Food",6,4));

        List<Product> listOfExtraFoodShop = new ArrayList<>();
        listOfExtraFoodShop.add(new Product("Shrimps","Luxury Food",46,1));
        listOfExtraFoodShop.add(new Product("Caviar","Luxury Food",7,2));
        listOfExtraFoodShop.add(new Product("Truffles","Luxury Food",15,3));
        listOfExtraFoodShop.add(new Product("Fresh tuna","Luxury Food",1,4));

        Company healthyShopCompany = new Company ("Healthy Shop","Pilecki 8/10 Street, 00-123 Warsaw",123);
        Company glutenFreeShopCompany = new Company ("Gluten Free Shop","Fieldorfa-Nila Street, 30-054 Cracow",456);
        Company extraFoodShopCompany = new Company ("Extra Food Shop","Spalony Las 2a Street, 65-770 Zielona Gora",789);


        OrderFoodRequest orderFoodRequest = new OrderFoodRequest (listOfExtraFoodShop, extraFoodShopCompany );

        Processor processor = new Processor(new ExtraFoodShop(listOfExtraFoodShop, extraFoodShopCompany),new OrderFoodProductService());
        processor.runProcessor (orderFoodRequest);

    }
}

