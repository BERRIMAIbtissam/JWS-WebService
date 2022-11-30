package com.example.billingservice;

import com.example.billingservice.feign.CustomerRestClient;
import com.example.billingservice.feign.ProductItemRestClient;
import com.example.billingservice.models.Customer;
import com.example.billingservice.repositories.BillRepository;
import com.example.billingservice.repositories.ProductItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Collection;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

@Bean
    CommandLineRunner run(BillRepository billRepository
        , ProductItemRepository productItemRepository
        , CustomerRestClient customerRestClient
                          , ProductItemRestClient productItemRestClient )
{
    return  args -> {
        Customer customer=customerRestClient.getCustomerById(1L);
        System.out.println("---------------------");
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getId());
    };
}
}
