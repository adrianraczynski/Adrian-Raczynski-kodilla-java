package zadanieAllegro;

import java.util.Objects;

public class Product {

    private String productCategory;
    private String productName;
    private double productPrice;
    private int productNumber;

    public Product(String productCategory, String productName, double productPrice, int productNumber) {
        this.productCategory = productCategory;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productNumber = productNumber;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrie() {
        return productPrice;
    }

    public int getProductNumber() {
        return productNumber;
    }

    @Override
    public String toString() {
        return "Product: " + productName + ", Price: " + productPrice + "\n" +
                "Category: " + productCategory +  " $" + ", Product Number: " + productNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return productNumber == product.productNumber;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getProductNumber()*7);
    }
}
