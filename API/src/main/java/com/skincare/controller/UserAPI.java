package com.skincare.controller;

import com.skincare.entity.User;
import com.skincare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserAPI {
    @Autowired
    private UserService  userService;
    @GetMapping ("")

    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        String message = userService.deleteUser(id);
        if (message.equals("Người dùng không tồn tại")) {
            return ResponseEntity.status(404).body(message);
        }
        return ResponseEntity.ok(message);
    }
}
