package com.example.billingservice.entities;

import com.example.billingservice.models.Customer;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItem;
    private long  customerID;
    @Transient
    private Customer customer;


}
