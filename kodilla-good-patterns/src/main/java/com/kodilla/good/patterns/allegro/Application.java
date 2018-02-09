package com.kodilla.good.patterns.allegro;

public class Application {

    public static void main (String[] args){

        User user = new User("Adam","Noga", "adam1234",25);
        Product product = new Product("Elektronika","Pralka Amica ZXS45",1449.99,12345);

        OrderRequest orderRequest = new OrderRequest(user, product);

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new OrderProductService (), new OrderProductRepository ());
        orderProcessor.process(orderRequest);
    }
}

