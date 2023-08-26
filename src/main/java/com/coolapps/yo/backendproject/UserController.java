package com.coolapps.yo.backendproject;

import com.coolapps.yo.backendproject.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("/users")
@RequestMapping("/users")
public class UserController {

    List<User> users = new ArrayList<>();

    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

    @GetMapping("/")
    public List<User> getUsers() {
        return users;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") int id) {
        if (users.get(id) != null) {
            return users.get(id);
        }
        return null;
    }
}
