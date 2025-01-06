package org.roro.retrymechanismspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class RetryMechanismSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetryMechanismSpringBootApplication.class, args);
    }

}
