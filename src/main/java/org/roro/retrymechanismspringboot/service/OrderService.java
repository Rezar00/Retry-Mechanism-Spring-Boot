package org.roro.retrymechanismspringboot.service;

import org.roro.retrymechanismspringboot.data.Order;

public interface OrderService {

    String processOrder(Order order);
}
