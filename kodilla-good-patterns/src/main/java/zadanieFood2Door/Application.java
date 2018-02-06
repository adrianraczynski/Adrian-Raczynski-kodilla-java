package zadanieFood2Door;

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


        Company healthyShopCompany = new Company ("Healthy Shop","Pilecki 8/10 Street, 00-123 Warsaw",listOfHealthyShop,123);
        Company glutenFreeShopCompany = new Company ("Gluten Free Shop","Fieldorfa-Nila Street, 30-054 Cracow",listOfGlutenFreeShop,456);
        Company extraFoodShopCompany = new Company ("Extra Food Shop","Spalony Las 2a Street, 65-770 Zielona Gora",listOfExtraFoodShop,789);

        HealthyShop healthyShop = new HealthyShop(healthyShopCompany);
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(glutenFreeShopCompany);
        HealthyShop extraFoodShop = new HealthyShop(extraFoodShopCompany);

        healthyShop.process();
        glutenFreeShop.process();
        extraFoodShop.process();
    }
}

/**

 1) Każdy producent ma być jako osobna klasa?

 2) Czy to zadanie jest podobne do zadaania 9.1 czy 9.2 i trzeba robić klasę DTO? Jeżeli robimy DTO
 to musimy zrobić tak jak w 9.1/9.2 klasę odpowiedzialną za przyjęcie zamówienia i wysłanie go do bazy
 danych, ale jak wobec tego mamy się odnieść do wspólnej metody process () dla każdego producenta.

 3) Czy metoda process powinna oddawać typu boolean - chyba tak ponieważ ma ona zezwalać na realizację zamówienia

 4) Gdzie mamy stworzyć listę produktów, bo pewnie w metodzie main jest źle? Bo w klasie company jednym z atrybutów
 jest lista i wpisując argument do konstruktora nie mogę się odnieść do metody z klasy (która ma listę), tylko
 muszę wpisać zmienną.


 **/