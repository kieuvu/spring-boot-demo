package com.vukm.demo.services;

import com.vukm.demo.models.User;
import com.vukm.demo.repositories.UserRepository;
import com.vukm.demo.requests.user.RegisterRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author kieuvu
 * Created on 02/09/2022.
 */
@Service
public class UserService {
    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User addUser(RegisterRequest data) {
            String encodedPassword = this.bCryptPasswordEncoder.encode(data.getPassword());

            User user = new User();
            user.setEmail(data.getEmail());
            user.setPassword(encodedPassword);

            return this.userRepository.save(user);
    };
}