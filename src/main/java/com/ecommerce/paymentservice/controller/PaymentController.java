package com.ecommerce.paymentservice.controller;


import com.ecommerce.paymentservice.dtos.InitiatePaymentDTO;
import com.ecommerce.paymentservice.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;


    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String initiatePayments(@RequestBody InitiatePaymentDTO request){

        return paymentService.initiatePayments(request.getOrderId(),
                                               request.getEmail(),
                                               request.getPhoneNumber(),
                                               request.getAmount());

    }
}
