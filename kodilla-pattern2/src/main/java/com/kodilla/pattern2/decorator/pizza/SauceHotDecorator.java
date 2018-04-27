package com.kodilla.pattern2.decorator.pizza;

import java.math.BigDecimal;

public class SauceHotDecorator extends AbstractPizzaOrderDecorator {

    public SauceHotDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + ", hot sauce";
    }
}