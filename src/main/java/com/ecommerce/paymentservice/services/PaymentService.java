package com.ecommerce.paymentservice.services;

import com.ecommerce.paymentservice.paymentGateways.PaymentGateway;
import com.ecommerce.paymentservice.paymentGateways.PaymentGatewayStrategyChooser;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGatewayStrategyChooser paymentGatewayStrategyChooser;

    public PaymentService(PaymentGatewayStrategyChooser paymentGatewayStrategyChooser) {
        this.paymentGatewayStrategyChooser = paymentGatewayStrategyChooser;
    }

    public String initiatePayments(String orderId, String email, String phoneNumber, Long amount) {
        // Order order = orderService.getOrderDetails(orderId)
        // Long amount = order.getAmount();
        // double amount = 10.10; // store number * 100
        // String orderId, String email, String phoneNumber, Long amount
//        Long amount = 1010L; // 10.00 => 1000
        PaymentGateway paymentGateway = paymentGatewayStrategyChooser.getBestPaymentGateway();

        return paymentGateway.generatePaymentLink(orderId,email,phoneNumber,amount);
    }
}
