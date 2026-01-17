package com.example.stores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoresApplication {

    public static void main(String[] args) {

    //Instead of manually creating objects and injecting dependencies
    //we can allow spring to handle that by executing the code below
    ApplicationContext context = SpringApplication.run(StoresApplication.class, args);
    var orderService = context.getBean(OrderService.class); //Gets an object that is managed by spring

    //Passing in the "stripe" payment process to act as the order service
    //var orderService = new OrderService(new StripePaymentService());

        //open-closed principal
       // var orderService = new OrderService(new PayPalPaymentService());

        //Only use this method for optional dependencies
       // var orderService = new OrderService();
        //Using a setter to dynamially select the order service type
        orderService.setPaymentService(new PayPalPaymentService());
        orderService.placeOrder();
    }

}
