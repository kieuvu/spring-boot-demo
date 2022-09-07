package com.vukm.demo.controllers.auth;

import com.vukm.demo.models.User;
import com.vukm.demo.requests.user.RegisterRequest;
import com.vukm.demo.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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
    public User addUser(@RequestBody @Valid RegisterRequest data){
         return this.userService.addUser(data);
    }
}