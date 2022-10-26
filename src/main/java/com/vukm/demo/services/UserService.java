package com.vukm.demo.services;

import com.vukm.demo.models.User;
import com.vukm.demo.repositories.UserRepository;
import com.vukm.demo.requests.user.RegisterRequest;
import com.vukm.demo.responses.ResponseDTO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author kieuvu
 * Created on 02/09/2022.
 */
@Service
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public ResponseDTO addUser(RegisterRequest data) {
        ResponseDTO response = new ResponseDTO();

        if (userRepository.existsByEmail(data.getEmail())) {
            response.setData("email", "Email was existed, please choose another.");
            response.setStatus(false);
            return response;
        }

        User user = new User();
        user.setEmail(data.getEmail());
        user.setPassword(this.bCryptPasswordEncoder.encode(data.getPassword()));

        this.userRepository.save(user);

        response.setData("user", user);
        response.setStatus(true);

        return response;
    }

}