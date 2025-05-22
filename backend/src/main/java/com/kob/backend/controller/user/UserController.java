package com.kob.backend.controller.user;

import com.kob.backend.mapper.UserMapper;
import com.kob.backend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/all/")
    public List<User> getAll() {
        return userMapper.selectList(null);
    }

    @GetMapping("/user/{userId}/")
    public User getUser(@PathVariable int userId) {
        return userMapper.selectById(userId);
    }

    @GetMapping("/user/add/{id}/{username}/{password}/")
    public String addUser(@PathVariable int id,
                          @PathVariable String username,
                          @PathVariable String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(password);
        User user = new User(id, username, encodedPassword);
        userMapper.insert(user);
        return "Added user " + username + " with id " + id + " and password " + password;
    }

    @GetMapping("/user/del/{id}/")
    public String delUser(@PathVariable int id) {
        userMapper.deleteById(id);
        return "Del user " + id + "Successfully";
    }
}
