package org.roro.retrymechanismspringboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;


public class OrderProcessException extends ResponseStatusException {

    public OrderProcessException(String message) {
        super(HttpStatus.CONFLICT,message);
    }
}
