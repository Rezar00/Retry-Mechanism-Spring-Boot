package org.roro.retrymechanismspringboot.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

        private ProductType productType;
        private int quantity;
        private BigDecimal price;
        private String customerName;
        private String address;
        private String description;
}
