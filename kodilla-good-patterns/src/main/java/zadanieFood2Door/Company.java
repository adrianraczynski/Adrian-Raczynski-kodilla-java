package zadanieFood2Door;

import java.util.List;
import java.util.Objects;

public class Company {

    private String companyName;
    private String companyAdres;
    private List<Product> product;
    private int companyID;

    public Company(String companyName, String companyAdres, List<Product> product, int companyID) {
        this.companyName = companyName;
        this.companyAdres = companyAdres;
        this.product = product;
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAdres() {
        return companyAdres;
    }

    public List<Product> getProduct() {
        return product;
    }

    public int getCompanyID() {
        return companyID;
    }

    @Override
    public String toString() {
        return "Company name: " + '\'' + companyName + '\'' +
                "; Adres: " + companyAdres  + "; Company ID: " + companyID + "\n" +
                "Order list: " + "\n" + product + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return companyID == company.companyID;
    }

    @Override
    public int hashCode() {

        return Objects.hash(companyID*7);
    }
}
