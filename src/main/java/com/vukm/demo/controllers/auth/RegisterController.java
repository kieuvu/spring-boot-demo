package com.vukm.demo.controllers.auth;

import com.vukm.demo.models.User;
import com.vukm.demo.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kieuvu
 * Created on 02/09/2022.
 */

@RestController
public class RegisterController {
    private UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/register")
    public User addUser(@RequestBody User user){
         return this.userService.addUser(user);
    }
}