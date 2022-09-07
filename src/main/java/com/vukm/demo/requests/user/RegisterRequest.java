package com.vukm.demo.requests.user;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author kieuvu
 * Created on 07/09/2022.
 */
@Data
public class RegisterRequest {
    @NotEmpty(message = "The email field is required.")
    @Email(message = "The email must be a valid email address.")
    private String email;

    @NotEmpty(message = "The password field is required.")
    @Min(value = 8, message = "The password must have at least 8 characters.")
    private String password;
}