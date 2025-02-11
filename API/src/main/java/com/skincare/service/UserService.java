package com.skincare.service;

import com.skincare.entity.User;
import com.skincare.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Transactional
    public String deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            return "Người dùng không tồn tại";
        }
        userRepository.deleteById(id);
        return "Người dùng đã bị xóa thành công";
    }
}
