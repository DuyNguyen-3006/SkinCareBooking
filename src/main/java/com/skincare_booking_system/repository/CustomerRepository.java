package com.skincare_booking_system.repository;

import com.skincare_booking_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository extends JpaRepository<User, String> {

}
