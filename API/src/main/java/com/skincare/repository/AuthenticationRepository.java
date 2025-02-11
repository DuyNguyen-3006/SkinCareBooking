package com.skincare.repository;

import com.skincare.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AuthenticationRepository  extends JpaRepository<User,Long>{
}
