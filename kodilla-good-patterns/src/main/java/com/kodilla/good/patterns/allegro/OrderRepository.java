package com.kodilla.good.patterns.allegro;

public interface OrderRepository {

    boolean createOrder(User user, Product product);
}
