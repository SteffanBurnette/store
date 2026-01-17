package com.example.stores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private PaymentService paymentService;



    //Defining a constructor to perform efficient dependency injection
    //@Autowired
    public OrderService(@Qualifier("paypal") PaymentService  paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.processPayment(10.0);
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
