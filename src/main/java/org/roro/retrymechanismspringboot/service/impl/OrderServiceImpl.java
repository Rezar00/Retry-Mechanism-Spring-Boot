package org.roro.retrymechanismspringboot.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.roro.retrymechanismspringboot.data.Order;
import org.roro.retrymechanismspringboot.exception.OrderProcessException;
import org.roro.retrymechanismspringboot.service.OrderService;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    private static final String PROCESS_MESSAGE = "Your order has been processed...";

    @Override
    @Retryable(
            retryFor = OrderProcessException.class,
            maxAttempts = 3,
            backoff = @Backoff(delay = 800))
    public String processOrder(Order order) {
        log.info("Your order has been processed...");

        if (order.getDescription().equalsIgnoreCase("SubmitOrderError")) {
            log.error("Order Cannot be submitted due to some network issues... trying again...");
            throw new OrderProcessException("Order cannot be submitted");
        }
        return PROCESS_MESSAGE;
    }


    @Recover
    public String recoverNotSubmittedOrders(OrderProcessException exception, Order order){
        log.info(order.getDescription());
        return "Recover Not Submitted Orders";
    }
}
