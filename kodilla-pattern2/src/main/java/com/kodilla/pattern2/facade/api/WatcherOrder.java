package com.kodilla.pattern2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WatcherOrder {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherOrder.class);

    @Before("execution(* com.kodilla.pattern2.facade.api.OrderFacade.processingOrder(..))" +
            "&& target(object) && args (order, userId) ")
    public void logOrder(Object object, OrderDto order, Long userId) {
        LOGGER.info(" Class: " + object.getClass().getName() + ", UserId: " + userId);
    }

    @Around("execution(* com.kodilla.pattern2.facade.api.OrderFacade.processingOrder(..))")
    public Object measureTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long beginTime = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long endTime = System.currentTimeMillis();
            LOGGER.info("The process lasted: " + (endTime - beginTime) + "[ms]");

        } catch (Throwable xyz) {
            LOGGER.error(xyz.getMessage());
            throw xyz;
        }
        return result;
    }
}
