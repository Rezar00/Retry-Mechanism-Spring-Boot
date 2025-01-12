package org.roro.retrymechanismspringboot.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.roro.retrymechanismspringboot.data.Order;
import org.roro.retrymechanismspringboot.exception.OrderProcessException;
import org.roro.retrymechanismspringboot.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
@Slf4j
public class OrderApi {

    private final OrderService orderService;

    @GetMapping(path = "/check")
    public String checkApiIsReady() {
        log.info("Check endpoint with current thread: {}", Thread.currentThread());
        return "Order Api is ready to use";
    }

    @PostMapping(path = "/submit")
    public ResponseEntity<String> submitOrder(@RequestBody Order order) throws OrderProcessException {
        return ResponseEntity.ok(orderService.processOrder(order));
    }
}
