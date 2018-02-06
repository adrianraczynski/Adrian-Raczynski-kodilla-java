package zadanieFood2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Firm{

    private Company company;

    public ExtraFoodShop(Company company) {
        this.company = company;
    }

    public void process() {
        System.out.println(company);
    }

    public Company getCompany() {
        return company;
    }


    public void exampel () {

        List<Product> listofExtraFoodShop = new ArrayList<>();

        listofExtraFoodShop.add(new Product("Shrimps","Luxury Food",46,1));
        listofExtraFoodShop.add(new Product("Caviar","Luxury Food",7,2));
        listofExtraFoodShop.add(new Product("Truffles","Luxury Food",15,3));
        listofExtraFoodShop.add(new Product("Fresh tuna","Luxury Food",1,4));


    }
}
