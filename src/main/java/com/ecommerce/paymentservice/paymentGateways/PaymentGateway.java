package com.ecommerce.paymentservice.paymentGateways;

public interface PaymentGateway {

    String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount);
}
