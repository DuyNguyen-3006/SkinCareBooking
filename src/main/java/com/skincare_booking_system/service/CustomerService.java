package com.skincare_booking_system.service;

import com.skincare_booking_system.dto.request.CustomerLoginRequest;
import com.skincare_booking_system.entity.User;
import com.skincare_booking_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private UserRepository customerRepository;

}
