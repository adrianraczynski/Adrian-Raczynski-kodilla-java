package com.kodilla.pattern2.aop.OrderFacadeTest;

import com.kodilla.pattern2.facade.api.ItemDto;
import com.kodilla.pattern2.facade.api.OrderDto;
import com.kodilla.pattern2.facade.api.OrderFacade;
import com.kodilla.pattern2.facade.api.OrderProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderFacadeTest {

    @Autowired
    private OrderFacade orderFacade;

    @Test
    public void OrderFacadeTest () {

        OrderDto order = new OrderDto();
        order.addItem(new ItemDto(10L, 2));

        try {
            orderFacade.processingOrder(order,1L);
        } catch (OrderProcessingException ex){
            //business exception - should be handled in real application
        }

        //Problemem jest test. W teście dostajesz wyjątek, ale zamiast go wyrzucać to go łapiesz i ignorujesz co
        //daje fałszywy obraz, że wszystko jest OK. Ogólna zasada jest taka, że nie  łapiemy w testach wyjątków.

    }
}
