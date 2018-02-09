package com.kodilla.good.patterns.food2door;

import java.util.List;

public interface Firm {

    Company process(Company company);

    List<Product> getProductList();

}