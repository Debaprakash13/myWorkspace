package com.javadev.os.api.service;

import com.javadev.os.api.common.Payment;
import com.javadev.os.api.common.TransactionRequest;
import com.javadev.os.api.common.TransactionResponse;
import com.javadev.os.api.entity.Order;
import com.javadev.os.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RefreshScope
public class OrderService {
    @Autowired
    private OrderRepository repository;
    @Autowired
    @Lazy
    private RestTemplate template;

    @Value("${microservice.payment-service.endpoints.endpoint.uri}")
    private String ENDPOINT_URL;

    public TransactionResponse saveOrder(TransactionRequest request) {
        String response = "";
        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());

        //rest call
        Payment paymentResponse = template.postForObject(ENDPOINT_URL, payment, Payment.class);
        response = paymentResponse.getPaymentStatus().equals("success") ? "payment processing successful and order placed" : "there was a failure with payment service, order added to cart";
        repository.save(order);
        return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransactionId(),response);
    }
}
