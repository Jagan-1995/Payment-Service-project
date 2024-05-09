package com.ecommerce.paymentservice.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter

public class InitiatePaymentDTO {

    private String orderId;
    private String email;
    private String phoneNumber;
    private Long amount;
}
