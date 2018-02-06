package zadanieFood2Door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Firm{

    private Company company;

    public GlutenFreeShop(Company company) {
        this.company = company;
    }

    public void process() {
        System.out.println(company);

    }

    public Company getCompany() {
        return company;
    }


    public void exampel () {

        List<Product> listOfGlutenFreeShop = new ArrayList<>();

        listOfGlutenFreeShop.add(new Product("Bread","Gluten Free Food",2,1));
        listOfGlutenFreeShop.add(new Product("Flour","Gluten Free Food",5,2));
        listOfGlutenFreeShop.add(new Product("Milk","Gluten Free Food",3,3));
        listOfGlutenFreeShop.add(new Product("Rice","Gluten Free Food",6,4));

    }
}
