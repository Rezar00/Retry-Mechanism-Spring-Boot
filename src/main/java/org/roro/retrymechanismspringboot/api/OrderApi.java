package org.roro.retrymechanismspringboot.api;

import lombok.RequiredArgsConstructor;
import org.roro.retrymechanismspringboot.data.Order;
import org.roro.retrymechanismspringboot.exception.OrderProcessException;
import org.roro.retrymechanismspringboot.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderApi {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<String> saveTodo(@RequestBody Order order) throws OrderProcessException {
        return ResponseEntity.ok(orderService.processOrder(order));
    }
}
