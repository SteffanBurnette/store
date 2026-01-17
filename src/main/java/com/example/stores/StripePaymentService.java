package com.example.stores;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {

    //In a rela application the parameter here would be card information
    @Override
    public void processPayment(double amount){

        System.out.println("Stripe");
        System.out.println("Amount: " + amount + " paid.");
    }
}
