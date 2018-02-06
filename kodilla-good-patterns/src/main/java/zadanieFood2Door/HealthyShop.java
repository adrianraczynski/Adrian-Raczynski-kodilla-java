package zadanieFood2Door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Firm {

    private Company company;

    public HealthyShop(Company company) {
        this.company = company;
    }

    public void process() {
        System.out.println(company);
    }

    public Company getCompany() {
        return company;
    }

    public void exampel () {

        List<Product> listofHealthyShop = new ArrayList<>();
        listofHealthyShop.add(new Product("eggs", "Healthy Food", 10, 1));
        listofHealthyShop.add(new Product("Tomatoes","Healthy Food",8,2));
        listofHealthyShop.add(new Product("Honey","Healthy Food",2,3));
        listofHealthyShop.add(new Product("Chicken","Healthy Food",2,4));
    }

}
