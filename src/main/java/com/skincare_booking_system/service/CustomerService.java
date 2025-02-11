package com.skincare_booking_system.service;

import com.skincare_booking_system.dto.request.CustomerLoginRequest;
import com.skincare_booking_system.entity.User;
import com.skincare_booking_system.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public User loginCustomer(CustomerLoginRequest request) {
        
    }
}
