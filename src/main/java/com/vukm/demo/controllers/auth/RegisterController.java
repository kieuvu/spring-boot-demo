package com.vukm.demo.controllers.auth;

import com.vukm.demo.requests.user.RegisterRequest;
import com.vukm.demo.responses.ResponseDTO;
import com.vukm.demo.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
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
    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/register")
    public ResponseEntity<ResponseDTO<Object>> addUser(@RequestBody @Valid RegisterRequest data, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResponseDTO<Object> response = new ResponseDTO<>();

            bindingResult.getAllErrors().forEach((error) -> response.setData(((FieldError) error).getField(), error.getDefaultMessage()));

            response.setStatus(false);

            return ResponseEntity.badRequest().body(response);
        }
        return this.userService.addUser(data);
    }
}