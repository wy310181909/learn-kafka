package com.asher.kafka.base;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private Integer orderId;
    private Integer productId;
    private Integer productNum;
    private Double orderAmount;


}
