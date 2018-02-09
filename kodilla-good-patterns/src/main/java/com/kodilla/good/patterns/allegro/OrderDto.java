package com.kodilla.good.patterns.allegro;

public class OrderDto {

    private User user;
    private Product product;
    private boolean isOrder;

    public OrderDto(final User user, final Product product, final boolean isOrder) {
        this.user = user;
        this.product = product;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
