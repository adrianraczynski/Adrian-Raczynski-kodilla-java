package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {

   final String countryName;
   final BigDecimal peopleQuantity;

    public Country(final String countryName,final BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(getCountryName(), country.getCountryName()) &&
                Objects.equals(getPeopleQuantity(), country.getPeopleQuantity());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCountryName(), getPeopleQuantity());
    }
}
