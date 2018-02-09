package com.kodilla.good.patterns.food2door;

public class Processor {

    private Firm firm;
    private OrderFoodProductService orderFoodProductService;

    public Processor(final Firm firm, final OrderFoodProductService orderFoodProductService) {
        this.firm = firm;
        this.orderFoodProductService = orderFoodProductService;
    }

    public Dto runProcessor (final OrderFoodRequest orderFoodRequest){

        boolean isOrder = orderFoodProductService.order(orderFoodRequest.getProduct(), orderFoodRequest.getCompany(), true);

        if (isOrder) {

            firm.process(orderFoodRequest.getCompany());

            return new Dto(orderFoodRequest.getProduct(), orderFoodRequest.getCompany(), true);
        } else {
            return new Dto(orderFoodRequest.getProduct(),orderFoodRequest.getCompany(), false);
        }

    }
}