package com.example.stores;

public interface PaymentService {
    //In a rela application the parameter here would be card information
    void processPayment(double amount);
}
